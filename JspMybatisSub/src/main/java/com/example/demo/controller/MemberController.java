package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.example.demo.service.MemberService;

@Controller // 컨트롤러 빈으로 등록
public class MemberController {
	@Resource(name = "com.example.demo.service.MemberService") // Service 의존성 주입
	MemberService memberService;
}
