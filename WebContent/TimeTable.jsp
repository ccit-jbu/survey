<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <a href = "TimeTableController?name=kang">click here</a>
    
    
<form id="lectures" name="lecture" action="" onsubmit="return false">
  성명: <input type="text" name="name"         placeholder="(예: 홍길동)" value=""><br>
  요일: <input type="text" name="weekDay"      placeholder="(예: Mon)" value=""><br>
  시작시간: <input type="text" name="startTime" placeholder="(예: 9)" value=""><br>
  종료시간: <input type="text" name="endTime"   placeholder="(예: 18)" value=""><br>
  
 <input type="hidden" name="updateGu"  value="INSERT"><br>

  성명: <input type="text" name="name"         placeholder="(예: 홍길동)" value=""><br>
  요일: <input type="text" name="weekDay"      placeholder="(예: Mon)" value=""><br>
  시작시간: <input type="text" name="startTime" placeholder="(예: 9)" value=""><br>
  종료시간: <input type="text" name="endTime"   placeholder="(예: 18)" value=""><br>
  
 <input type="hidden" name="updateGu"  value="SELECT"><br>
 <!-- NONE, SELECT, INSERT, UPDATE, DELETE -->
</form>    
    
   
    
<button>Send an HTTP POST request to a page and get the result back</button>    
    
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="js/ajax.js"></script>
<script>
$(document).ready(function(){
    $("button").click(function(){
		requestObject = {};
    	$("form").each(function(){
    		arr = $(this).serializeArray();
    		json = convertArrayToJson(arr, "updateGu");
    		
    		requestObject[$(this).attr('id')] = json;
    		
        });
        var requesetParam = JSON.stringify(requestObject);
    	
        alert(requesetParam);
        
        $.ajax({
            type: 'post',
            url: 'TimeTableController',
            data: requesetParam,
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            success: function(data) {
              ob = data;
            },
            error: function(jqXHR, textStatus, errorThrown) {
              console.log(jqXHR);
              console.log(textStatus);
              console.log(errorThrown);
            }
          });       
    });
});



</script>

</html>