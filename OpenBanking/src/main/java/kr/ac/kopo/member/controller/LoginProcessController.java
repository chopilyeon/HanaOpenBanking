package kr.ac.kopo.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.kopo.bank.service.BankService;
import kr.ac.kopo.bank.vo.BankVO;
import kr.ac.kopo.controller.Controller;
import kr.ac.kopo.member.service.MemberService;
import kr.ac.kopo.member.vo.MemberVO;

public class LoginProcessController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		request.setCharacterEncoding("utf-8");
		
		String kakaoName = request.getParameter("kakaoName");
		
		MemberVO userVO;
		MemberVO kakaoVO = new MemberVO(); 
		
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		
		System.out.println("id :" +id);
		System.out.println("password :"+ password);
		
		MemberVO memberVO = new MemberVO(id,password);
	
		
		MemberService memberService = new MemberService();
		BankService bankService = new BankService();
		
		if(kakaoName==null) {
			userVO = memberService.login(memberVO);
			System.out.println("카카오 안들어왔다");
		}else {
			userVO = memberService.APILogin(kakaoName);
			kakaoVO = memberService.APILogin(kakaoName);
			System.out.println("카카오 들어왔다");
		}
		
		BankVO bankVO = new BankVO(userVO.getPhoneNumber());
		
		List<BankVO> bankList=bankService.checkAccount(bankVO);
		
		if(userVO != null && kakaoName == null) {
			HttpSession session = request.getSession();
			session.setAttribute("userVO",userVO);
			request.setAttribute("bankList", bankList);
			System.out.println(userVO.toString());
			System.out.println("kakaoVO가 null인 곳이다!!");
			return "redirect:/welcome.do";
		}else if(userVO !=null  && kakaoName != null){		
			HttpSession session = request.getSession();			
			session.setAttribute("kakaoVO", kakaoVO);
			session.setAttribute("userVO",userVO);
			request.setAttribute("bankList", bankList);
			System.out.println(userVO.toString());			
			System.out.println("kakaoVO 가 null이 아닌 곳이다!!");
			return "redirect:/welcome.do";
		}else {	
			return "redirect:/loginFail.do";
		}
		
	}
		
		
}

