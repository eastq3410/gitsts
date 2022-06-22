<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>/member/loginForm.jsp</h1>
	
	<h2>로그인</h2>
	
	<fieldset>
		<form action="/member/login" method="post">
			아이디 : <input type="text" name="userid"><br>   <!-- name은 sql컬럼명과 같아야함 -->
			비밀번호 : <input type="password" name="userpw"><br>
			
			<input type="submit" value="로그인">
			<input type="button" value="회원가입" onclick=" location.href='/member/insert';">
		</form>
	
	</fieldset>


</body>
</html>