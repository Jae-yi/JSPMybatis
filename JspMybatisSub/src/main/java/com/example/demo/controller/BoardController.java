package com.example.demo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.BoardVO;
import com.example.demo.service.BoardService;

@Controller // 컨트롤러 빈으로 등록
public class BoardController {

	@Resource(name = "com.example.demo.service.BoardService") // Service 의존성 주입
	BoardService mBoardService;

	@RequestMapping("/list") // 게시판 리스트 화면 호출
	private String boardList(Model model) throws Exception {

		model.addAttribute("list", mBoardService.boardListService());

		return "board/list";
	}

	@RequestMapping("/detail/{bno}") // 게시판 상세페이지 호출
	private String boardDetail(@PathVariable int bno, Model model) throws Exception {

		model.addAttribute("detail", mBoardService.boardDetailService(bno));

		return "board/detail";
	}

	@RequestMapping("/insert") // 게시글 작성폼 호출
	private String boardInsertForm() {

		return "board/insert";
	}

	@RequestMapping("/insertProc")
	private String boardInsertProc(HttpServletRequest request) throws Exception {

		BoardVO board = new BoardVO();

		board.setSubject(request.getParameter("subject"));
		board.setContent(request.getParameter("content"));
		board.setWriter(request.getParameter("writer"));

		mBoardService.boardInsertService(board);

		return "redirect:/list";
	}

	@RequestMapping("/update/{bno}") // 게시글 수정폼 호출
	private String boardUpdateForm(@PathVariable int bno, Model model) throws Exception {

		model.addAttribute("detail", mBoardService.boardDetailService(bno));

		return "board/update";
	}

	@RequestMapping("/updateProc")
	private String boardUpdateProc(HttpServletRequest request) throws Exception {

		BoardVO board = new BoardVO();

		board.setSubject(request.getParameter("subject"));
		board.setContent(request.getParameter("content"));
		board.setBno(Integer.parseInt(request.getParameter("bno")));

		mBoardService.boardUpdateService(board);

		return "redirect:/detail/" + request.getParameter("bno");
	}

	@RequestMapping("/delete/{bno}")
	private String boardDelete(@PathVariable int bno) throws Exception {

		mBoardService.boardDeleteService(bno);

		return "redirect:/list";
	}
}
