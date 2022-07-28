<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	document.getElementById("popup_open_btn").style.display = 'none';
 	
 	
 	
 	
 	
 	
 	const btn1 = document.getElementById("close1");
 	const btn2 = document.getElementById("close2");
 	
 	btn1.addEventListener("click",()=>{
 		document.location.href="${pageContext.request.contextPath}/welcome.do";
 	});
 	

 	btn2.addEventListener("click",()=>{
 		document.location.href="${pageContext.request.contextPath}/welcome.do";
 	});
 	
 	
 	
 	
 });

 


 function checkForm(){
 	
 	let f = document.writeForm
 	
 	if(f.name.value==''){
		document.getElementById("popup_open_btn").click();
 		return false
 		
 		
 	}
 	
 	if(f.password.value==''){

		document.getElementById("popup_open_btn").click();
 		return false
 	}
 	
 
 	if(f.iden_number1.value==''||f.iden_number1.value.toString().length!=6){
		document.getElementById("popup_open_btn").click();
 		return false
 	}
 	if(f.iden_number2.value==''||f.iden_number2.value.toString().length!=7){
		document.getElementById("popup_open_btn").click();

 		return false
 	}
 	
 	if(f.balance.transfer_limit=''){

 		document.getElementById("popup_open_btn").click();
 		
 		return false
 	}
	
 	
 	
 	
	if(f.balance.value<10000){

 		document.getElementById("popup_open_btn").click();
 		
 		return false
 	}
	
	if(f.alias.value==''){

 	
		document.getElementById("popup_open_btn").click();
 		return false
 	}
 	
 	
 	
 	
 	return true;
 }	
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 


</script>




</head>








<body>
	<jsp:include page="/jsp/include/topAndSide.jsp" />
	
		
<section class="onlyfor1">
	
	
<!-- Button trigger modal -->
<div class="d-flex justify-content-center">
	<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal" id="click">
  		ACCOUNT OPENING
	</button>
</div>


<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">${userVO.id}'S ACCOUNT OPENING</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close" id="close1"></button>
      </div>
      <div class="modal-body">
     	<form action="${pageContext.request.contextPath}/bank/openAccountProcessing.do" method="post" name="writeForm" onsubmit="return checkForm()">
			<p>
			NAME
			</p>
			<input type="text" name="name" size=20 placeholder="NAME" class="form-control"><br>
			<p>
			ACCOUNT PASSWORD
			</p>
			<input type="password" name="password" size=20 placeholder="ACCOUNT PASSWORD" class="form-control"><br>
			<p>
			ACCOUNT ALIAS
			</p>
			<input type="text" name="alias" size=20 placeholder="ACCOUNT ALIAS" class="form-control"><br>
			
			<p>
			Transfer limit
			</p>
			<input type="text" name="transfer_limit" size=20 placeholder="ACCOUNT ALIAS" class="form-control"><br>
			
			
			
			
			<div class="row g-3">
				<div>
				 social security number
				</div>
				<div class="col-sm mb-3">
   				    <input type="text" class="form-control" placeholder="first six number" aria-label="City" name="iden_number1" maxlength='6'>
  				</div>
  				<div class="col-sm mb-3">
   					<input type="password" class="form-control" placeholder="last seven number" aria-label="State" name="iden_number2" maxlength='7'>
  				</div>
  			</div>
  			
  			<div class="mb-3">
  			send more than 10,000 won to make account
  			</div>
  			<input type="number" name="balance" size=20 placeholder="balance" class="form-control"><br>
        	<input type="hidden" name ="phoneNumber" value="${userVO.phoneNumber}">
        <button type="submit" class="btn btn-primary">MAKE ACCOUNT</button>
  		 <button type="button" class="btn btn-secondary" data-bs-dismiss="modal" id="close2">Close</button>	
	</form>
 </div>
 	</div>
 		</div>
 			</div>
 	
 



        <div id="my_modal">
    		please write all blank and send more than 10,000 won to make account
            <a class="modal_close_btn">close</a>
        </div>

		<button id="popup_open_btn"></button>





		






	
	
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