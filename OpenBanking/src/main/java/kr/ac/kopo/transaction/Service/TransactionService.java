package kr.ac.kopo.transaction.Service;

import java.util.List;
import java.util.Map;

import kr.ac.kopo.transaction.dao.TransactionDAO;

public class TransactionService {
	private TransactionDAO transactionDao;
	
	public TransactionService() {
		transactionDao = new TransactionDAO();
	}
	
	
	public List<Map<String, Object>> checkoutTransaction(String phoneNumber){
		
		List<Map<String, Object>> transactionList = transactionDao.checkoutTransaction(phoneNumber);
		return transactionList;
	}
	
	
	
}