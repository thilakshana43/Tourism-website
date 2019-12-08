 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Maheshi
 */
@WebServlet(urlPatterns = {"/adminlog"})
public class adminlog extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String name=request.getParameter("uname");
        String pass=request.getParameter("pass");
        PrintWriter out=response.getWriter();
        if(name.equals("Admin")&& pass.equals("admin123"))
        {
            HttpSession session = request.getSession(true);
        session.setAttribute("user", name);
            RequestDispatcher rd=request.getRequestDispatcher("adminnew.jsp");
            rd.include(request, response);
        }
        else
        {
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
            out.println("<script>");
            out.println("$(document).ready(function(){");
            out.println("swal('Incorrect username or password.','','error')");
            out.println("});");
            out.println("</script>");
            RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");
            rd.include(request, response);
        }
    }


}
