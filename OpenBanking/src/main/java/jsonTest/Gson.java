package jsonTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Gson extends HttpServlet{
	
	public void init(ServletConfig config) throws ServletException{
		System.out.println("init(): 최초 한번만 실행되는 메소드입니다.");
		
	}
	//요청을 처리하는 부분과 응답을 처리하는부분임
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		System.out.println("service(): 실제 작업이 수행되는 메소드입니다. 요청이 들어올때마다 호출됩니다.");
		
		   
	    PrintWriter out=response.getWriter(); 
	    if(request.getParameter("term").equals("1개월")) {
	    
	    	
	    	
	    }else if(request.getParameter("term").equals("3개월")){
	    
	    	
	    	
	    }else if(request.getParameter("term").equals("1년")) {
	    
	    	
	    	
	    }
	    
	 		    
		
		
	}
	
	

}
