package com.itwillbs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



//@Controller : 해당클래스를 컨트롤러로 동작하게 설정 (servlet-context.xml 빈으로 등록한다는 뜻)
@Controller
public class SampleController1 {
	
	private static final Logger log = LoggerFactory.getLogger(SampleController1.class);
	
	// **** 메서드의 리턴타입이 void일때 해당주소.jsp 페이지 호출
	
	// http://localhost:8088/web/doA.me (가상주소)
	//@RequestMapping("/doA.me") : 특정 URI와 특정 메서드를 연결
	//@RequestMapping(value = "주소",method = RequestMethod.GET) get방식이 기본호출 방식(생략가능)
	//@GetMapping(value = "주소" )
	//@RequestMapping("/doA.me") // 주소 매핑, 
	
	// http://localhost:8088/web/doA?id=itwill 이런식으로 uri를 컨트롤 클릭해야함
	@RequestMapping("/doA") // 주소 매핑, 
	public void doA(@ModelAttribute("id") String id) {
		log.info(" /doA 주소 호출 , doA() 호출 ");
		log.info(" @@@@@@@@@@@@@@@@@@@@@@@@@ ");
	}
	
	// http://localhost:8088/web/doA1 
	@RequestMapping("/doA1") // 주소 매핑, 
	public void doA1() {
		log.info(" /doA1 주소 호출 , doA1() 호출 ");
	}
	// http://localhost:8088/web/doA2 
	@RequestMapping("/doA2") // 주소 매핑, 
	public void doA2() {
		log.info(" /doA2 주소 호출 , doA2() 호출 ");
	}
	
	
	
	
	
	
	
	
	
}//
