package kr.ac.kopo.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.ac.kopo.MyConfig;
import kr.ac.kopo.board.vo.BoardVO;

public class BoardDAO {
	private SqlSession session;
	
	public BoardDAO() {
		session  = new MyConfig().getInstance();
		System.out.println("session : "+ session);
	}
	
	
	public void insertBoard(BoardVO boardVO) {
		
		
		session.insert("dao.BoardDAO.insertBoard",boardVO);
		session.commit();

		System.out.println("삽입 완료");
	}

	public void insertSubBoard(BoardVO boardVO) {
		
		session.insert("dao.BoardDAO.insertSubBoard",boardVO);
		session.commit();
	}
	
	
	
	public List<BoardVO> selectAllBoard() {
		List<BoardVO> boardList = session.selectList("dao.BoardDAO.selectAllBoard");
		
		for(BoardVO board:boardList) {
			System.out.println(board);
		}
		
		return boardList;
	}	
	
	public List<BoardVO> selectBoardByNo(int boardNum) {
		List<BoardVO> boardList= session.selectList("dao.BoardDAO.selectBoardByNo",boardNum);
		
		return boardList;
		
	}
	public int selectMaxSub(int boardNum) {
		int maxSubNum = session.selectOne("dao.BoardDAO.selectMaxSub",boardNum);
		
		return maxSubNum;
	}
	
	public void plusView(BoardVO boardVO) {
		session.update("dao.BoardDAO.plusView",boardVO);
		session.commit();
		
		
	}
	
	public int countBoard() {
		
		int count = session.selectOne("dao.BoardDAO.countBoardNum");
		return count;
	}
	
	public List<BoardVO> ajaxBoard(int displayPage) {
		
		List<BoardVO> list = session.selectList("dao.BoardDAO.ajaxBoard",displayPage);
		return list;
	}
	
	public List<BoardVO> ajaxList(int ajaxNumber){
		
		List<BoardVO> list = session.selectList("dao.BoardDAO.ajaxRowNum",ajaxNumber);
		return list;
	}
		
	
	
	

}
