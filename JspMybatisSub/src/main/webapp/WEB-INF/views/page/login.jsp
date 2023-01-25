<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ include file="../include/style.jsp"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
  <link href="resources/css/login.css" rel="stylesheet" type="text/css">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.2/css/all.css" integrity="sha384-vSIIfh2YWi9wW0r9iZe7RJPrKwp6bG+s9QZMoITbCckVJqGCCRhc+ccxNcdpHuYu" crossorigin="anonymous">
</head>
<body>
  <section>
    <h1>Login</h1>
    <div class="login-form">
      <h4>Username</h4>
      <div class="username-input">
        <i class="fas fa-user"></i>
        <input type="text" placeholder="Type your username">
      </div>
      <h4>Password</h4>
      <div class="password-input">
        <i class="fas fa-lock"></i>
        <input type="text" placeholder="Type your password">
      </div>
      <p>Forgot password?</p>
    </div>
    <button class="login-btn" onclick="location.href='/main'">
      LOGIN
    </button>
    <div class="alternative-signup">
      <p>Not a member? <span>Sign-up</span></p>
    </div>
  </section>
</body>
</html>