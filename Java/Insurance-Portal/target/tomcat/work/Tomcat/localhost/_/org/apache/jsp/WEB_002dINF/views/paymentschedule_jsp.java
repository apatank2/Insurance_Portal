/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-12-05 19:06:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import webapp.HelperClass;
import java.util.*;
import models.*;
import webapp.HelperClass;
import java.util.*;

public final class paymentschedule_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 ArrayList<PaymentSchedule> dataList = null; 
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/shared/footer.jsp", Long.valueOf(1511484028155L));
    _jspx_dependants.put("/WEB-INF/views/shared/navloginbar.jsp", Long.valueOf(1512496586892L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Welcome</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("body {margin:0;}\r\n");
      out.write("\r\n");
      out.write(".topnav {\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  background-color: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav a {\r\n");
      out.write("  float: left;\r\n");
      out.write("  color: #f2f2f2;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 14px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav a:hover {\r\n");
      out.write("  background-color: #ddd;\r\n");
      out.write("  color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav a.active {\r\n");
      out.write("  background-color: #4CAF50;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<title>Bootstrap 101 Template</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("    <script src=\"http://code.jquery.com/jquery.js\"></script>\r\n");
      out.write("    <script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("$( document ).ready(function() {\r\n");
      out.write("\t//alert(\"Hello in nav login bar\");\r\n");
      out.write("\t//alert($(\"#thisField\").val());\r\n");
      out.write("\t$(\"#hrefE\").hide();\r\n");
      out.write("\t$(\"#hrefM\").hide();\r\n");
      out.write("\t$(\"#hrefI\").hide();\r\n");
      out.write("\t$(\"#hrefC\").hide();\r\n");
      out.write("\tif($(\"#thisField\").val() == \"VER\"){\r\n");
      out.write("\t\t$(\"#hrefE\").show();\r\n");
      out.write("\t}\r\n");
      out.write("\tif($(\"#thisField\").val() == \"L1MEDAPPR\" || $(\"#thisField\").val() == \"L1NMEDAPPR\"){\r\n");
      out.write("\t\t$(\"#hrefM\").show();\r\n");
      out.write("\t}\r\n");
      out.write("\tif($(\"#thisField\").val() == \"ISSUE\"){\r\n");
      out.write("\t\t$(\"#hrefI\").show();\r\n");
      out.write("\t}\r\n");
      out.write("\tif($(\"#thisField\").val() == \"C\"){\r\n");
      out.write("\t\t$(\"#hrefC\").show();\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<input type=\"hidden\" id=\"thisField\" name=\"inputName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usertype}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
 String usertype1 = request.getParameter("usertype"); //System.out.println("UserType in nav login bar script tag =" + usertype1); 

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"topnav\">\r\n");
      out.write("  <a class=\"active\" href=\"../forms/home.jsp\">Home</a>\r\n");
      out.write("  <a href=\"../forms/contact.jsp\">Contact</a>\r\n");
      out.write("  <a href=\"../forms/about.jsp\">About</a>\r\n");
      out.write("  <a href=\"viewpolicy.do?usertype=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usertype}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" id = \"hrefE\">Verifier</a>\r\n");
      out.write("  <a class=\"active\" href=\"../forms/welcome.jsp\" id = \"hrefM\">Non Medical</a>\r\n");
      out.write("  <a class=\"active\" href=\"../forms/welcome.jsp\" id = \"hrefI\">Issuer</a>\r\n");
      out.write("  <a class=\"active\" href=\"../forms/welcome.jsp\" id = \"hrefC\">Customer</a>\r\n");
      out.write("  ");
if(usertype1 != null && usertype1.equalsIgnoreCase("VER")) {
      out.write("\r\n");
      out.write("  \t<a class=\"active\" href=\"viewpolicy.do?usertype=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usertype}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" id = \"hrefE\">Verifier</a>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  ");
if(usertype1 != null && (usertype1.equalsIgnoreCase("L1MEDAPPR") || usertype1.equalsIgnoreCase("L1NMEDAPPR") )) {
      out.write("\r\n");
      out.write("  \t<a class=\"active\" href=\"../forms/welcome.jsp?usertype=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usertype}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" id = \"hrefM\">Non Medical</a>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  ");
if(usertype1 != null && usertype1.equalsIgnoreCase("ISSUE")) {
      out.write("\r\n");
      out.write("  \t<a class=\"active\" href=\"../forms/welcome.jsp?usertype=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usertype}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" id = \"hrefI\">Issuer</a>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  ");
if(usertype1 != null && usertype1.equalsIgnoreCase("C")) {
      out.write("\r\n");
      out.write("  <a class=\"active\" href=\"../forms/welcome.jsp?usertype=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usertype}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" id = \"hrefC\">Customer</a>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<a href=\"login.do\" class=\"btn btn-info btn-lg\">\r\n");
      out.write("   <span class=\"glyphicon glyphicon-log-out\"></span> Log out\r\n");
      out.write("</a>\r\n");
      out.write("<h1>Welcome to Life Insurance Portal!</h1>\r\n");
      out.write("\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t$( document ).ready(function() {\r\n");
      out.write("\t\t$(\"#divNoGraph\").show();\r\n");
      out.write("\t\t$(\"#divHiddenCalculate\").hide();\r\n");
      out.write("\t\t$(\"#divHidden\").hide();\r\n");
      out.write("\t\tif($(\"#hdnShowGraph\").val() == \"true\"){\r\n");
      out.write("\t\t\t$(\"#divPaymentSchedule\").show();\r\n");
      out.write("\t\t\t$(\"#divNoGraph\").hide();\r\n");
      out.write("\t\t\t$(\"#divCalculate\").show();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t\t$(\"#divPaymentSchedule\").hide();\r\n");
      out.write("\t\t\t$(\"#divNoGraph\").show();\r\n");
      out.write("\t\t\t$(\"#divCalculate\").hide();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif($(\"#hdnMessage\").val() != \"\"){\r\n");
      out.write("\t\t\talert($(\"#hdnMessage\").val());\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
 String usertype = request.getParameter("usertype"); 
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
dataList = new HelperClass().GetScheduleGraphInfo(); 
      out.write("\r\n");
      out.write("<input type=\"hidden\" id=\"hdnShowGraph\" name=\"hdnShowGraph\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${showgraph}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("<input type=\"hidden\" id=\"hdnMessage\" name=\"hdnMessage\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("<div id = \"divNoGraph\">\r\n");
      out.write("\t<h3>No approved application</h3>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("\t\r\n");
      out.write("\t<form action =\"paymentschedule.do\" method =\"post\">\r\n");
      out.write("\t  \t<div class=\"row\" id = \"divHiddenCalculate\" >\r\n");
      out.write("\t\t\t\t<div class=\"span8\"><input class=\"input-block-level\" id=\"applid\" name=\"applid\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${applid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"span8\"><input class=\"input-block-level\" id=\"showgraph\" name=\"showgraph\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${showgraph}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"span8\"><input class=\"input-block-level\" id=\"usertype\" name=\"usertype\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usertype}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t  \t<div id= \"divCalculate\">\r\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn btn-default\">Calculate Installment</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("<div id = \"divPaymentSchedule\">\r\n");
      out.write("\t<table class=\"table table-striped\">\r\n");
      out.write("\t<thead>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<th># Installment No</th>\r\n");
      out.write("\t<th>Due Date</th>\r\n");
      out.write("\t<th>Due amount</th>\r\n");
      out.write("\t<th>Paid Amount </th>\r\n");
      out.write("\t<th>Paid Flag </th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</thead>\r\n");
      out.write("\t<!-- For dynamically inserting data -->\r\n");
      out.write("\t");
for(int i = 0; i < dataList.size(); i++) {
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td scope=\"row\">");
      out.print( dataList.get(i).installmentNo );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print( dataList.get(i).dueDate );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print( dataList.get(i).dueAmount );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print( dataList.get(i).paidAmount );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print( dataList.get(i).paidFlag );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<form action =\"payment.do\" method =\"post\">\r\n");
      out.write("\t<div class=\"row\" id = \"divHidden\" >\r\n");
      out.write("\t\t<div class=\"span8\"><input class=\"input-block-level\" id=\"usertype\" name=\"usertype\" value = \"");
      out.print( usertype );
      out.write("\"></div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div><br/>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("<h1>This is footer</h1>");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
