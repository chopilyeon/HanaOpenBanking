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
    
    
 <!-- FONT -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Libre+Baskerville:ital@1&display=swap" rel="stylesheet">



 <script src="https://developers.kakao.com/sdk/js/kakao.min.js"></script>

</head>
<body>
 	<jsp:include page="/jsp/include/topAndSide.jsp" />
<section>

<div id="carouselExampleSlidesOnly" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active carousel-image-1">.
    </div>
    <div class="carousel-item carousel-image-2">
    </div>
    <div class="carousel-item carousel-image-3">
 
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
     	 			 <p class="fs-3 text-center">FROM ${withrawalName} TO ${depositName} TRANSFER COMPLETED </p>
     	 			 <p class="fs-3 text-center"> ${tranDate} </p> 
     	  		
     	 			 <p class="fs-6 text-center">THANK YOU ${userVO.id}! <p>
   
     				<div class="d-flex justify-content-center">
     					 <img src="/OpenBanking/resources/images/kakao.png" alt="user-img" class="img-circle" width="30">
     	   				<button id="kakaotalk-sharing-btn">SEND TRANSFER RESULT</button>
     	   			</div>
     	   
     			</div>
   			 </div>
  		</div>
	</div>








</section>























    <jsp:include page="/jsp/include/footer.jsp" />
  	
<script>

	
	


document.addEventListener("DOMContentLoaded",()=>{
 	document.getElementById("trigger").click();
 	document.getElementById("trigger").style.display = 'none';
	
 	
 	
/*  	const fail = document.getElementById("fail"); */
 	
 	/* fail.addEventListener("click",()=>{
 		document.getElementById("click").click();
 	}); */
 	
 	
 	
 });

</script>


<script>
const withrawalName = '${withrawalName}';
const tranAmount ='${tranAmount}';
const tranDate = '${tranDate}';
const depositName = '${depositName}';
console.log(withrawalName,tranAmount,tranDate,depositName); 

Kakao.init('2a5469364f4e047b9ce872e670e9dadb'); 
 // 이건 각자 발급받은 키 사용하셔야 합니다!!
Kakao.Share.createDefaultButton({
    container: '#kakaotalk-sharing-btn',
    objectType: 'feed',
    content: {
      title: '이체 알림',
      description: withrawalName + '님이 ' + tranDate + '에 ' + depositName + '님에게 ' +  tranAmount+ '원을 이체하였습니다.' ,
      imageUrl:
        'https://product-image.juniqe-production.juniqe.com/media/catalog/product/seo-cache/x800/265/130/265-130-101P/J-Mottos-by-Sinan-Saydik-Poster.jpg',
      link: {
        mobileWebUrl: 'https://developers.kakao.com',
        androidExecutionParams: 'test',
      },
    },
    itemContent: {
      profileText: 'J_INVESTMENT_BANK',
      profileImageUrl: 'https://product-image.juniqe-production.juniqe.com/media/catalog/product/seo-cache/x800/265/130/265-130-101P/J-Mottos-by-Sinan-Saydik-Poster.jpg',
    },
    social: {
      likeCount: 10,
      commentCount: 20,
      sharedCount: 30,
    },
    buttons: [
      {
        title: '자세히 보기',
        link: {
          mobileWebUrl: 'https://developers.kakao.com',
        }
      }
    ]
  });
</script>






<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.12.4.min.js"></script>
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