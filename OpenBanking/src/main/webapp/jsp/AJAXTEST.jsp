<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script>
$(document).ready(function(){ 
	$('#clickAjax').click(function(){

		$.ajax({
			type:'get'
			,url: 'http://129.154.207.113:8080/openAPI/J_INVESTMENT_BANK'
			,data:{
				phoneNumber:"01029523679"
			},datetype:'jsonp'
			,success:callback	
	
			,error:function(){
			alert('실패');
			}
	
		})
	
	})
})

	 function callback(result){
		console.log(result);
	
		
	
	 }




</script>







<body>
<button type="button" id="clickAjax">button</button>


</body>
</html>