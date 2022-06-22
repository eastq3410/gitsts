package com.itwillbs.service;

import java.util.List;

import com.itwillbs.domain.MemberVO;

public interface MemberService {
	// 회원가입
	public void memberInsert(MemberVO vo);
    //public void kakaoInsertInsert(MemberVO vo);
	//public void naverInsert(MemberVO vo);
	
	// 로그인 
	public MemberVO loginCheck(MemberVO vo);
	//public MemberVO loginCheck(String userid,String userpw);
	
	// 회원정보 조회
	public MemberVO getMember(String userid);
	
	// 회원정보 수정
	public Integer updateMember(MemberVO vo);
	
	// 회원정보 삭제
	public void deleteMember(MemberVO vo);
	
	// 회원목록 조회
	public List<MemberVO> getMemberList(String userid);
	
	
	
	
}
