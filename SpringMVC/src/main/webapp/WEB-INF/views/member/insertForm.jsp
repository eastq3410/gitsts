<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	
	function check(){
		alert("유효성 체크 완료");
		}
</script>
</head>
<body>
	<h1>/member/insertForm.jsp</h1>
	
	<h2>회원가입</h2>
	
	
	<fieldset>
		<form action="/member/insert" method="post" onsubmit="check();">
			아이디 : <input type="text" name="userid"><br>   <!-- name은 sql컬럼명과 같아야함 -->
			비밀번호 : <input type="password" name="userpw" placeholder="비밀번호를 입력하시오"><br>
			이름 : <input type="text" name="username"><br>
			이메일 : <input type="email" name="useremail"><br>
			
			<input type="submit" value="회원가입하기">
		</form>
	
	</fieldset>
	
</body>
</html>