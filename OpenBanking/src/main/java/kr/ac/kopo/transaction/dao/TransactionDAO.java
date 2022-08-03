package kr.ac.kopo.transaction.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;

import kr.ac.kopo.MyConfig;

public class TransactionDAO {
	private SqlSession session;
	
	
	public TransactionDAO() {
		session  = new MyConfig().getInstance();
		System.out.println("session : "+ session);
	}
	
	public List<Map<String, Object>> checkoutDepositTransaction(String DepositPhoneNumber) {	 		
			 
		// List<TransactionVO> transactionList = session.selectList("dao.TransactionDAO.checkTransaction",phoneNumber);	 
		 List<Map<String, Object>> depositTransactionList = session.selectList("dao.TransactionDAO.checkDepositTransaction",DepositPhoneNumber);	 
		 System.out.println(depositTransactionList.toString());
		 
		 
		
		 for(Map<String, Object> data : depositTransactionList) {
			 Set<String> keys = data.keySet();
			 for(String key : keys) {
				 System.out.println(key + " : " + data.get(key));
			 }
		 }
		 
		 
		 return depositTransactionList;	 
	}
	
	
	public List<Map<String, Object>> checkoutWithrawalTransaction(String withrawalPhoneNumber) {	 		
			 
		// List<TransactionVO> transactionList = session.selectList("dao.TransactionDAO.checkTransaction",phoneNumber);	 
		 List<Map<String, Object>> withrawalTransactionList = session.selectList("dao.TransactionDAO.checkWithrawalTransaction",withrawalPhoneNumber);	 
		 System.out.println(withrawalTransactionList.toString());
		 
		 
		
		 for(Map<String, Object> data : withrawalTransactionList) {
			 Set<String> keys = data.keySet();
			 for(String key : keys) {
				 System.out.println(key + " : " + data.get(key));
			 }
		 }
		 
		 
		 return withrawalTransactionList;	 
	}
	
	public List<Map<String,Object>> showDepositTransactionHistory(String phoneNumber){
		
		List<Map<String,Object>> depositTransactionHistory = session.selectList("dao.TransactionDAO.showDepositTransactionHistory", phoneNumber); 
		
		return depositTransactionHistory;
		
	}
	
	public List<Map<String,Object>> showWithdrawalTransactionHistory(String phoneNumber){
		
		List<Map<String,Object>> withdrawalTransactionHistory = session.selectList("dao.TransactionDAO.showWithdrawalTransactionHistory", phoneNumber); 
		
		return withdrawalTransactionHistory;
		
	}
	
	
	
}


