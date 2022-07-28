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

</head>
<body>


	<jsp:include page="/jsp/include/topAndSide.jsp" />
	
	<section>
	
	<div class="d-flex justify-content-center mt-5">

			<div class="container">
				<div class="row">
				<div class="col-md-1"></div>
					<div class="col-md-11">	
	
	
	
		<div align="center">
		<hr>
		<h1>개별 게시글 조회</h1>
		<hr>
		<br>
		
		<table border="1" style="width:80%">
			<tr>
				<th width="25%">번호</th>
				<td>${boardVO.boardNum}</td>
			</tr>
			<tr>
				<th width="25%">제목</th>
				<td>${boardVO.title}</td>
				
			</tr>
			<tr>
				<th width="25%">작성자</th>
				<td>${boardVO.id}</td>
				
			</tr>
			<tr>
				<th width="25%">내용</th>
				<td>${boardVO.content}</td>
				
			</tr>
			<tr>
				<th width="25%">조회수</th>
				<td>${boardVO.viewCnt}</td>
				
			</tr>
		
			<tr>
				<th width="25%">등록일</th>
				<td>${boardVO.regDate}</td>
				
			</tr>
			
			
			

		</table>
		
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
	
	
<div class="d-flex justify-content-center mt-5">
		<button onclick="doAction('U')">수  정</button>&nbsp;&nbsp;
		<button onclick="doAction('D')">삭  제</button>&nbsp;&nbsp;
		<button onclick="doAction('L')">목  록</button>&nbsp;&nbsp;
</div>
	
	
</div>
</div>
</div>
</div>
	
	
	
    <div align="center">
		<hr>
		<h2>새글 등록폼</h2>
		</hr>
		<br>
	
	
	<form action="${pageContext.request.contextPath}/board/writeAnswerProcess.do" method="post" name="writeForm" onsubmit="return checkForm()">

		<input type="hidden" name ="id" value="${userVO.id}">
		<table border="1" style="width:80%">
			<tr>

				<th width="25%">제목</th>	
				<td><input type="text" name="title" size=80></td>  

				
			</tr>
			<tr>
			
				<th width ="25%">작성자</th>
				<td>${userVO.id }</td> 
			
			</tr>
			<tr>
				<th width ="25%">내용</th>
				<td>
					<textarea rows="5" cols="80" name="content"></textarea>
				</td>		
			</tr>
		</table>
		<br>
		<input type="submit" value="새글등록">&nbsp;
		<button id="listBtn">목록</button>
	<form>
	</div>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	</section>








	<jsp:include page="/jsp/include/footer.jsp" />
	
	
	
	
	
	
	
	
	
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