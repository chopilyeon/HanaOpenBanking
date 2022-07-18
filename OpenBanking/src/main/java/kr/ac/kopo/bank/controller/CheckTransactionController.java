package kr.ac.kopo.bank.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.kopo.controller.Controller;
import kr.ac.kopo.member.vo.MemberVO;
import kr.ac.kopo.transaction.Service.TransactionService;
import kr.ac.kopo.transaction.vo.TransactionVO;

public class CheckTransactionController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		TransactionService transactionService = new TransactionService();
		
		HttpSession session = request.getSession();
		MemberVO userVO = (MemberVO)session.getAttribute("userVO");
		
		List<TransactionVO> transactionList = transactionService.checkoutTransaction(userVO.getPhoneNumber());
		
		
		request.setAttribute("transactionList", transactionList);
		
		System.out.println(transactionList);
		
		return "/jsp/transaction/checkTransaction.jsp";
	}

}
