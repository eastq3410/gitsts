package com.itwillbs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController2 {
	
	private static final Logger log = LoggerFactory.getLogger(SampleController2.class);
	
	// * 메서드의 리턴타입이 String인 경우 리턴된 문자열.jsp 페이지 호출
	
	
	//http://localhost:8088/web/doB
	@RequestMapping(value = "/doB",method = RequestMethod.GET)
	public String doB() {
		log.info("doB호출 , 주소 : /doB");
		
		
		//return "";
		return "itwill";
	}
	
	// '/web/doB1' 주소 호출시 -> itwillbs.jsp 출력 
	
	
	//http://localhost:8088/web/doB1
	@RequestMapping(value = "/doB1",method = RequestMethod.GET) // 메서드 이름과 주소,리턴값과 아무연관 없음
	public String doBB() {
		log.info("doBB호출 , 주소 : /doB1");
		
		log.info(" 주소 호출과 메서드명은 상관없음. (메서드는 동작의 의미를 표현)");
		log.info(" 리턴시 찾고자하는 뷰페이지 이름만 리턴");
		log.info("리턴한 문자열.jsp페이지로 자동 연결 ");
		
		return "itwillbs";
	  //return "itwillbs.jsp"; (x)
	}
	
	
	//'doB2' -> itwillbs.jsp
	
	//http://localhost:8088/web/doB2
	//http://localhost:8088/web/doB2?id=itwill
	@RequestMapping(value = "/doB2",method = RequestMethod.GET) // 메서드 이름과 주소,리턴값과 아무연관 없음
	public String doB2( @ModelAttribute("id") String id) { // String id 에 저장
		//  @ModelAttribute("id") String id
		// => 페이지 요청시 이름에 해당하는 정보(파라미터)를 저장 & 연결된 view로 전달
		log.info("doB2호출 , 주소 : /doB2");
		log.info("itwillbs.jsp 페이지 이동 ");
		
		log.info("id : "+id);
		
		return "itwillbs";
	
	}
	
	
	//'doB3' -> itwillbs.jsp    "이름 : 김학생, 전화번호 : 010-1234-1234"
	// 컨트롤러(log)/화면 모두 출력
	
	//http://localhost:8088/web/doB3?name=김학생&tel=010-1234-1234
	@RequestMapping(value = "/doB3",method = RequestMethod.GET) // 메서드 이름과 주소,리턴값과 아무연관 없음
	public String doB3( @ModelAttribute("name") String name,@ModelAttribute("tel") String tel) { 
		log.info("doB3호출 , 주소 : /doB3");
		log.info("name : "+name);
		log.info("tel : "+tel);
		return "itwillbs";
	}
	
	
}
