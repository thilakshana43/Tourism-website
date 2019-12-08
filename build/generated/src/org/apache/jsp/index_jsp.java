package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"slideshow.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("        \n");
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
      out.write("        \n");
      out.write("        <hr size=\"5\" style=\"background-color: black\">\n");
      out.write("         </form>\n");
      out.write("          <dl>\n");
      out.write("              <center> <dt><h1><b><font face=\"Comic Sans MS\" color=\"blue\" size=\"10\">Introduction to Sri Lanka</font></b></h1></dt></center>\n");
      out.write("            <br><br><br>\n");
      out.write("            \n");
      out.write("             <section class=\"slideshow\">\n");
      out.write("\t<div class=\"content\">\n");
      out.write("\t\t<div class=\"content-carrousel\">\n");
      out.write("\t\t\t<figure class=\"shadow\"><img src=\"1.jpg\"></figure>\n");
      out.write("\t\t\t<figure class=\"shadow\"><img src=\"2.jpg\"></figure>\n");
      out.write("\t\t\t<figure class=\"shadow\"><img src=\"3.jpg\"></figure>\n");
      out.write("\t\t\t<figure class=\"shadow\"><img src=\"4.jpg\"></figure>\n");
      out.write("\t\t\t<figure class=\"shadow\"><img src=\"5.jpg\"></figure>\n");
      out.write("\t\t\t<figure class=\"shadow\"><img src=\"6.jpg\"></figure>\n");
      out.write("\t\t\t<figure class=\"shadow\"><img src=\"7.jpg\"></figure>\n");
      out.write("\t\t\t<figure class=\"shadow\"><img src=\"8.jpg\"></figure>\n");
      out.write("\t\t\t<figure class=\"shadow\"><img src=\"9.jpg\"></figure>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("        </div> \n");
      out.write("\t\n");
      out.write("</section>\n");
      out.write("            \n");
      out.write("            <br><br>  <br><br> <br><br> <br><br> <br><br> <br><br> <br><br> \n");
      out.write("            <center><h3><b>\n");
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
      out.write("</b></h3>\n");
      out.write("</center>\n");
      out.write("             \n");
      out.write("\n");
      out.write("\t \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
