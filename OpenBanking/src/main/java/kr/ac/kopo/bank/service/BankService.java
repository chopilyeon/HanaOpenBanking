package kr.ac.kopo.bank.service;

import java.util.List;
import java.util.Map;

import kr.ac.kopo.bank.dao.BankDAO;
import kr.ac.kopo.bank.vo.BankVO;

public class BankService {
	
	private BankDAO bankDao;

	
	
	public void insertAccount(BankVO bankvo) {
		bankDao=new BankDAO();
		bankDao.insertAccount(bankvo);
		
	}
	
	
	public List<BankVO> checkAccount(BankVO bankVO){
		bankDao=new BankDAO();
		List<BankVO> list = bankDao.checkAccount(bankVO);
		System.out.println("list :"+list);
		
		return list;
		
	}

	public BankVO checkAccountBANK(String accountNumber) {
		bankDao=new BankDAO();
		BankVO userVO = bankDao.checkAccountBANK(accountNumber);
		
		return userVO;
	}
	

	public BankVO checkAccountBKBANK(String AccountNumber) {
		bankDao=new BankDAO();
		BankVO userVO = bankDao.checkAccountBKBANK(AccountNumber);
		
		return userVO;
	}
	
	
	/*
	 * public String checkAccountJBBANK(String accountNumber) { String
	 * bankCode=bankDao.checkAccountBKBANK(accountNumber);
	 * 
	 * return bankCode; }
	 * 
	 * 
	 * public String checkAccountJHBANK(String accountNumber) { String
	 * bankCode=bankDao.checkAccountBKBANK(accountNumber);
	 * 
	 * return bankCode; }
	 */

	
	public BankVO checkBankName(String bankCode) {
		bankDao=new BankDAO();
		BankVO userVO = bankDao.checkBankName(bankCode);
 
 		return userVO; 
	}

	
		
	
	public void transferToOtherAccountAtWithrawal(Map map) {
		bankDao=new BankDAO();
		bankDao.transferToOtherAccountAtWithrawal(map);	
	}
	
	
	
	public void transferToOtherAccountAllDifferent(Map map) {
		bankDao=new BankDAO();
		bankDao.transferToOtherAccountAllDifferent(map);
		
	}
	

	public void transferToOtherAccountAllSame(Map map) {
		bankDao=new BankDAO();
		bankDao.transferToOtherAccountAllSame(map);	
	}
	

	public void transferToOtherAccountAtDeposit(Map map) {
		bankDao=new BankDAO();
		bankDao.transferToOtherAccountAtDeposit(map);	
	}
	
	
	
	
}
