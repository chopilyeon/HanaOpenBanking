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
	function checkLogin(boardNum,subNum){	
		<c:choose>
		<c:when test="${empty userVO}">
			if(confirm('로그인 후 사용이 가능합니다\n 로그인 페이지로 이동할까요?')){
				location.href="${pageContext.request.contextPath}/login.do"
			}
				
				
			
		</c:when>
		<c:otherwise>
			location.href='${pageContext.request.contextPath}/board/detail.do?boardNo='+ boardNum +'&subNum='+subNum
		</c:otherwise>
	
		</c:choose>  
	} 

</script>




</head>
<body>


	<jsp:include page="/jsp/include/topAndSide.jsp" />
	
	
	
	<section class="mt-5">
	<hr>
		<h2 class="text-center">Q & A </h2>	
	<hr>
	<c:if test="${userVO.type eq 'U' }">
		<button type="button" class="btn btn-outline-dark" onclick="location.href='${pageContext.request.contextPath}/board/writeForm.do';">WRITE QUESTION</button>
	</c:if>

	
	<div class="d-flex justify-content-center">
	
			<div class="container">
				<div class="row">
				<div class="col-md-3"></div>
					<div class="col-md-9">
	
		<table style="width:80%" class="table float-left">
			  	<thead>
					<tr class="table-light p-5">
						<th width="16%" class="">#</th>
						<th width="50%" class="">TITLE</th>
						<th width="16%" class="">WRITER</th>
						<th width="40%" class="">DATE</th>
						<th width="50%" class="">VIEW</th>
					</tr>
			  </thead>	
		<tbody class="table-group-divider">
				<c:forEach items="${ boardList }" var="boardList" varStatus="loop">
					<tr>
						<td class="table-light">${ boardList.boardNum }</td>
						<td class="table-light">
						<c:if test="${boardList.subNum ge 1 }">
							<c:forEach var="i" begin="0" end="${boardList.subNum}">
								<span> &nbsp;</span>
							</c:forEach>
						</c:if>
						<a href="javascript:checkLogin(${boardList.boardNum },${boardList.subNum })">
						<c:out value="${boardList.title }" />
						</a>
						</td>
						<td class="table-light">${ boardList.id }</td>
						<td class="table-light">${ boardList.regDate }</td>
						<td class="table-light">${ boardList.viewCnt }</td>
					</tr>
				</c:forEach>
		</tbody>
		
				
	
		</table>
				
		
		 <c:if test="${ userVO.type ne 'A' }"> 
			<button type="button" class="btn btn-outline-dark" onclick="location.href='${pageContext.request.contextPath}/board/writeForm.do'">WRITE QUESTION</button>
		 </c:if> 
	</div>
		
		
		
				</div>
	
	
			</div>
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