package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspTest {
	@RequestMapping("/")
	private String jspTest() {
		return "/page/login"; // 생성한 jsp 파일명
	}
	
	@RequestMapping("/main")
	private String jspMain() {
		return "/page/main"; // 생성한 jsp 파일명
	}
	
	@RequestMapping("/register")
	private String jspRegister() {
		return "/page/register"; // 생성한 jsp 파일명
	}
}
