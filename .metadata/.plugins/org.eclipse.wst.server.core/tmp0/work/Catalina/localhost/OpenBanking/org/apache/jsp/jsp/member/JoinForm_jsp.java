/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.63
 * Generated at: 2022-07-31 09:08:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class JoinForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"keywords\"\r\n");
      out.write("        content=\"wrappixel, admin dashboard, html css dashboard, web dashboard, bootstrap 5 admin, bootstrap 5, css3 dashboard, bootstrap 5 dashboard, Ample lite admin bootstrap 5 dashboard, frontend, responsive bootstrap 5 admin template, Ample admin lite dashboard bootstrap 5 dashboard template\">\r\n");
      out.write("    <meta name=\"description\"\r\n");
      out.write("        content=\"Ample Admin Lite is powerful and clean admin dashboard template, inpired from Bootstrap Framework\">\r\n");
      out.write("    <meta name=\"robots\" content=\"noindex,nofollow\">\r\n");
      out.write("    <title>J investment bank</title>\r\n");
      out.write("    <link rel=\"canonical\" href=\"https://www.wrappixel.com/templates/ample-admin-lite/\" />\r\n");
      out.write("    <!-- Favicon icon -->\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"/OpenBanking/resources/images/favicon.png\">\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link href=\"/OpenBanking/resources/css/chartist.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/OpenBanking/resources/css/chartist-plugin-tooltip.css\">\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link href=\"/OpenBanking/resources/css/style.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"/OpenBanking/resources/css/onlyForMe.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write(" <!-- FONT -->\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Libre+Baskerville:ital@1&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src =\"https://code.jquery.com/jquery-3.6.0.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@10\"></script>\r\n");
      out.write("<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$().ready(function () {\r\n");
      out.write("            $(\"#alertStart\").click(function () {\r\n");
      out.write("                Swal.fire({\r\n");
      out.write("                    icon: 'success',\r\n");
      out.write("                    title: 'KEEP GOING.',\r\n");
      out.write("                    text: 'VALID ID',\r\n");
      out.write("            });\r\n");
      out.write("     });\r\n");
      out.write("});\r\n");
      out.write("        \r\n");
      out.write("$().ready(function () {\r\n");
      out.write("    $(\"#write_your_id\").click(function () {\r\n");
      out.write("        Swal.fire({\r\n");
      out.write("            icon: 'success',\r\n");
      out.write("            title: 'write id!',\r\n");
      out.write("            text: 'INVALID ACTION',\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("$().ready(function () {\r\n");
      out.write("    $(\"#noBlank\").click(function () {\r\n");
      out.write("        Swal.fire({\r\n");
      out.write("            icon: 'success',\r\n");
      out.write("            title: 'no Blank!',\r\n");
      out.write("            text: 'INVALID ACTION',\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("});        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" document.addEventListener(\"DOMContentLoaded\",()=>{\r\n");
      out.write(" 	document.getElementById(\"click\").click();\r\n");
      out.write(" 	document.getElementById(\"click\").style.display = 'none';\r\n");
      out.write(" 	\r\n");
      out.write(" 	const btn1 = document.getElementById(\"close1\");\r\n");
      out.write(" 	const btn2 = document.getElementById(\"close2\");\r\n");
      out.write(" 	\r\n");
      out.write(" 	btn1.addEventListener(\"click\",()=>{\r\n");
      out.write(" 		document.location.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/\";\r\n");
      out.write(" 	});\r\n");
      out.write(" 	\r\n");
      out.write("\r\n");
      out.write(" 	btn2.addEventListener(\"click\",()=>{\r\n");
      out.write(" 		document.location.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/\";\r\n");
      out.write(" 	});  \r\n");
      out.write(" 	\r\n");
      out.write(" 	$('#alertStart').hide();\r\n");
      out.write(" 	$('#address').hide();\r\n");
      out.write(" 	$('#phoneNumber').hide();\r\n");
      out.write(" 	$('#password').hide();\r\n");
      out.write(" 	$('#signUp').hide();\r\n");
      out.write("	$('#write_your_id').hide();\r\n");
      out.write("	$('#noBlank').hide();\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write(" 		\r\n");
      out.write(" });  \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("function checkForm(){\r\n");
      out.write("	\r\n");
      out.write("	let f = document.writeForm\r\n");
      out.write("	\r\n");
      out.write("	if(f.id.value==''){\r\n");
      out.write("	\r\n");
      out.write("		$(\"#noBlank\").click();\r\n");
      out.write("\r\n");
      out.write("		return false\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	if(f.name.value==''){\r\n");
      out.write("\r\n");
      out.write("		$(\"#noBlank\").click();\r\n");
      out.write("\r\n");
      out.write("		return false\r\n");
      out.write("	}\r\n");
      out.write("	if(f.password.value==''){\r\n");
      out.write("\r\n");
      out.write("		$(\"#noBlank\").click();\r\n");
      out.write("		\r\n");
      out.write("		return false\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	if(f.tel1.value==''||f.tel1.value.toString().length!=3){\r\n");
      out.write("\r\n");
      out.write("		$(\"#noBlank\").click();\r\n");
      out.write("	\r\n");
      out.write("		return false\r\n");
      out.write("	}\r\n");
      out.write("	if(f.tel2.value==''||f.tel2.value.length!=4){\r\n");
      out.write("\r\n");
      out.write("		$(\"#noBlank\").click();\r\n");
      out.write("	\r\n");
      out.write("		return false\r\n");
      out.write("	}\r\n");
      out.write("	if(f.tel3.value==''||f.tel3.value.toString().length!=4){\r\n");
      out.write("\r\n");
      out.write("		$(\"#noBlank\").click();\r\n");
      out.write("\r\n");
      out.write("		return false\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	if(f.iden_number1.value==''||f.iden_number1.value.toString().length!=6){\r\n");
      out.write("\r\n");
      out.write("		$(\"#noBlank\").click();\r\n");
      out.write("\r\n");
      out.write("		return false\r\n");
      out.write("	}\r\n");
      out.write("	if(f.iden_number2.value==''||f.iden_number2.value.toString().length!=7){\r\n");
      out.write("\r\n");
      out.write("		$(\"#noBlank\").click();\r\n");
      out.write("\r\n");
      out.write("		return false\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	if(f.zipCode.value==''){\r\n");
      out.write("\r\n");
      out.write("		$(\"#noBlank\").click();\r\n");
      out.write("\r\n");
      out.write("		return false\r\n");
      out.write("	}\r\n");
      out.write("	if(f.address.value==''){\r\n");
      out.write("\r\n");
      out.write("		$(\"#noBlank\").click();\r\n");
      out.write("\r\n");
      out.write("		return false\r\n");
      out.write("	}\r\n");
      out.write("	if(f.detailAddress.value==''){\r\n");
      out.write("\r\n");
      out.write("		$(\"#noBlank\").click();\r\n");
      out.write("\r\n");
      out.write("		return false\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	return true;\r\n");
      out.write("}	\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    function sample6_execDaumPostcode() {\r\n");
      out.write("        new daum.Postcode({\r\n");
      out.write("            oncomplete: function(data) {\r\n");
      out.write("                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\r\n");
      out.write("\r\n");
      out.write("                // 각 주소의 노출 규칙에 따라 주소를 조합한다.\r\n");
      out.write("                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("                var addr = ''; // 주소 변수\r\n");
      out.write("                var extraAddr = ''; // 참고항목 변수\r\n");
      out.write("\r\n");
      out.write("                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.\r\n");
      out.write("                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우\r\n");
      out.write("                    addr = data.roadAddress;\r\n");
      out.write("                } else { // 사용자가 지번 주소를 선택했을 경우(J)\r\n");
      out.write("                    addr = data.jibunAddress;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.\r\n");
      out.write("                if(data.userSelectedType === 'R'){\r\n");
      out.write("                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)\r\n");
      out.write("                    // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\r\n");
      out.write("                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\r\n");
      out.write("                        extraAddr += data.bname;\r\n");
      out.write("                    }\r\n");
      out.write("                    // 건물명이 있고, 공동주택일 경우 추가한다.\r\n");
      out.write("                    if(data.buildingName !== '' && data.apartment === 'Y'){\r\n");
      out.write("                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("                    }\r\n");
      out.write("                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\r\n");
      out.write("                    if(extraAddr !== ''){\r\n");
      out.write("                        extraAddr = ' (' + extraAddr + ')';\r\n");
      out.write("                    }\r\n");
      out.write("                    // 조합된 참고항목을 해당 필드에 넣는다.\r\n");
      out.write("                    document.getElementById(\"sample6_extraAddress\").value = extraAddr;\r\n");
      out.write("                \r\n");
      out.write("                } else {\r\n");
      out.write("                    document.getElementById(\"sample6_extraAddress\").value = '';\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("                document.getElementById('sample6_postcode').value = data.zonecode;\r\n");
      out.write("                document.getElementById(\"sample6_address\").value = addr;\r\n");
      out.write("                // 커서를 상세주소 필드로 이동한다.\r\n");
      out.write("                document.getElementById(\"sample6_detailAddress\").focus();\r\n");
      out.write("            }\r\n");
      out.write("        }).open();\r\n");
      out.write("    } \r\n");
      out.write("    \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$(document).on('click','#duplicate_check',function(){\r\n");
      out.write(" 	\r\n");
      out.write("	let id = $('#idForm').val();\r\n");
      out.write("	\r\n");
      out.write("	console.log(id);\r\n");
      out.write("	\r\n");
      out.write("	if(id != ''){\r\n");
      out.write("	$.ajax({	 \r\n");
      out.write("		type:'get'\r\n");
      out.write("		,url:'http://localhost:9887/OpenBanking/checkId'\r\n");
      out.write("		,data:{\r\n");
      out.write("			id_check: id\r\n");
      out.write("		},datetype:'jsonp'\r\n");
      out.write("		,success:callback	\r\n");
      out.write("		\r\n");
      out.write("		,error:function(){\r\n");
      out.write("			alert('실패');\r\n");
      out.write("		}\r\n");
      out.write("	\r\n");
      out.write("	})\r\n");
      out.write("	}else{\r\n");
      out.write("		$('#write_your_id').click();\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" function callback(id){\r\n");
      out.write("	\r\n");
      out.write("	console.log(\"id값:\" + id);\r\n");
      out.write("	$('#checkMessage').empty();\r\n");
      out.write("	\r\n");
      out.write("	if(id != null){\r\n");
      out.write("		$('#checkMessage').append('<div class=\"text-danger mt-2\" style=\"font-size:24px;\"> duplicated ID </div><br>');	\r\n");
      out.write("	 	$('#address').hide();\r\n");
      out.write("	 	$('#phoneNumber').hide();\r\n");
      out.write("	 	$('#password').hide();\r\n");
      out.write("	 	$('#signUp').hide();\r\n");
      out.write("	\r\n");
      out.write("	}else{	\r\n");
      out.write("		$('#alertStart').click();\r\n");
      out.write("	 	$('#address').show();\r\n");
      out.write("	 	$('#phoneNumber').show();\r\n");
      out.write("	 	$('#password').show();\r\n");
      out.write("	 	$('#signUp').show();\r\n");
      out.write("	 	\r\n");
      out.write("	}\r\n");
      out.write("		\r\n");
      out.write("} \r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/jsp/include/topAndSide.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("<section class=\"onlyfor\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("<!-- Button trigger modal -->\r\n");
      out.write(" <div class=\"d-flex justify-content-center\">\r\n");
      out.write("	<button type=\"button\" class=\"btn btn-primary \" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\" id=\"click\">\r\n");
      out.write("  		SIGN UP\r\n");
      out.write("	</button>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\r\n");
      out.write("  <div class=\"modal-dialog\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">SIGN UP</h5>\r\n");
      out.write("        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\" id=\"close1\"></button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\"> \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("  	<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Member/JoinProcess.do\" method=\"post\" name=\"writeForm\" onsubmit=\"return checkForm()\">\r\n");
      out.write("			NAME<input type=\"text\" name=\"name\" size=20 placeholder=\"NAME\" class=\"form-control\"><br>\r\n");
      out.write("			<div class=\"row g-3\">\r\n");
      out.write("			\r\n");
      out.write("				<div>\r\n");
      out.write("					social security number\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"col-sm\">\r\n");
      out.write("   				    <input type=\"text\" class=\"form-control\" placeholder=\"resident resistration number\" aria-label=\"City\" name=\"iden_number1\" maxlength='6'>\r\n");
      out.write("  				</div>\r\n");
      out.write("  				\r\n");
      out.write("  				<div class=\"col-sm\">\r\n");
      out.write("   					<input type=\"password\" class=\"form-control\" placeholder=\"resident resistration number\" aria-label=\"State\" name=\"iden_number2\" maxlength='7'>\r\n");
      out.write("  				</div>			\r\n");
      out.write("  			</div>\r\n");
      out.write("  			\r\n");
      out.write("  			<div class=\"mt-3\">\r\n");
      out.write("			ID <input type=\"text\" name=\"id\" size=20 placeholder=\"id\" class=\"form-control\" id=\"idForm\"><br><button type=\"button\" id=\"duplicate_check\" class=\"btn btn-warning\">duplicate check</button>		\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"checkMessage\"></div>\r\n");
      out.write("			<button id =\"alertStart\"></button>  \r\n");
      out.write("			<button id =\"write_your_id\"></button>\r\n");
      out.write("			<button id =\"noBlank\"></button>\r\n");
      out.write("			<div class=\"mt-1\" id=\"password\">\r\n");
      out.write("			PASSWORD<input type=\"password\" name=\"password\" size=20 placeholder=\"password\" class=\"form-control\"><br>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row g-3\" id=\"address\">\r\n");
      out.write("				<div>\r\n");
      out.write("					ADDRESS\r\n");
      out.write("				</div>\r\n");
      out.write("				<input type=\"text\" id=\"sample6_postcode\" placeholder=\"zipCode\" name=\"zipCode\">\r\n");
      out.write("				<input type=\"button\" onclick=\"sample6_execDaumPostcode()\" value=\"FIND ADDRESS\" class=\"btn btn-info\"><br>\r\n");
      out.write("				<input type=\"text\" id=\"sample6_address\" placeholder=\"Adress\" name=\"address\"><br>\r\n");
      out.write("				<input type=\"text\" id=\"sample6_detailAddress\" placeholder=\"detail Address\" name=\"detailAddress\">\r\n");
      out.write("				<input type=\"text\" id=\"sample6_extraAddress\" placeholder=\"reference\" name=\"referAddress\">\r\n");
      out.write("			</div>\r\n");
      out.write("			<br>\r\n");
      out.write("			<div class=\"row g-3\" id=\"phoneNumber\">\r\n");
      out.write("				<div>\r\n");
      out.write("					PHONE NUMBER\r\n");
      out.write("				</div>\r\n");
      out.write("  				<div class=\"col-sm\">\r\n");
      out.write("   				     <input type=\"text\" class=\"form-control\" placeholder=\"010\" aria-label=\"City\" name=\"tel1\" maxlength='3' >\r\n");
      out.write("  				</div>\r\n");
      out.write("  				<div class=\"col-sm\">\r\n");
      out.write("   					 <input type=\"text\" class=\"form-control\" placeholder=\"0000\" aria-label=\"State\" name=\"tel2\" maxlength='4'>\r\n");
      out.write("  				</div>\r\n");
      out.write("  				<div class=\"col-sm\">\r\n");
      out.write("    				<input type=\"text\" class=\"form-control\" placeholder=\"0000\" aria-label=\"Zip\" name=\"tel3\" maxlength='4'>\r\n");
      out.write("  				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\" id=\"close2\">Close</button>\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\" id=\"signUp\">SIGN UP</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  </form> \r\n");
      out.write("</div> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/jsp/include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("  	\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <script src=\"/OpenBanking/resources/js/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap tether Core JavaScript -->\r\n");
      out.write("    <script src=\"/OpenBanking/resources/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"/OpenBanking/resources/js/app-style-switcher.js\"></script>\r\n");
      out.write("    <script src=\"/OpenBanking/resources/js/jquery.sparkline.min.js\"></script>\r\n");
      out.write("    <!--Wave Effects -->\r\n");
      out.write("    <script src=\"/OpenBanking/resources/js/waves.js\"></script>\r\n");
      out.write("    <!--Menu sidebar -->\r\n");
      out.write("    <script src=\"/OpenBanking/resources/js/sidebarmenu.js\"></script>\r\n");
      out.write("    <!--Custom JavaScript -->\r\n");
      out.write("    <script src=\"/OpenBanking/resources/js/custom.js\"></script>\r\n");
      out.write("    <!--This page JavaScript -->\r\n");
      out.write("    <!--chartis chart-->\r\n");
      out.write("    <script src=\"/OpenBanking/resources/js/chartist.min.js\"></script>\r\n");
      out.write("    <script src=\"/OpenBanking/resources/js/chartist-plugin-tooltip.min.js\"></script>\r\n");
      out.write("    <script src=\"/OpenBanking/resources/js/dashboard1.js\"></script>\r\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
