/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.63
 * Generated at: 2022-07-28 07:14:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.welcome;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcomeTransfer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"/OpenBanking/resources/css/chartist-plugin-tooltip.css\"> \r\n");
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
      out.write("  <script src=\"https://developers.kakao.com/sdk/js/kakao.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" 	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/jsp/include/topAndSide.jsp", out, false);
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("\r\n");
      out.write("<div id=\"carouselExampleSlidesOnly\" class=\"carousel slide\" data-bs-ride=\"carousel\">\r\n");
      out.write("  <div class=\"carousel-inner\">\r\n");
      out.write("    <div class=\"carousel-item active carousel-image-1\">.\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item carousel-image-2\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item carousel-image-3\">\r\n");
      out.write(" \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- Button trigger modal -->\r\n");
      out.write("	<button type=\"button\" class=\"btn btn-primary\" id=\"trigger\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\">\r\n");
      out.write(" 		 Launch demo modal\r\n");
      out.write("	</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Modal -->\r\n");
      out.write("	<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("  		<div class=\"modal-dialog\">\r\n");
      out.write("    		<div class=\"modal-content py-5\">\r\n");
      out.write("    			 <div class=\"modal-body\">\r\n");
      out.write("     	 			 <p class=\"fs-3 text-center\">FROM ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${withrawalName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" TO ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${depositName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" TRANSFER COMPLETED </p>\r\n");
      out.write("     	 			 <p class=\"fs-3 text-center\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tranDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </p> \r\n");
      out.write("     	  		\r\n");
      out.write("     	 			 <p class=\"fs-6 text-center\">THANK YOU ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userVO.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("! <p>\r\n");
      out.write("   \r\n");
      out.write("     				<div class=\"d-flex justify-content-center\">\r\n");
      out.write("     					 <img src=\"/OpenBanking/resources/images/kakao.png\" alt=\"user-img\" class=\"img-circle\" width=\"30\">\r\n");
      out.write("     	   				<button id=\"kakaotalk-sharing-btn\">SEND TRANSFER RESULT</button>\r\n");
      out.write("     	   			</div>\r\n");
      out.write("     	   \r\n");
      out.write("     			</div>\r\n");
      out.write("   			 </div>\r\n");
      out.write("  		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/jsp/include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("  	\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("document.addEventListener(\"DOMContentLoaded\",()=>{\r\n");
      out.write(" 	document.getElementById(\"trigger\").click();\r\n");
      out.write(" 	document.getElementById(\"trigger\").style.display = 'none';\r\n");
      out.write("	\r\n");
      out.write(" 	\r\n");
      out.write(" 	\r\n");
      out.write("/*  	const fail = document.getElementById(\"fail\"); */\r\n");
      out.write(" 	\r\n");
      out.write(" 	/* fail.addEventListener(\"click\",()=>{\r\n");
      out.write(" 		document.getElementById(\"click\").click();\r\n");
      out.write(" 	}); */\r\n");
      out.write(" 	\r\n");
      out.write(" 	\r\n");
      out.write(" 	\r\n");
      out.write(" });\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("const withrawalName = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${withrawalName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("const tranAmount ='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tranAmount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("const tranDate = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tranDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("const depositName = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${depositName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("console.log(withrawalName,tranAmount,tranDate,depositName); \r\n");
      out.write("\r\n");
      out.write("Kakao.init('2a5469364f4e047b9ce872e670e9dadb'); \r\n");
      out.write(" // 이건 각자 발급받은 키 사용하셔야 합니다!!\r\n");
      out.write("Kakao.Share.createDefaultButton({\r\n");
      out.write("    container: '#kakaotalk-sharing-btn',\r\n");
      out.write("    objectType: 'feed',\r\n");
      out.write("    content: {\r\n");
      out.write("      title: '이체 알림',\r\n");
      out.write("      description: withrawalName + '님이 ' + tranDate + '에 ' + depositName + '님에게 ' +  tranAmount+ '원을 이체하였습니다.' ,\r\n");
      out.write("      imageUrl:\r\n");
      out.write("        'https://product-image.juniqe-production.juniqe.com/media/catalog/product/seo-cache/x800/265/130/265-130-101P/J-Mottos-by-Sinan-Saydik-Poster.jpg',\r\n");
      out.write("      link: {\r\n");
      out.write("        mobileWebUrl: 'https://developers.kakao.com',\r\n");
      out.write("        androidExecutionParams: 'test',\r\n");
      out.write("      },\r\n");
      out.write("    },\r\n");
      out.write("    itemContent: {\r\n");
      out.write("      profileText: 'J_INVESTMENT_BANK',\r\n");
      out.write("      profileImageUrl: 'https://product-image.juniqe-production.juniqe.com/media/catalog/product/seo-cache/x800/265/130/265-130-101P/J-Mottos-by-Sinan-Saydik-Poster.jpg',\r\n");
      out.write("    },\r\n");
      out.write("    social: {\r\n");
      out.write("      likeCount: 10,\r\n");
      out.write("      commentCount: 20,\r\n");
      out.write("      sharedCount: 30,\r\n");
      out.write("    },\r\n");
      out.write("    buttons: [\r\n");
      out.write("      {\r\n");
      out.write("        title: '자세히 보기',\r\n");
      out.write("        link: {\r\n");
      out.write("          mobileWebUrl: 'https://developers.kakao.com',\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("    ]\r\n");
      out.write("  });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.12.4.min.js\"></script>\r\n");
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
