package jsonTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.ac.kopo.member.service.MemberService;

public class duplicateId  extends HttpServlet{
	public void init(ServletConfig config) throws ServletException{
		System.out.println("init(): 최초 한번만 실행되는 메소드입니다.");
		
	}
	//요청을 처리하는 부분과 응답을 처리하는부분임
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		   
		

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		
	    PrintWriter out=response.getWriter(); 
	    String id_check = request.getParameter("id_check");
	    System.out.println("id_check"+ id_check);
	    
	    MemberService memberService = new MemberService();
	    String id = memberService.checkDuplicate(id_check);
	    
	    Gson gson = new Gson();
	    String jsonStr = gson.toJson(id);
	    
	    System.out.println(jsonStr);
	    
	    out.println(jsonStr);
	    	
	    
	 }
	

}
