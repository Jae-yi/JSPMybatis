<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="../include/style.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Page</title>
</head>
<body>
	<jsp:include page="../include/header.jsp" />
	<h2 style="text-align: center">게시물 리스트</h2>

	<div class="list-container">


		<div class="container">
			<button class="btn btn-primary"
				style="display: block; margin-bottom: 10px"
				onclick="location.href='/insert'">글쓰기</button>
			<table class="table table-hover">
				<tr>
					<th>No.</th>
					<th>Subject</th>
					<th>Writer</th>
					<th>Date</th>
				</tr>
				<c:forEach var="i" items="${list}">
					<tr onclick="location.href='/detail/${i.bno}'">
						<td>${i.bno}</td>
						<td>${i.subject}</td>
						<td>${i.writer}</td>
						<!--날짜 포맷팅 -->
						<td>
							<fmt:formatDate var="resultRegDt" value="${i.reg_date}"
								pattern="yyyy-MM-dd" /> ${resultRegDt}
					    </td>
					</tr>
				</c:forEach>

			</table>
		</div>
	</div>
	<jsp:include page="../include/footer.jsp"></jsp:include>
</body>
</html>