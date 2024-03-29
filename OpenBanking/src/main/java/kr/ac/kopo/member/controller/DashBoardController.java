package kr.ac.kopo.member.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.kopo.bank.service.BankService;
import kr.ac.kopo.bank.vo.BankVO;
import kr.ac.kopo.controller.Controller;
import kr.ac.kopo.member.vo.MemberVO;
import kr.ac.kopo.transaction.Service.TransactionService;

public class DashBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		TransactionService transactionService = new TransactionService();
		BankService bankService = new BankService();
		
		MemberVO MemberVO = (MemberVO)session.getAttribute("userVO");
		BankVO userVO=new BankVO(MemberVO.getPhoneNumber());


		List<Map<String, Object>> depositTransactionList = transactionService.checkoutDepositTransaction(userVO.getPhoneNumber());
		List<Map<String, Object>> withrawalTransactionList = transactionService.checkoutWithrawaltTransaction(userVO.getPhoneNumber());
		
		
		
	
		List<BankVO> bankList=bankService.checkAccount(userVO);
		
		request.setAttribute("bankList", bankList);
		
		request.setAttribute("depositTransactionList", depositTransactionList);

		request.setAttribute("withrawalTransactionList", withrawalTransactionList);
		
		
		System.out.println(depositTransactionList);

		System.out.println(withrawalTransactionList);
		
		
		
		
		
		
		
		return "/jsp/board/dashboard.jsp";
		
	}

}
