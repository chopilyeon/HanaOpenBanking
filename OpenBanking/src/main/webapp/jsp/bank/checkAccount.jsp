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











</script>












<script>
console.log(String("0"+${userVO.phoneNumber}));
console.log(typeof String(${userVO.phoneNumber}))
let withdrawalBankName;
	let selectBoxChange = function(value){
		
	if(value=="J_INVESTMENT_BANK" || "BK_BANK" || "BERRY_BANK" || "JH_BANK" ){
		console.log("값 테스트" + value);
		withdrawalBankName = value;	
		$.ajax({
		 
			type:'get'
			,url:'http://localhost:9887/OpenBanking/checkoutBank'
			,data:{
				withdrawalBank:withdrawalBankName,
				phoneNumber:"0"+${userVO.phoneNumber}
			},datetype:'jsonp'
			,success:callback	
	
			,error:function(){
			alert('실패');
			}
	
			})
		}else{
			console.log("값 테스트" + value);
			withdrawalBankName = value;	
			let bankCode;
			if(withdrawalBankName=="SY_BANK"){
				bankCode="01";
			}else if(withdrawalBankName=="YK_BANK"){
				bankCode="02";
			}else if(withdrawalBankName=="HJ_BANK"){
				bankCode="03";
			}
			
			$.ajax({
			 
				type:'post'
				,url:'http://132.226.23.122/TeamTwoOpenAPI/AccountList.json',
				,data:{
					key:"FR587250820200O4HL8RQNR5" 
					bankCode:bankCode,
					tel:"0"+${userVO.phoneNumber}
				},datetype:'jsonp'
				,success:callback2			
				,error:function(){
				alert('실패');
				}
		
				})
			
			
		
		
		
	}
	
	
}

	 function callback(result){
		console.log(result);
		console.log("result의 크기"+result.length);
		$('#MyAccount').empty();
		 for(let i=0 ;i <result.length; i++){
			let account = result[i];
			let accountNumber = account.accountNumber;
			let accountAlias = account.bankAlias;
			let accountBankName = account.bankName;
			let transferLimit = account.transferLimit;
			let balance = account.balance;
		
			$('#MyAccount').append('<div class="col-lg-6 col-xs-12 text-center"><div class="box border border-4 rounded-3 m-5 w-75"><div><div><img src="/OpenBanking/resources/images/bank.png" width="100" alt="homepage"/></div><i class="fa fa-behance fa-3x" aria-hidden="true"></i><div class="box-title"><h3>'+ accountBankName +'</h3></div><hr><div class="box-text m-2"><h3>BALANCE</h3><h5>'+balance+' WON</h5></div><hr><div class="box-btn"><h3>TRANSFER LIMIT</h3><h5>'+transferLimit+ ' WON</h5></div><hr><div class="box-btn"><h3>BANK NAME</h3><h5>'+ accountBankName + '</h5></div><hr><div class="box-btn"><h3>ACCOUNT NUMBER</h3><h5>'+accountNumber+'</h5></div></div></div>');		 
		 } 	
	 }
	 

	 function callback2(result){
		console.log(result);
		console.log("result의 크기"+result.length);
		$('#MyAccount').empty();
		 for(let i=0 ;i <result.length; i++){
			let account = result[i];
			let accountNumber = account.accountNumber;
			let accountName = account.accountName;
			let balance = account.balance;
		
			$('#MyAccount').append('<div class="col-lg-6 col-xs-12 text-center"><div class="box border border-4 rounded-3 m-5 w-75"><div><div><img src="/OpenBanking/resources/images/bank.png" width="100" alt="homepage"/></div><i class="fa fa-behance fa-3x" aria-hidden="true"></i><div class="box-title"><h3>'+ accountBankName +'</h3></div><hr><div class="box-text m-2"><h3>BALANCE</h3><h5>'+balance+' WON</h5></div><hr><div class="box-btn"><h3>TRANSFER LIMIT</h3><h5>'+transferLimit+ ' WON</h5></div><hr><div class="box-btn"><h3>BANK NAME</h3><h5>'+ accountBankName + '</h5></div><hr><div class="box-btn"><h3>ACCOUNT NUMBER</h3><h5>'+accountNumber+'</h5></div></div></div>');		 
		 } 	
	 }
	 
	 
	 
	 
</script>













