<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>updateForm.jsp</h1>
	
	<h2>회원정보 수정</h2>
	
	<!-- action 속성값이 없는 경우 자신의 주소를 호출 -->
	<fieldset>
		<form action="" method="post" >
			아이디 : <input type="text" name="userid" value="${memberVO.userid }" readonly"><br>   
			비밀번호 : <input type="password" name="userpw"><br>
			이름 : <input type="text" name="username" value="${memberVO.username }"><br>
			이메일 : <input type="email" name="useremail" value="${memberVO.useremail }"><br>
			
			<input type="submit" value="회원수정하기">
		</form>
	
	</fieldset>
	
	
	
</body>
</html>