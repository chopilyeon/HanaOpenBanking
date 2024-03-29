package kr.ac.kopo.transaction.Service;

import java.util.List;
import java.util.Map;

import kr.ac.kopo.transaction.dao.TransactionDAO;

public class TransactionService {
	private TransactionDAO transactionDao;
	
	public TransactionService() {
		transactionDao = new TransactionDAO();
	}
	
	
	public List<Map<String, Object>> checkoutDepositTransaction(String depositPhoneNumber){
		
		List<Map<String, Object>> depositTransactionList = transactionDao.checkoutDepositTransaction(depositPhoneNumber);
		return depositTransactionList;
	}

	public List<Map<String, Object>> checkoutWithrawaltTransaction(String withrawalPhoneNumber){
		
		List<Map<String, Object>> withrawalTransactionList = transactionDao.checkoutWithrawalTransaction(withrawalPhoneNumber);
		return withrawalTransactionList;
	}
	
	public List<Map<String,Object>> showWithdrawalTransactionHistory(String phoneNumber){
		List<Map<String,Object>> withdrawalTransactionHistory = transactionDao.checkoutWithrawalTransaction(phoneNumber);
		return withdrawalTransactionHistory;
	}
	
	public List<Map<String,Object>> showDepositTransactionHistory(String phoneNumber){
		List<Map<String,Object>> depositTransactionHistory = transactionDao.checkoutDepositTransaction(phoneNumber);
		return depositTransactionHistory;
	}
	
	
	
	
	
	
}