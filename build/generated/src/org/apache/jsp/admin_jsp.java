package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>admin Page</title>\n");
      out.write("        <style>\n");
      out.write("            input[type=\"submit\"] {\n");
      out.write("            height: 30px;\n");
      out.write("            color: #fff;\n");
      out.write("            font-size: 15px;\n");
      out.write("            font-family: calibri;\n");
      out.write("            background: #0080ff;\n");
      out.write("            cursor: pointer;\n");
      out.write("            border-radius: 25px;\n");
      out.write("            border: none;\n");
      out.write("            outline: none;\n");
      out.write("            margin-top: 3%;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("        input[type=\"reset\"] {\n");
      out.write("            height: 30px;\n");
      out.write("            color: #fff;\n");
      out.write("            font-size: 15px;\n");
      out.write("            font-family: calibri;\n");
      out.write("            background: red;\n");
      out.write("            cursor: pointer;\n");
      out.write("            border-radius: 25px;\n");
      out.write("            border: none;\n");
      out.write("            outline: none;\n");
      out.write("            margin-top: 1%;\n");
      out.write("            width: 50%;\n");
      out.write("            text-align: center;\n");
      out.write("            margin-bottom: 5%;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"fir.jpg\">\n");
      out.write("    <center>\n");
      out.write("        <br><br><br><br>\n");
      out.write("        <form action=\"adminlog\" method=\"Post\" >\n");
      out.write("            <b><font face=\"Comic Sans MS\" color=\"Black\" size=\"10\">Login</font></b><br><br>\n");
      out.write("            <table>\n");
      out.write("                <tr height=\"50\">\n");
      out.write("                    <td><b>Username:</b></td>\n");
      out.write("                    <td><input type=\"text\" name=\"uname\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr height=\"50\">\n");
      out.write("                    <td><b>Password:</b></td>\n");
      out.write("                    <td><input type=\"password\" name=\"pass\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr height=\"50\">\n");
      out.write("                    <td><input type=\"submit\" value=\"Submit\" ></td>\n");
      out.write("                    <td align=\"right\"><input type=\"reset\" value=\"Reset\" ></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
