package com.example.demo.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.BoardVO;

//DB에 접근하는 클래스
@Repository("com.example.demo.mapper.BoardMapper")
public interface BoardMapper {

	// 게시글 개수
	public int boardCount() throws Exception;

	// 게시글 리스트
	public List<BoardVO> boardList() throws Exception;

	// 게시글 상세
	public BoardVO boardDetail(int bno) throws Exception;

	// 게시글 작성
	public int boardInsert(BoardVO board) throws Exception;

	// 게시글 수정
	public int boardUpdate(BoardVO board) throws Exception;

	// 게시글 삭제
	public int boardDelete(int bno) throws Exception;
}
