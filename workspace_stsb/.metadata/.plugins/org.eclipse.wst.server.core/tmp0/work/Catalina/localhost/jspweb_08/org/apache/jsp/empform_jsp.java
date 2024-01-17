/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-01-12 06:34:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class empform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            background-color: #f2f2f2;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            height: 100vh;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .employee-form {\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        form {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            flex-direction: column;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        label {\r\n");
      out.write("            margin-bottom: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input {\r\n");
      out.write("            padding: 8px;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("            border-radius: 3px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        button {\r\n");
      out.write("            background-color: #3498db;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 3px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        button:hover {\r\n");
      out.write("            background-color: #217dbb;\r\n");
      out.write("        }\n");
      out.write("</style>\r\n");
      out.write("<script src=\"js/jquery-3.7.1.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("    // 폼 제출 이벤트 처리\r\n");
      out.write("    $('#employeeForm').submit(function (event) {\r\n");
      out.write("        // event.preventDefault();\r\n");
      out.write("\r\n");
      out.write("        // 입력된 값 가져오기\r\n");
      out.write("        var empid = $('#empid').val();\r\n");
      out.write("        var name = $('#name').val();\r\n");
      out.write("        var jobId = $('#jobId').val();\r\n");
      out.write("        var contact = $('#contact').val();\r\n");
      out.write("\r\n");
      out.write("        // 간단하게 콘솔에 출력 (실제로는 서버에 전송하거나 다른 작업 수행)\r\n");
      out.write("        console.log('사원번호:', empid);\r\n");
      out.write("        console.log('이름:', name);\r\n");
      out.write("        console.log('직급:', jobId);\r\n");
      out.write("        console.log('연락처:', contact);\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"employee-form\">\r\n");
      out.write("    <h2>직원 정보 등록</h2>\r\n");
      out.write("    <form id=\"employeeForm\" action=\"empreg.jsp\">\r\n");
      out.write("      <label for=\"empid\">사원번호:</label>\r\n");
      out.write("        <input type=\"text\" id=\"empid\" name=\"empid\" required>\r\n");
      out.write("      \r\n");
      out.write("        <label for=\"name\">이름:</label>\r\n");
      out.write("        <input type=\"text\" id=\"name\" name=\"name\" required>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"jobId\">직급:</label>\r\n");
      out.write("        <input type=\"text\" id=\"jobId\" name=\"jobId\" required>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"contact\">연락처:</label>\r\n");
      out.write("        <input type=\"text\" id=\"contact\" name=\"contact\" required>\r\n");
      out.write("\r\n");
      out.write("        <button type=\"submit\">등록</button>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
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
