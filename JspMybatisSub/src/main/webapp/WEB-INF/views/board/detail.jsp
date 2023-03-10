<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="../include/style.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Detail Page</title>
</head>
<body>
	<jsp:include page="../include/header.jsp"></jsp:include>
	<h2 style="text-align: center">게시글 상세</h2>

	<div class="container">
		<form>
			<div class="form-group">
				<label>제목</label>
				<p>${detail.subject}</p>
			</div>
			<div class="form-group">
				<label>작성자</label>
				<p>${detail.writer}</p>
			</div>
			<div class="form-group">
				<label>작성날짜</label>
				<p>
				<fmt:formatDate var="resultRegDt" value="${detail.reg_date}"
					pattern="yyyy-MM-dd" />
				${resultRegDt}
				</p>
			</div>
			<div class="form-group">
				<label>내용</label>
				<p>${detail.content}</p>
			</div>
		</form>
		<button class="btn btn-outline-success"
			onclick="location.href='/update/${detail.bno}'">수정</button>
		<button class="btn btn-outline-danger"
			onclick="location.href='/delete/${detail.bno}'">삭제</button>
		<button class="btn btn-outline-secondary"
			onclick="location.href='/list'">리스트</button>
	</div>
	<jsp:include page="../include/footer.jsp"></jsp:include>

</body>
</html>