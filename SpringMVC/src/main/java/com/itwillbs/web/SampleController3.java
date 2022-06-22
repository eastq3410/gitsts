package com.itwillbs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwillbs.domain.MemberVO;

@Controller
public class SampleController3 {
	
	private static final Logger log = LoggerFactory.getLogger(SampleController3.class);
	
	//http://localhost:8088/web/doC
	@RequestMapping(value = "/doC", method = RequestMethod.GET)
	public String doC(Model model) {
		log.info("doC() 호출@@@@@@@@@@@@@@@@@@@@@@"); // 잘보이게 하기위해서 길게 써놓았음
		log.info(" 회원정보를 생성 -> memberInfo.jsp 페이지에 출력");
		
		// Model 객체 : 스프링MVC에서 기본 제공하는 클래스
		// 			  => 객체를 연결된 뷰페이지로 이동시키는 클래스(컨테이너,상자)
		
		
		MemberVO member = new MemberVO("admin","1234","관리자","admin@admin",null,null); // 생성자를 이용해 담는방식 (순서지켜야함)
		//member.setUserpw(null); set을 이용한 방식
		
		// 전달할 정보를 저장 
		//model.addAttribute("member", member);
        //model.addAttribute("이름", 값);
		// => 저장된 객체정보를 view 페이지에서 바로 사용가능
		
		//model.addAttribute("member", member); 두가지 방식이 있음
		model.addAttribute(member);
		// => 이름정보 없이 객체만 저장하는 경우,
		// 	  이름정보는 전달하는 객체의 클래스명(글자타입) 첫글자만 소문자로 바꿔서 이름으로 인식 
		//    ex) MemberVO -> memberVO,   ITWILL -> iTWILL
		
		// request.setAttribute(,);
		
		
		
		return "memberInfo";
	}
	
	
	
	
	
}
