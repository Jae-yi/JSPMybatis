package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.domain.MemberVO;
import com.example.demo.service.MemberService;

@Controller
@SessionAttributes("login")
public class MemberController {

	@Autowired
	private MemberService memberService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Map<Object, Object> login(@RequestParam("id") String id ,@RequestParam("pwd") String pwd, HttpSession session,
			Model model) throws Exception {
		
		Map<Object, Object> map = new HashMap<Object, Object>();
		MemberVO member = new MemberVO() ;
		member.setId(id) ;
		member.setPwd(pwd) ;
		
		MemberVO userInfo = memberService.memberLogin(member) ;
		
		if(userInfo != null) {
			map.put("login", true);
			map.put("id", userInfo.getId());
			map.put("nickname", userInfo.getNickname());
			session.setAttribute("login", true);
			session.setAttribute("id", userInfo.getId());
			session.setAttribute("nickname", userInfo.getNickname());
		} else {
			map.put("login", false);
		}
		
		return map;
	}


	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception {

		session.invalidate();

		return "redirect:/";
	}

}
