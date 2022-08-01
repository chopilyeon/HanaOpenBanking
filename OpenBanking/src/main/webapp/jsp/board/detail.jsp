<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>         
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="keywords"
        content="wrappixel, admin dashboard, html css dashboard, web dashboard, bootstrap 5 admin, bootstrap 5, css3 dashboard, bootstrap 5 dashboard, Ample lite admin bootstrap 5 dashboard, frontend, responsive bootstrap 5 admin template, Ample admin lite dashboard bootstrap 5 dashboard template">
    <meta name="description"
        content="Ample Admin Lite is powerful and clean admin dashboard template, inpired from Bootstrap Framework">
    <meta name="robots" content="noindex,nofollow">
    <title>J investment bank</title>
    <link rel="canonical" href="https://www.wrappixel.com/templates/ample-admin-lite/" />
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="/OpenBanking/resources/images/favicon.png">
    <!-- Custom CSS -->
    <link href="/OpenBanking/resources/css/chartist.min.css" rel="stylesheet">
    <link rel="stylesheet" href="/OpenBanking/resources/css/chartist-plugin-tooltip.css">
    <!-- Custom CSS -->
    <link href="/OpenBanking/resources/css/style.min.css" rel="stylesheet">
    <link href="/OpenBanking/resources/css/onlyForMe.css" rel="stylesheet">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">	
    
    
   
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>   
   
 <!-- FONT -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Libre+Baskerville:ital@1&display=swap" rel="stylesheet">


<script>
	$(document).ready(function(){
		$('#listBtn').click(function(){
			location.href="${pageContext.request.contextPath}/board/list.do"
		})
				
	})

	 function checkForm(){
		
		let f = document.writeForm
		if(f.title.value==''){
			document.getElementById("trigger").click();
			f.title.focus() 
			return false
		}

		if(f.content.value==''){
			document.getElementById("trigger").click();
			f.content.focus()
			return false
		}
		return true;
	}	
</script>		







</head>
<body>


	<jsp:include page="/jsp/include/topAndSide.jsp" />
	
	<section class="">
<div class="d-flex justify-content-center mt-5">

			<div class="container">
				<div class="row">
				<div class="col-md-1"></div>
					<div class="col-md-11">	
	
	
	
		<div align="center">
		<hr>
		<h1>POST VIEW</h1>
		<hr>
		<br>
		<div class="d-flex justify-content-center">
		<img src="/OpenBanking/resources/images/bank.png" width="150" alt="homepage" />
	</div>
		
<c:forEach items="${boardDetailList}" var="boardDetailList" varStatus="loop">

	
		<table border="1" style="width:80%" class="table table-striped border border-3">
			<tr>
				<th width="25%">#</th>
				<td>${boardDetailList.boardNum}</td>
			</tr>
			<tr>
				<th width="25%">TITLE</th>
				<td>${boardDetailList.title}</td>
				
			</tr>
			<tr>
				<th width="25%">WRITER</th>
				<td>${boardDetailList.id}</td>
				
			</tr>
			<tr>
				<th width="25%">CONTENT</th>
				<td>${boardDetailList.content}</td>
				
			</tr>
			<tr>
				<th width="25%">VIEW</th>
				<td>${boardDetailList.viewCnt}</td>
				
			</tr>
		
			<tr>
				<th width="25%">DATE</th>
				<td>${boardDetailList.regDate}</td>
				
			</tr>
			
		</table>
</c:forEach>
		
		</div>
		</div>
		</div>
		</div>
		
		<br>
		
	</div>
	
	
	
<div class="d-flex justify-content-center mt-5">

			<div class="container">
				<div class="row">
				<div class="col-md-1"></div>
					<div class="col-md-11">		
	



	
</div>
</div>
</div>
</div>
	
<div class="d-flex justify-content-center">
	
			<div class="container">
				<div class="row">
				<div class="col-md-1"></div>
					<div class="col-md-11">



	
    <div align="center">
		<hr>
		<h2>ANSWER</h2>
		<hr>
		<br>
	
	
	<form action="${pageContext.request.contextPath}/board/writeDetailForm.do" method="post" name="writeForm" onsubmit="return checkForm()">

		<input type="hidden" name = "parentNum" value="${ boardDetailList[0].parentNum }">
		<input type="hidden" name ="id" value="${userVO.id}">
		<table border="1" style="width:80%" class="table">
			<tr>

				<th width="25%">TITLE</th>	
				<td><input type="text" name="title" size=80 class="form-control input-sm"></td>  

				
			</tr>
			<tr>
			
				<th width ="25%" class="ml-5">WRITER</th>
				<td>${userVO.id }</td> 
			
			</tr>
			<tr>
				<th width ="25%"  class="ml-5">CONTENT</th>
				<td>
					<textarea rows="5" cols="80" name="content" class="form-control"></textarea>
				</td>		
			</tr>
		</table>
		<br>
		<input type="submit" value="ANSWER" class="btn btn-secondary">&nbsp;
	<div class="d-flex justify-content-center mt-5">
	</div>
	</form>
	</div>
	
	
	</div>
	</div>
	</div>
	</div>
	
	
	
	
	
	
		<!-- Button trigger modal -->
	<button type="button" class="btn btn-primary" id="trigger" data-bs-toggle="modal" data-bs-target="#exampleModal">
 		 Launch demo modal
	</button>


	<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  		<div class="modal-dialog">
    		<div class="modal-content py-5">
    			 <div class="modal-body">
     	 			 <p class="fs-6 text-center">PLEASE WRITE TITLE AND CONTENT</p>
     	  		
     	 			 <p class="fs-6 text-center">THANK YOU   ${userVO.id}! <p>
   
     
     	   
     			</div>
   			 </div>
  		</div>
	</div>
	
	
	
	
	
	
	
	
	
	
		
	</section>








	<jsp:include page="/jsp/include/footer.jsp" />
	
	
	
<script>

document.addEventListener("DOMContentLoaded",()=>{
 	
 	document.getElementById("trigger").style.display = 'none';
	document.getElementById("click").style.display = 'none';
 	
 	
 	const fail = document.getElementById("fail");
 	
 	fail.addEventListener("click",()=>{
 		document.getElementById("click").click();
 	});
 	
 	
 	
 });
 
</script>	
	
	
	
	
	
	
 <script src="/OpenBanking/resources/js/jquery.min.js"></script>
    <!-- Bootstrap tether Core JavaScript -->
    <script src="/OpenBanking/resources/js/bootstrap.bundle.min.js"></script>
    <script src="/OpenBanking/resources/js/app-style-switcher.js"></script>
    <script src="/OpenBanking/resources/js/jquery.sparkline.min.js"></script>
    <!--Wave Effects -->
    <script src="/OpenBanking/resources/js/waves.js"></script>
    <!--Menu sidebar -->
    <script src="/OpenBanking/resources/js/sidebarmenu.js"></script>
    <!--Custom JavaScript -->
    <script src="/OpenBanking/resources/js/custom.js"></script>
    <!--This page JavaScript -->
    <!--chartis chart-->
    <script src="/OpenBanking/resources/js/chartist.min.js"></script>
    <script src="/OpenBanking/resources/js/chartist-plugin-tooltip.min.js"></script>
    <script src="/OpenBanking/resources/js/dashboard1.js"></script>


	
	
</body>
</html>