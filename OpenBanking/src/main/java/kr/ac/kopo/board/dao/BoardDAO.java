package kr.ac.kopo.board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;

import kr.ac.kopo.MyConfig;
import kr.ac.kopo.board.vo.BoardVO;

public class BoardDAO {
	private SqlSession session;
	
	public BoardDAO() {
		session  = new MyConfig().getInstance();
		System.out.println("session : "+ session);
	}
	
	
	public void insert() {
		
		BoardVO board = new BoardVO();
		
		
		
		
		session.insert("dao.BoardDAO.insertBoard",board);
		//aaa,bbb,ccc 에 집어넣고 싶은 것임 ?,?,? 에 집어넣고 싶다 board 형태로 날라가게 됨 -> mapping을 시켜줘야함. 
		session.commit();
		//autocommit이 아니므로 저렇게 commit해줘야함. 
		System.out.println("삽입 완료");
	}

	public void select() {
		//BoardVO board = session.selectOne("dao.BoardDAO.selectAllBoard");
		//갖고온 행이  몇개든지 1개만 갖고오게 됨 return type은 object임. 
		List<BoardVO> boardList = session.selectList("dao.BoardDAO.selectAllBoard2");
		
		
		for(BoardVO board:boardList) {
			System.out.println(board);
		}
		
	}	
	
	public void selectOne() {
		//33번 게시물 조회
		BoardVO vo = new BoardVO();
	
		BoardVO board = session.selectOne("dao.BoardDAO.selectByNo3", vo);
		System.out.println(board);
		
		
	}
	
	public void selectWhere() {
		//제목이 "제목"으로 시작하는 게시물 조회 
		
		List<BoardVO> list = session.selectList("dao.BoardDAO.selectWhere","제목");
		for(BoardVO vo : list) {
			System.out.println(vo);
		}
	}
	public void selectWhere2() {
		
		BoardVO vo = new BoardVO();
		vo.setTitle("mybatis 삽입");	
		List<BoardVO> list = session.selectList("dao.BoardDAO.selectWhere2",vo);
		for(BoardVO board:list) {
			System.out.println(board);
		}
		
	}
	
	public void selectNos() {
		int [] nos = {1,2,6,10,15,19,24,30,33};
		
		BoardVO vo = new BoardVO();
		List<BoardVO> list = session.selectList("dao.BoardDAO.selectNos2", nos);
		
		for(BoardVO board:list) {
			System.out.println(board);
		}
		
	}
	
	void selectMap() {
		
		Map<String, String> map = new HashMap();
		map.put("title", "mybatis 삽입");
		map.put("writer","user");
		
		List<BoardVO> list = session.selectList("dao.BoardDAO.selectMap",map);
		
		for(BoardVO board : list) {
			System.out.println(board);
		}
		
	}
	
	
	void selectMap2() {
	
		Map<String,Object> board = session.selectOne("dao.BoardDAO.selectMap2",23);
		System.out.println(board);
		Set<String> keys = board.keySet();
		
		for(String key:keys) {
			System.out.println(key+":"+board.get(key));
		}
		
	}
	
	
	public void work() {
		//insert();
		select();
		//selectOne();
		//selectWhere2();
		//selectNos();
		//map으로도 한번 해보자 
		//selectMap();
		
		
	}
	
	

}
