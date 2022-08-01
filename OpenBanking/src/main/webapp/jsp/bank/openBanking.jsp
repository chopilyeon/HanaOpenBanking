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
    <link href="/OpenBanking/resources/css/openBanking.css" rel="stylesheet">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">	
  
   
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>   
   
 <!-- FONT -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Libre+Baskerville:ital@1&display=swap" rel="stylesheet">
<script>


document.addEventListener("DOMContentLoaded",()=>{
 	document.getElementById("click").click();
 	document.getElementById("click").style.display = 'none';
 	
 	const btn1 = document.getElementById("close1");
 	const btn2 = document.getElementById("close2");
 	
 	btn1.addEventListener("click",()=>{
 		document.location.href="${pageContext.request.contextPath}/welcome.do";
 	});
 	

 	btn2.addEventListener("click",()=>{
 		document.location.href="${pageContext.request.contextPath}/welcome.do";
 	});
 	
 	
 	
 	
 });
 
	



</script>






</head>
<body>
	<jsp:include page="/jsp/include/topAndSide.jsp" />
	
	
	<section  class="onlyfor">
	<!-- Button trigger modal -->
	<div class="container row d-flex justify-content-center p-3" style="float: none; margin:0;" margin-left: 20px;>
		<button type="button" class="btn btn-primary btn-sm w-25 m-5" id="click" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
 	 		OPEN BANKING SERVICE
		</button>
	</div>
	<!-- Modal -->
	<div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
 		 <div class="modal-dialog">
    	 <div class="modal-content">
      	 <div class="modal-header">
         <h5 class="modal-title" id="staticBackdropLabel">OPEN BANKING</h5>
         <button type="button" class="btn-close close1" id="close2" data-bs-dismiss="modal" aria-label="Close"></button>
    </div>
    <div class="modal-body">
    
    	 <c:choose>
			<c:when test="${ userVO.openBanking eq 'Y'}"> 	
				<p><a href="${pageContext.request.contextPath}/bank/checkoutHistoryLog.do" role="button" class="btn btn-secondary" data-bs-toggle="popover" title="Popover title" data-bs-content="Popover body content is set in this attribute.">checkout transaction log</a> </p>  			
				<p><a href="${pageContext.request.contextPath}/bank/checkoutAsset.do" role="button" class="btn btn-secondary" data-bs-toggle="popover" title="Popover title" data-bs-content="Popover body content is set in this attribute.">checkout my account</a> </p>  			
				<p><a href="${pageContext.request.contextPath}/bank/openAccount.do" role="button" class="btn btn-secondary" data-bs-toggle="popover" title="Popover title" data-bs-content="Popover body content is set in this attribute.">open account</a> </p>
 				<p><a href="${pageContext.request.contextPath}/bank/transferToMyAccount.do" role="button" class="btn btn-secondary" data-bs-toggle="popover" title="Popover title" data-bs-content="Popover body content is set in this attribute.">send money to my account</a> </p>
 				<p><a href="${pageContext.request.contextPath}/bank/transferToOtherAccount.do" role="button" class="btn btn-secondary" data-bs-toggle="popover" title="Popover title" data-bs-content="Popover body content is set in this attribute.">transferring to another account</a> </p>
			</c:when>
			<c:otherwise>
				<p><a href="${pageContext.request.contextPath}/bank/checkoutAsset.do" role="button" class="btn btn-secondary" data-bs-toggle="popover" title="Popover title" data-bs-content="Popover body content is set in this attribute.">checkout my account</a> </p>  			
				<p><a href="${pageContext.request.contextPath}/bank/openAccount.do" role="button" class="btn btn-secondary" data-bs-toggle="popover" title="Popover title" data-bs-content="Popover body content is set in this attribute.">open account</a> </p>
    			<p><a href="${pageContext.request.contextPath}/bank/transferToOtherAccount.do" role="button" class="btn btn-secondary" data-bs-toggle="popover" title="Popover title" data-bs-content="Popover body content is set in this attribute.">send money to my account</a> </p>
    			<p><a href="${pageContext.request.contextPath}/bank/openBankingAgreement.do" role="button" class="btn btn-secondary" data-bs-toggle="popover" title="Popover title" data-bs-content="Popover body content is set in this attribute.">agree to open banking</a> </p>
				<p>If you would like to transfer to another bank and view transaction log,</p>
 				<p> please agree to the open banking service</p>
 			</c:otherwise>
		</c:choose>




    </div>
    <div class="modal-footer">
        <button type="button" class="btn btn-secondary" id="close1" data-bs-dismiss="modal">Close</button>
     </div>
    </div>
  </div>
</div>
	
	
	
	
	
	
	
	
	
	
	
	
	</section>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	<jsp:include page="/jsp/include/footer.jsp" />
	
	
	
	

	<script src="/OpenBanking/resources/js/openBanking.js"></script>
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
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>


	

</body>
</html>