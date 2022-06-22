package com.itwillbs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SampleController4 {
	
	private static final Logger log = LoggerFactory.getLogger(SampleController4.class);
	
//	//http://localhost:8088/web/doD?msg=hello
//	@RequestMapping(value = "/doD")
//	public String doD(@ModelAttribute("msg") String msg) {
//		log.info("doD()호출 !!!!!!");
//		
//		String msg1 = "TestMsg";
//		
//		//return "/doE"; 그냥 뷰페이지를 보여주는거임
//		return "redirect:/doE"; // 공백은 넣으면안됨 *주의* 주소바뀌며 페이지전환
//		//return "forward:/doE"; // 공백은 넣으면안됨 *주의*  주소 안바뀌고 페이지 전환
//	}

	
	
//	//http://localhost:8088/web/doD?msg=hello
//	//http://localhost:8088/web/doD
//	@RequestMapping(value = "/doD")
//	public String doD(Model model,@ModelAttribute("msg") String msg) { // @ModelAttribute("msg") String msg 받아온정보를 다시 저장해서 넘기기
//		log.info("doD()호출 !!!!!!");
//		
//		model.addAttribute("msg", msg);
//		
//		return "redirect:/doE"; 
//	}

	
	//http://localhost:8088/web/doD?msg=hello
	//http://localhost:8088/web/doD
	@RequestMapping(value = "/doD")
	public String doD(RedirectAttributes rttr) { // RedirectAttributes : 리다이랙트 이동 할때만 사용가능 ,새로고침하면 데이터 사라짐 한번만쓸수있단의미
		log.info("doD()호출 !!!!!!");
		
		//model.addAttribute("msg", msg);
		rttr.addFlashAttribute("msg", "test1234");
		
		return "redirect:/doE"; 
	}
	
	
	//model.addAttribute();
	//=> Model 객체 사용, URI에 파라미터 표시됨, F5(새로고침)시 데이터 유지
	//rttr.addFlashAttribute();
	// => RedirectAttributes 객체 사용, URI에 파라미터 표시안됨, F5(새로고침)시 데이터 사라짐(1회성)
	// => redirect 동작시에만 사용!!
	
	
	
	
	
	
	
	
	//http://localhost:8088/web/doE
	@RequestMapping(value = "/doE")
	public void doE(@ModelAttribute("msg") String msg) {
		log.info("doE()호출 !!!!!!");
		log.info(msg);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}//
