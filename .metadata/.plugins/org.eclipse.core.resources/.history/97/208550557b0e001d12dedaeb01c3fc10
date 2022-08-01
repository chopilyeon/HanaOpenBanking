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
	 	out.println("<html>"); // out 이 통로를 통해서 html 문서를 넘기겠다는 의미임
		out.println(" <head>");
		out.println("    <title>메소드 요청방식</title>");
		out.println(" </head>");
		out.println(" <body>");
		out.println("   ========================================<br>");
		out.println("          &nbsp;&nbsp;&nbsp;출력결과<br>");
		out.println("  파라미터(id):"+"<br>");
		out.println("  요청방식:");
		out.println("  uri:"+"<br>");
		
		out.println("   ========================================<br>");

		out.println("   ========================================<br>");
		out.println(" </body>");
		out.println("</html");
	     System.out.println("안녕");
	     out.println("안녕하세요");
	    
		
		
	}
	
	

}
