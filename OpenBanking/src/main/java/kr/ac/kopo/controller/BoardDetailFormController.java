package kr.ac.kopo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.kopo.board.service.BoardService;
import kr.ac.kopo.board.vo.BoardVO;

public class BoardDetailFormController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		request.setCharacterEncoding("utf-8");
		StringBuilder stb = new StringBuilder();
		
		String id = request.getParameter("id");
		String content = request.getParameter("content");
		String title = request.getParameter("title");	
		int parentNum = Integer.parseInt(request.getParameter("parentNum"));
		System.out.println("boardNum:"+parentNum);
		
		
		BoardService boardService = new BoardService();
		
		int maxSubNum = boardService.selectMaxSub(parentNum);
		
		for(int i=0;i<maxSubNum;i++) {
			stb.append(" ");
		}
	

			
		stb.append("└");
	
		
		
		stb.append(title);
		
		
		BoardVO boardVO = new BoardVO();
		boardVO.setContent(content);
		boardVO.setId(id);
		boardVO.setParentNum(parentNum);
		boardVO.setSubNum(maxSubNum+1);
		boardVO.setTitle(stb.toString());
		
		boardService.insertSubBoard(boardVO);
		
		List<BoardVO> boardDetailList= boardService.selectBoardByNo(parentNum);
	
		request.setAttribute("boardDetailList", boardDetailList);
		
		
		return "/jsp/board/detail.jsp";
	}

}
