package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home Page</title>\n");
      out.write("        <style>\n");
      out.write("            a:link, a:visited {\n");
      out.write("                background-color: blue;\n");
      out.write("                color: white;\n");
      out.write("                font-family: calibri; \n");
      out.write("                padding: 14px 25px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a:hover, a:active {\n");
      out.write("                background-color: #ffad33;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"home.jpg\" style=\"width: 100%;height: 100%\">\n");
      out.write("\t<nav style=\"background-color:#4db8ff\" >\n");
      out.write("\t\t<br><br><font face=\"calibri\" color=\"red\" size=\"8\">Sri Lanka.lk</font>\n");
      out.write("                <center>\n");
      out.write("                   \n");
      out.write("                </center>\n");
      out.write("\t\t<br><br><br>\n");
      out.write("\t\t<a href=\"Home.jsp\">Home</a>\n");
      out.write("\t\t<a href=\"admin.jsp\">Admin</a>\n");
      out.write("\t\t<a href=\"login.jsp\">Sign Up</a>\n");
      out.write("\t\t<a href=\"Timeline.jsp\">Timeline</a>\n");
      out.write("\t</nav><br><br><br>\n");
      out.write("        <hr size=\"5\" style=\"background-color: black\">\n");
      out.write("        \n");
      out.write("          <dl>\n");
      out.write("                <dt><h1><b><font face=\"Comic Sans MS\" color=\"blue\" size=\"10\">Introduction to Sri Lanka</font></b></h1></dt>\n");
      out.write("            <br><br><br>\n");
      out.write("            <section>\n");
      out.write("                        <img class=\"slide\" src=\"1.jpg\" style=\"width: 500px;height: 300px\" align=\"right\">\n");
      out.write("                        <img class=\"slide\" src=\"2.jpg\" style=\"width: 500px;height: 300px\" align=\"right\">\n");
      out.write("                        <img class=\"slide\" src=\"3.jpg\" style=\"width: 500px;height: 300px\" align=\"right\">\n");
      out.write("                        <img class=\"slide\" src=\"4.jpg\" style=\"width: 500px;height: 300px\" align=\"right\">\n");
      out.write("                        <img class=\"slide\" src=\"5.jpg\" style=\"width: 500px;height: 300px\" align=\"right\">\n");
      out.write("                        <img class=\"slide\" src=\"6.jpg\" style=\"width: 500px;height: 300px\" align=\"right\">\n");
      out.write("            </section>\n");
      out.write("            <dd>They say there is no other country in the world, like Sri Lanka. </dd> \n");
      out.write("            A smiling sun all year round, golden beaches, ancient cities, exciting <br>\n");
      out.write("            safaris, colourful culture, adventure sport and lovely people… where <br>\n");
      out.write("            else can you get all these in one place?<br>\n");
      out.write("            \n");
      out.write("            <dd>Found at the tip of India, this little exotic island is abundant</dd> \t\t\t\t\n");
      out.write("            with marvelous discoveries for any tourist. Be it a journey of exploring<br> \t\t\t\n");
      out.write("            the wilderness, an Ayurvedic wellness holiday, a relaxing get-away in<br> \n");
      out.write("            the sun, or even that quick business trip, there is something for everyone.\n");
      out.write("            <dd>Well connected transport systems or organised tours will see you</dd> \t\t\t\t\n");
      out.write("            visiting many a place in this island country. Enjoy the sun while\n");
      out.write("            lounging<br> on beach at Bentota, sighting Palmyra trees in Jaffna,\n");
      out.write("            snorkeling or kite<br> surfing at Kalpitiya or surfing the waves of\n");
      out.write("            Arugambay, It is where you can <br>discover leopards on Safari, be awed of\n");
      out.write("            ruins in Anuradhapura, visit orphaned <br>elephants at Pinnawela or climb \t\t\t  \n");
      out.write("            5th century rock fortress in Sigiriya. And as<br> you make your way up to \t\t\t\n");
      out.write("            the cooling climes, take a walk in the sprawling<br>botanical gardens in\n");
      out.write("            Kandy, visit the misty Horton Plains, and sip Ceylon tea <br>at a tea\n");
      out.write("            estate in Nuwara Eliya.\n");
      out.write("            \n");
      out.write("            </dl>\n");
      out.write("             \n");
      out.write("\n");
      out.write("\t<script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\t\tvar index=0;\n");
      out.write("\t\tcarousel();\n");
      out.write("\n");
      out.write("\t\tfunction carousel(){\n");
      out.write("\t\tvar i;\n");
      out.write("\t\tvar x=document.getElementsByClassName(\"slide\");\n");
      out.write("\t\tfor (i = 0; i < x.length; i++) {\n");
      out.write("\t\t\tx[i].style.display=\"none\";\n");
      out.write("\t\t}\n");
      out.write("\t\tindex++;\n");
      out.write("\t\tif (index>x.length) {index=1}\n");
      out.write("\t\tx[index-1].style.display=\"block\";\n");
      out.write("\t\tsetTimeout(carousel,3000);\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