</head>
<body>


	<jsp:include page="/jsp/include/topAndSide.jsp" />
	
	<section>
	
	<h1 class="text-center m-5 ">
		${userVO.id}'s Bank Account
	</h1>
	<hr>
    <div class="d-flex justify-content-end m-5">
	<c:if test="${userVO.syBank eq 'Y' and userVO.hjBank eq 'Y' and userVO.ykBank eq 'Y' and userVO.openBanking eq 'Y'}">      
		<select class="mb-3 form-select" name="withdrawalBankName" id="withdrawalAccountBank" onchange="selectBoxChange(this.value);" style="width:250px;">
			<option value="none">SELECT BANK</option>
		 	<option value="J_INVESTMENT_BANK">J_INVESTMENT_BANK</option>
		 	<option value="BK_BANK">BK_BANK</option>
		 	<option value="BERRY_BANK">BERRY_BANK</option>
		 	<option value="JH_BANK">JH_BANK</option>
		 	<option value="SY_BANK">SY_BANK</option>
		 	<option value="HJ_BANK">HJ_BANK</option>
		 	<option value="YK_BANK">YK_BANK</option>	
		</select>
	</c:if>	
	<c:if test="${userVO.syBank eq 'Y' and userVO.hjBank eq 'Y'  and userVO.ykBank eq 'N' and userVO.openBanking eq 'Y'}">      
		<select class="mb-3 form-select" name="withdrawalBankName" id="withdrawalAccountBank" onchange="selectBoxChange(this.value);" style="width:250px;">
			<option value="none">SELECT BANK</option>
		 	<option value="J_INVESTMENT_BANK">J_INVESTMENT_BANK</option>
		 	<option value="BK_BANK">BK_BANK</option>
		 	<option value="BERRY_BANK">BERRY_BANK</option>
		 	<option value="JH_BANK">JH_BANK</option>
	 		<option value="SY_BANK">SY_BANK</option>
		 	<option value="HJ_BANK">HJ_BANK</option>
		</select>
	</c:if>	
	<c:if test="${userVO.syBank eq 'Y' and userVO.hjBank eq 'N' and userVO.ykBank eq 'Y' and userVO.openBanking eq 'Y'}">      
		<select class="mb-3 form-select" name="withdrawalBankName" id="withdrawalAccountBank" onchange="selectBoxChange(this.value);" style="width:250px;">
			<option value="none">SELECT BANK</option>
		 	<option value="J_INVESTMENT_BANK">J_INVESTMENT_BANK</option>
		 	<option value="BK_BANK">BK_BANK</option>
		 	<option value="BERRY_BANK">BERRY_BANK</option>
		 	<option value="JH_BANK">JH_BANK</option>
	 		<option value="SY_BANK">SY_BANK</option>
		 	<option value="YK_BANK">YK_BANK</option>
		</select>
	</c:if>	
	<c:if test="${userVO.syBank eq 'N' and userVO.hjBank eq 'Y' and userVO.ykBank eq 'Y' and userVO.openBanking eq 'Y'}">      
		<select class="mb-3 form-select" name="withdrawalBankName" id="withdrawalAccountBank" onchange="selectBoxChange(this.value);" style="width:250px;">
			<option value="none">SELECT BANK</option>
		 	<option value="J_INVESTMENT_BANK">J_INVESTMENT_BANK</option>
		 	<option value="BK_BANK">BK_BANK</option>
		 	<option value="BERRY_BANK">BERRY_BANK</option>
		 	<option value="JH_BANK">JH_BANK</option>
		 	<option value="HJ_BANK">HJ_BANK</option>
		 	<option value="YK_BANK">YK_BANK</option>
		</select>
	</c:if>	
	<c:if test="${userVO.syBank eq 'N' and userVO.hjBank eq 'N' and userVO.ykBank eq 'Y' and userVO.openBanking eq 'Y'}">      
		<select class="mb-3 form-select" name="withdrawalBankName" id="withdrawalAccountBank" onchange="selectBoxChange(this.value);" style="width:250px;">
			<option value="none">SELECT BANK</option>
		 	<option value="J_INVESTMENT_BANK">J_INVESTMENT_BANK</option>
		 	<option value="BK_BANK">BK_BANK</option>
		 	<option value="BERRY_BANK">BERRY_BANK</option>
		 	<option value="JH_BANK">JH_BANK</option>
		 	<option value="YK_BANK">YK_BANK</option>
		</select>
	</c:if>	
	<c:if test="${userVO.syBank eq 'N' and userVO.hjBank eq 'Y' and userVO.ykBank eq 'N' and userVO.openBanking eq 'Y'}">      
		<select class="mb-3 form-select" name="withdrawalBankName" id="withdrawalAccountBank" onchange="selectBoxChange(this.value);" style="width:250px;">
			<option value="none">SELECT BANK</option>
		 	<option value="J_INVESTMENT_BANK">J_INVESTMENT_BANK</option>
		 	<option value="BK_BANK">BK_BANK</option>
		 	<option value="BERRY_BANK">BERRY_BANK</option>
		 	<option value="JH_BANK">JH_BANK</option>
		 	<option value="HJ_BANK">HJ_BANK</option>
		</select>
	</c:if>	
	<c:if test="${userVO.syBank eq 'Y' and userVO.hjBank eq 'N' and userVO.ykBank eq 'N' and userVO.openBanking eq 'Y'}">      
		<select class="mb-3 form-select" name="withdrawalBankName" id="withdrawalAccountBank" onchange="selectBoxChange(this.value);" style="width:250px;">
			<option value="none">SELECT BANK</option>
		 	<option value="J_INVESTMENT_BANK">J_INVESTMENT_BANK</option>
		 	<option value="BK_BANK">BK_BANK</option>
		 	<option value="BERRY_BANK">BERRY_BANK</option>
		 	<option value="JH_BANK">JH_BANK</option>
	 		<option value="SY_BANK">SY_BANK</option>
		</select>
	</c:if>	
	<c:if test="${userVO.syBank eq 'N' and userVO.hjBank eq 'N' and userVO.ykBank eq 'N' and userVO.openBanking eq 'Y'}">      
		<select class="mb-3 form-select" name="withdrawalBankName" id="withdrawalAccountBank" onchange="selectBoxChange(this.value);" style="width:250px;">
			<option value="none">SELECT BANK</option>
		 	<option value="J_INVESTMENT_BANK">J_INVESTMENT_BANK</option>
		 	<option value="BK_BANK">BK_BANK</option>
		 	<option value="BERRY_BANK">BERRY_BANK</option>
		 	<option value="JH_BANK">JH_BANK</option>
		</select>
	</c:if>	
	<c:if test="${userVO.syBank eq 'N' and userVO.hjBank eq 'N' and userVO.ykBank eq 'N' and userVO.openBanking eq 'N'}">      
		<select class="mb-3 form-select" name="withdrawalBankName" id="withdrawalAccountBank" onchange="selectBoxChange(this.value);" style="width:250px;">
			<option value="none">SELECT BANK</option>
		 	<option value="J_INVESTMENT_BANK">J_INVESTMENT_BANK</option>
		</select>
	</c:if>	
	
	
	
	
	
	
	</div>
	<div class="d-flex justify-content-center">
    	<h3 class="box-title">MY ACCOUNT</h3>
    </div>  
	<div class="social-box m-2 p-2">
	    <div class="container">
	     	<div class="row m-5" id="MyAccount">
	     	<c:forEach items="${ bankList }" var="bankList" varStatus="loop">
	     	
			<c:if test="${ bankList.bankName eq 'J_INVESTMENT_BANK'}">  	
			    <div class="col-lg-6 col-xs-12 text-center">
					<div class="box border border-4 rounded-3 m-5 w-75">
					<div>
  						<img src="/OpenBanking/resources/images/bank.png" width="100" alt="homepage" />
					</div>
								
	                    <i class="fa fa-behance fa-3x" aria-hidden="true"></i>
						<div class="box-title">
							<h3>${ bankList.bankAlias }</h3>
						</div>					
						<hr>
						<div class="box-text m-2">
							<h3>
							BALANCE
							</h3>
							<h5>${ bankList.balance } WON</h5>
						</div>
						<hr>
						<div class="box-btn">
							<h3>
							TRANSFER LIMIT
							</h3>
						    <h5>${ bankList.transferLimit } WON</h5>
						</div>
						<hr>
						<div class="box-btn">
							<h3>
							BANK NAME
							</h3>
							
						    <h5>${ bankList.bankName }</h5>
						</div>
						<hr>
						<div class="box-btn">
							<h3>
							ACCOUNT NUMBER
							</h3>
						    <h5>${ bankList.accountNumber }</h5>
						</div>		
					 </div>
				</div>	 
				</c:if>
			</c:forEach>	
			
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