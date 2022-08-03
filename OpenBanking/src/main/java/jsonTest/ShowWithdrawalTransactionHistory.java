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

public class ShowWithdrawalTransactionHistory extends HttpServlet{
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
    List<Map<String,Object>> withdrawalTransactionHistory = transactionService.checkoutWithrawaltTransaction(phoneNumber);
    
    System.out.println("withdrawal 이양" + withdrawalTransactionHistory);
    List<TransactionVO> withdrawalTranHistory = new ArrayList<>();
    
    for(int i=0 ; i<withdrawalTransactionHistory.size() ; i++) {
    	TransactionVO transactionVO = new TransactionVO();
    	transactionVO.setTranDate((String)withdrawalTransactionHistory.get(i).get("TRANDATE"));
    	transactionVO.setTranAmount(Integer.parseInt(String.valueOf(withdrawalTransactionHistory.get(i).get("TRANAMOUNT"))));
    	withdrawalTranHistory.add(transactionVO);
    	System.out.println("map이당 : "+ withdrawalTranHistory);
    }
    
    System.out.println(withdrawalTranHistory);
   
   
    Gson gson = new Gson();
    String jsonStr = gson.toJson(withdrawalTranHistory);
    
    System.out.println(jsonStr);
    
    out.println(jsonStr);
	    	
	    
	 }

}
