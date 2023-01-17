package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.domain.BoardVO;
import com.example.demo.mapper.BoardMapper;

@Service("com.example.demo.service.BoardService")
public class BoardService {
	
	// Mapper 의존성 주입
	@Resource(name = "com.example.demo.mapper.BoardMapper")

	BoardMapper mBoardMapper;
	
	// 게시판 리스트
	public List<BoardVO> boardListService() throws Exception {

		return mBoardMapper.boardList();
	}

	// 게시물 상세페이지
	public BoardVO boardDetailService(int bno) throws Exception {

		return mBoardMapper.boardDetail(bno);
	}
	
	// 게시물 작성
	public int boardInsertService(BoardVO board) throws Exception {

		return mBoardMapper.boardInsert(board);
	}

	// 게시물 수정
	public int boardUpdateService(BoardVO board) throws Exception {

		return mBoardMapper.boardUpdate(board);
	}

	// 게시물 삭제
	public int boardDeleteService(int bno) throws Exception {

		return mBoardMapper.boardDelete(bno);
	}

}
