package kr.ac.kopo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.kopo.board.service.BoardService;
import kr.ac.kopo.board.vo.BoardVO;

public class BoardDetailController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		request.setCharacterEncoding("utf-8");
		BoardService boardService = new BoardService();

		int parentNum =Integer.parseInt(request.getParameter("parentNum"));
		int subNum =Integer.parseInt(request.getParameter("subNum"));
		System.out.println("subNum :"+subNum);
		
		BoardVO boardVO = new BoardVO();
		boardVO.setParentNum(parentNum);
		boardVO.setSubNum(subNum);
		System.out.println(boardVO);
		
		boardService.plusView(boardVO);
		
		
		List<BoardVO> boardDetailList = boardService.selectBoardByNo(parentNum);
		
		
		
		
		request.setAttribute("boardDetailList",boardDetailList);
		
		
		
		

		
		return "/jsp/board/detail.jsp";
	}

}
