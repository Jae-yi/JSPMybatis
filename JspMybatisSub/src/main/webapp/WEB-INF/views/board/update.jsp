<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="../include/style.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update page</title>
</head>
<body>
<jsp:include page="../include/header.jsp"></jsp:include>
	<h2 style="text-align: center">게시글 수정</h2>

	<div class="container">
		<form action="/updateProc" method="post">
			<div class="form-group">
				<label for="subject">제목</label> <input type="text"
					class="form-control" id="subject" name="subject"
					value="${detail.subject}">
			</div>
			<div class="form-group">
				<label for="content">내용</label>
				<textarea class="form-control" id="content" name="content" rows="3">${detail.content}</textarea>
			</div>
			<input type="hidden" name="bno" value="${bno}" />
			<button type="submit" class="btn btn-primary">수정완료</button>
		</form>
	</div>
	<jsp:include page="../include/footer.jsp"></jsp:include>
</body>
</html>