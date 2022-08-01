package kr.ac.kopo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.kopo.board.service.BoardService;
import kr.ac.kopo.board.vo.BoardVO;

public class BoardAjaxController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		
		

		
		BoardService boardService = new BoardService();
		int count = boardService.countBoard();
		List<BoardVO> boardList = boardService.selectAllBoard();
		
		List<BoardVO> ajaxList = boardService.ajaxList(1);
		
		

		request.setAttribute("ajaxList", ajaxList);
		System.out.println("ajaxList"+ ajaxList);
		

		request.setAttribute("count", count);
		System.out.println("count"+ count);
		
		
		
		
		
		
		
		
		return "/jsp/board/ajaxBoard.jsp";
	}

}
