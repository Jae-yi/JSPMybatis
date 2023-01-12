package com.example.demo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.mapper.BoardMapper;

@Controller
public class JspMybatisSubController {

	@Resource(name = "com.example.demo.mapper.BoardMapper")
	BoardMapper mBoardMapper;

	@RequestMapping("/")
	public String welcome() throws Exception {
		
		System.out.println(mBoardMapper.boardCount());
		return "/main/test"; // 생성한 JSP 파일 이름
	}
}
