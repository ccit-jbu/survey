<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>샘플페이지</title>
<!-- 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
 -->
<script src="js/jquery-3.2.0.min.js"></script>
<script>
$(document).ready(function(){
    $("#btn1").click(function(){
        $("#div1").load("innerText.txt");
    });
});
</script>

</head>
<body>
<div id="div1">Here</div>
<button id="btn1">내용채우기</button>
</body>
</html>