package kr.ac.kopo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.kopo.board.service.BoardService;
import kr.ac.kopo.board.vo.BoardVO;

public class BoardWriteProcessController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {


		request.setCharacterEncoding("utf-8");
		
			String id = request.getParameter("id");
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			System.out.println(id);
			
			BoardVO boardVO = new BoardVO();
			boardVO.setId(id);
			boardVO.setTitle(title);
			boardVO.setContent(content);
			
			BoardService boardService = new BoardService();
			
			
			boardService.insertBoard(boardVO);
			
			
			
		
		
		
		return "redirect:/board/list.do";
	}

}
