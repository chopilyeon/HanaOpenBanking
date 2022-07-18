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
	

	
<form class="border" action="${pageContext.request.contextPath}/bank/transferProcess.do" method="post">	
<input type="hidden" name ="withrawalName" value="${userVO.name}">
<input type="hidden" name ="depositName" value="${userVO.name}">
	<div class="social-box m-5 p-5">
	    <div class="container">
	     	<div class="row m-5">
			    <div class="col-lg-12 col-xs-12 text-center">
					<div class="box border border-5 rounded-3 m-5 w-75">
	                    <i class="fa fa-behance fa-3x" aria-hidden="true"></i>
						<div class="box-title">
							<h2>TRANSFER TO MY ACCOUNT</h2>
						</div>
						<hr>		
						<div class="box-text m-3 border">
						<h3 class="mt-3">BANK</h3>						
							<h4 >J IVESTMENT</h4>
						</div>					
						<div class="box-text m-3 border">
						<h4 class="mt-3">NAME OF DEPOSITOR </h4>
							<h4>${userVO.name}</h4>				
						</div>	
						<div class="box-text m-3 border">
							<h4 class="mt-3">WITHRAWAL ACCOUNT NUMBER</h4>
							<select class="mb-3" name="withrawalAccountNumber">
								<option value="none">withrawal account number</option>
								<c:forEach items="${ bankList}" var="bankList">
									<c:choose>
										<c:when test="${userVO.openBanking eq 'Y'}">									
											<option value="${bankList.accountNumber}">${bankList.bankName} ${bankList.accountNumber}</option>
										</c:when>
										<c:otherwise>
											<c:if test="${bankList.bankName eq 'J INVESTMENT BANK' }">
											<option value="${bankList.accountNumber}">${bankList.bankName} ${bankList.accountNumber}</option>
											</c:if>
										</c:otherwise> 
									</c:choose>		
								</c:forEach>
							</select>
						</div>
						<div class="box-text m-3 border">
						<h4 class="mt-3">DEPOSIT ACCOUNT NUMBER</h4>
							<select name="depositAccountNumber" class="mb-3">
								<option value="none">depositAccount</option>
								<c:forEach items="${ bankList}" var="bankList">
									<option value="${bankList.accountNumber}">${bankList.bankName} ${bankList.accountNumber}</option>
								</c:forEach>
							</select>
						</div>											
						<div class="box-text m-3 border">
						<h4 class="mt-3">REMITTANCE</h4>
							<input type="number" name="tranAmount" class="mb-3">	
						</div>
							
							 <button type="SUBMIT" class="btn btn-primary">TRANSFER</button>			 
					</div>	 
				</div>
			</div>
		</div>	
	</div>	
</form>	
	
	
	
	
	
	
	
	
	
	
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