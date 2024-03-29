package kr.ac.kopo.bank.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.kopo.bank.service.BankService;
import kr.ac.kopo.controller.Controller;
import kr.ac.kopo.member.vo.MemberVO;

public class TransferToAnotherProcessingController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		BankService bankService = new BankService();
		 
		 
		HttpSession session = request.getSession();
		    
		MemberVO memberVO=(MemberVO)session.getAttribute("userVO");
		    
		String withrawalPhoneNumber = memberVO.getPhoneNumber();	
		String withrawalBankName;
		String depositBankCode;
		String withrawalBankCode = "20";
		String depositBankName = request.getParameter("depositBankName");
		String depositAccountNumber = request.getParameter("depositAccountNumber");	
		String withrawalAccountNumber = request.getParameter("withrawalAccountNumber");	
		String tranAmount = request.getParameter("tranAmount");	
		String depositName = request.getParameter("depositName");
		String withrawalName = request.getParameter("withrawalName");
		String depositPhoneNumber = request.getParameter("depositPhoneNumber");
		

		if(bankService.checkAccountBANK(withrawalAccountNumber)!=null) {
			withrawalBankCode=bankService.checkAccountBANK(withrawalAccountNumber).getBankCode();		
		};
		
		if(bankService.checkAccountBKBANK(withrawalAccountNumber)!=null) {
			withrawalBankCode=bankService.checkAccountBKBANK(withrawalAccountNumber).getBankCode();		
		};

		if(bankService.checkAccountJBBANK(withrawalAccountNumber)!=null) {
			withrawalBankCode=bankService.checkAccountJBBANK(withrawalAccountNumber).getBankCode();		
		};

		if(bankService.checkAccountJHBANK(withrawalAccountNumber)!=null) {
			withrawalBankCode=bankService.checkAccountJHBANK(withrawalAccountNumber).getBankCode();		
		};
		
		
		
		
		
		
		
	
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss yyyy-MM-dd");

		String tranDate = formatter.format(date).toString();
		System.out.println(formatter.format(date));

		
		
		if(depositBankName.equals("BK_BANK")) {
			depositBankCode="2";
		}else if(depositBankName.equals("BERRY_BANK")) {
			depositBankCode="14";		
		}else if(depositBankName.equals("JH_BANK")) {
			depositBankCode="9";			
		}else if(depositBankName.equals("쫑쫑뱅크")){
			depositBankCode="3000";
		}else {
			depositBankCode="20";
		}
		
		
		withrawalBankName = bankService.checkBankName(withrawalBankCode).getBankName();
		
		
		
		
		
		
		 Map<String,String> map = new HashMap<>();
		 
		 map.put("withrawalBankName", withrawalBankName);
		 map.put("withrawalBankCode", withrawalBankCode);
		 map.put("depositBankName", depositBankName);
		 map.put("depositBankCode", depositBankCode);
		 map.put("depositAccountNumber", depositAccountNumber);
		 map.put("withrawalAccountNumber", withrawalAccountNumber);
		 map.put("withrawalName", withrawalName);
		 map.put("depositName",depositName);
		 map.put("tranAmount", tranAmount);
		 map.put("withrawalPhoneNumber", withrawalPhoneNumber);
		 map.put("depositPhoneNumber",depositPhoneNumber);
		 
		
		 
		 
		
			

		if(withrawalBankCode.equals("20")&&depositBankCode.equals("20")) {
			bankService.transferToOtherAccountAllSame(map);
		}else if(withrawalBankCode.equals("20")&&!depositBankCode.equals("20")){
			bankService.transferToOtherAccountAtDeposit(map);	
		}else if(!withrawalBankCode.equals("20")&&depositBankCode.equals("20")){
			bankService.transferToOtherAccountAtWithrawal(map);
		}else{
			bankService.transferToOtherAccountAllDifferent(map);
		}
			 
		
		request.setAttribute("withrawalName", withrawalName);	
		request.setAttribute("depositName", depositName);
		request.setAttribute("tranDate",tranDate);
		request.setAttribute("tranAmount", tranAmount);
		
		
		
		return "/jsp/welcome/welcomeTransfer.jsp";
	}

}
