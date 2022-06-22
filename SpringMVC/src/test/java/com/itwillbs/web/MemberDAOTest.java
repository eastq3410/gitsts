package com.itwillbs.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.persistence.MemberDAO;
import com.itwillbs.persistence.MemberDAOImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"}
		)
public class MemberDAOTest {
	
	// 로그 객체 로그를 찍어주려면 객체 생성 해야함
	private static final Logger log = LoggerFactory.getLogger(MemberDAOTest.class);
	
	
	
	
	// MVC에서 Action페이지 역할
	
	// DAO 생성 -> 객체 주입
	
	@Inject
	private MemberDAO dao;
	// => MemberDAO dao = new MemberDAO(); (약한결합)
	
//	@Inject
//	private MemberDAOImpl daoIm;
//	// => MemberDAOImpl dao = new MemberDAOImpl(); (강한결합)
	
	//@Test
	public void DAO생성확인() {
		System.out.println(dao);
	}
	
	//@Test
	public void 시간정보가져오기() {
		System.out.println(dao.getTime());
	}
	
	//@Test
	public void 회원수조회하기() {
		System.out.println(dao.getMemberCount()+"명");
	}

	
	//@Test
	public void 회원가입() {
		MemberVO vo = new MemberVO();
		
		vo.setUserid("admin");
		vo.setUserpw("1234");
		vo.setUsername("홍길동2");
		vo.setUseremail("itwill@naver.com");
		
		log.info("회원가입 정보 : "+vo);
		
		dao.insertMember(vo);
		
		log.info("회원가입 완료@@@");
		
	}
	
	
	//@Test
	public void 로그인() {
		String userid = "itwill01";
		String userpw = "1234";
		
		MemberVO loginVO = new MemberVO();
		loginVO.setUserid(userid);
		loginVO.setUserpw(userpw);
		
		log.info(" 로그인 정보 저장완료 "+loginVO);
		log.info(" DAO 로그인호출!");
		
		dao.loginMember(loginVO);		
		
		MemberVO resultVO = dao.loginMember(loginVO);
		
		log.info("로그인 체크완료!");
		
		if(resultVO != null) {
			log.info("로그인 성공!");
		}else {
			log.info("로그인 실패!");
		}
		
	}
	
	//@Test
	public void 로그인2() {
		String userid = "itwill01";
		String userpw = "1234";
		
		//VO 객체 X => 2개의 정보가 하나의 VO안에 저장이 불가능한 경우
		// * 하나의 VO안에 저장되는 정보가 있다면 VO에 담아서 처리
		
		MemberVO resultVO = dao.loginMember(userid, userpw);
		
		if(resultVO != null) {
			log.info("로그인 성공!");
		}else {
			log.info("로그인 실패!");
		}
		
	}
	
	//@Test
	public void 회원정보_수정하기() {
		// 수정할 정보 저장
		MemberVO uvo = new MemberVO();
		uvo.setUserid("itwill01");
		uvo.setUserpw("1234");
		
		// 수정데이터
		uvo.setUsername("수정");
		uvo.setUseremail("update@naver.com");
		
		//DAO 객체
		
		dao.updateMember(uvo);
		
	}
	
	@Test
	public void 회원관리_삭제() {
		MemberVO dvo = new MemberVO();
		
		dvo.setUserid("eastq3410");
		dvo.setUserpw("1234");
		
		
		dao.deleteMember(dvo);		
	}
	
	
	
	
	
	
	
}
