package com.example.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.domain.MemberVO;
import com.example.demo.mapper.MemberMapper;

@Service("com.example.demo.service.MemberService")
public class MemberService {

	// Mapper 의존성 주입
	@Resource(name = "com.example.demo.mapper.MemberMapper")
	MemberMapper memberMapper;

	// 로그인 체크
	public MemberVO memberLogin(MemberVO member) throws Exception {
		return memberMapper.memberLogin(member);
	}
}
