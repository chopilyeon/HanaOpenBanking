package jsonTest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.ac.kopo.transaction.Service.TransactionService;
import kr.ac.kopo.transaction.vo.TransactionVO;

public class ShowDepositTransactionHistory extends HttpServlet{
	public void init(ServletConfig config) throws ServletException{
		System.out.println("init(): 최초 한번만 실행되는 메소드입니다.");
		
	}
	
public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setHeader("Access-Control-Allow-Origin", "*");      
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with, origin, content-type, accept");      
		response.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,DELETE");      
		response.setHeader("Access-Control-Max-Age", "3600");
	   
		
	
		

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		
	    PrintWriter out=response.getWriter(); 
	    String phoneNumber = request.getParameter("phoneNumber");
	    TransactionService transactionService = new TransactionService();
	    List<Map<String,Object>> depositTransactionHistory = transactionService.checkoutDepositTransaction(phoneNumber);
	    System.out.println("deposit 이양 : "+ depositTransactionHistory);
	    System.out.println("map테스트중1 "+(String)depositTransactionHistory.get(0).get("TRANDATE"));
	    System.out.println("map테스트중2 "+(String)depositTransactionHistory.get(1).get("TRANDATE"));
	    
	    
	    List<TransactionVO> depositTranHistory = new ArrayList<>();
	    
	    for(int i=0 ; i<depositTransactionHistory.size() ; i++) {
	    	TransactionVO transactionVO = new TransactionVO();
	    	transactionVO.setTranDate((String)depositTransactionHistory.get(i).get("TRANDATE"));
	    	transactionVO.setTranAmount(Integer.parseInt(String.valueOf(depositTransactionHistory.get(i).get("TRANAMOUNT"))));
	    	depositTranHistory.add(transactionVO);
	    	System.out.println("map이당 :" + depositTranHistory);
	    }
	    
	    System.out.println(depositTranHistory);
	   
	    
	    
	    Gson gson = new Gson();
	    for(int i=0; i<depositTranHistory.size();i++) {

		    StringBuilder stb = new StringBuilder();
	    	stb.append(gson.toJson(depositTranHistory.get(i).getTranDate()));
	    	stb.append(gson.toJson(depositTranHistory.get(i).getTranAmount()));
	    	out.println(stb);
	    	System.out.println(stb);
	    
	    }
	    
	

	    
	 }

}
