<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>레시피 입력</title>
</head>
<body>
	<form action="recipew.do" method="post">
		이름 : <input type="text" name="name" /><br />
		아이템 : <input type="text" name="item" /><br />
		이미지 : <input type="text" name="image" /><br />
		내용 : <input type="file" name="content" /><br />
		<input type="submit" value="레시피 등록" />
	</form>
</body>
</html>