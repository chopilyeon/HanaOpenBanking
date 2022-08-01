package kr.ac.kopo.board.service;

import java.util.List;

import kr.ac.kopo.board.dao.BoardDAO;
import kr.ac.kopo.board.vo.BoardVO;

public class BoardService {

	private BoardDAO boardDao;

	
	public List<BoardVO> selectAllBoard(){
		boardDao = new BoardDAO();
		List<BoardVO> boardList	= boardDao.selectAllBoard();
	
		
		return boardList;
	}
	
	
	public void insertBoard(BoardVO boardVO) {
		boardDao = new BoardDAO();
		boardDao.insertBoard(boardVO);
		
	}
	
	
	public List<BoardVO> selectBoardByNo(int boardNum) {
		boardDao = new BoardDAO();
		
		List<BoardVO> boardList= boardDao.selectBoardByNo(boardNum);
		
		return boardList;
	}
	
	public void insertSubBoard(BoardVO boardVO) {
		boardDao = new BoardDAO();
		boardDao.insertSubBoard(boardVO);
		
	}
	
	public int selectMaxSub(int boardNum) {
		boardDao = new BoardDAO();
		int maxSubNum= boardDao.selectMaxSub(boardNum);
		return maxSubNum;
	}
	
	public void plusView(BoardVO boardVO) {
		boardDao = new BoardDAO();
		boardDao.plusView(boardVO);
		
	}
	
	public int countBoard() {
		boardDao = new BoardDAO();
		int count = boardDao.countBoard();
		return count;
	}
	public List<BoardVO> ajaxBoard(int displayPage) {
		boardDao = new BoardDAO();
		List<BoardVO> list = boardDao.ajaxBoard(displayPage);
		return list;
	}
	
	public List<BoardVO> ajaxList(int ajaxNumber) {
		boardDao = new BoardDAO();
		List<BoardVO> list = boardDao.ajaxList(ajaxNumber);
		return list;
	}
	
	

	
	
	
}
