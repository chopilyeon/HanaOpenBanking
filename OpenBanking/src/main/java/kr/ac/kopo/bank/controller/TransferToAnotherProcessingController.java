package kr.ac.kopo.bank.controller;

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
		    
		String phoneNumber = memberVO.getPhoneNumber();	
		String withrawalBankName;
		String depositBankCode;
		String withrawalBankCode = "20";
		String depositBankName = request.getParameter("depositBankName");
		String depositAccountNumber = request.getParameter("depositAccountNumber");	
		String withrawalAccountNumber = request.getParameter("withrawalAccountNumber");	
		String tranAmount = request.getParameter("tranAmount");	
		String depositName = request.getParameter("depositName");
		String withrawalName = request.getParameter("withrawalName");
		

		if(bankService.checkAccountBANK(withrawalAccountNumber)!=null) {
			withrawalBankCode=bankService.checkAccountBANK(withrawalAccountNumber).getBankCode();		
		};
		
		if(bankService.checkAccountBKBANK(withrawalAccountNumber)!=null) {
			withrawalBankCode=bankService.checkAccountBKBANK(withrawalAccountNumber).getBankCode();		
		};
		
	
		
		
		
		
		if(depositBankName.equals("BYUNGKWAN_BANK")) {
			depositBankCode="2";
		}else if(depositBankName.equals("JUNGBIN_BANK")) {
			depositBankCode="14";		
		}else if(depositBankName.equals("JIHUN_BANK")) {
			depositBankCode="9";			
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
		 map.put("phoneNumber", phoneNumber);
		
		 
		 
		
			

		if(withrawalBankCode.equals("20")&&depositBankCode.equals("20")) {
			bankService.transferToOtherAccountAllSame(map);
		}else if(withrawalBankCode.equals("20")&&!depositBankCode.equals("20")){
			bankService.transferToOtherAccountAtDeposit(map);	
		}else if(!withrawalBankCode.equals("20")&&depositBankCode.equals("20")){
			bankService.transferToOtherAccountAtWithrawal(map);
		}else{
			bankService.transferToOtherAccountAllDifferent(map);
		}
			 
		
		
		
		
		
		return "redirect:/jsp/welcome/welcomeTransfer.jsp";
	}

}
