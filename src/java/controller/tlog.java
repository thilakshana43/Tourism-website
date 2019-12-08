/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
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
@WebServlet(urlPatterns = {"/tlog"})
public class tlog extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String pass=request.getParameter("pass");
        String cpass=request.getParameter("cpass"); 
        PrintWriter out=response.getWriter();
        if(pass.equals(cpass))
        {
            String uname=request.getParameter("uname");
            String tel=request.getParameter("tel");
            String email=request.getParameter("email");
            String coun=request.getParameter("coun");
            String name=request.getParameter("name");
             

        
            
        String SQL="INSERT INTO tourist_signup VALUES('"+uname+"','"+pass+"','"+name+"','"+tel+"','"+email+"','"+coun+"')";
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Travel","root","");
            com.mysql.jdbc.Statement stmt=(com.mysql.jdbc.Statement)conn.createStatement();
            stmt.executeUpdate(SQL);
            RequestDispatcher r = request.getRequestDispatcher("SignupSuccess.jsp");
            r.include(request, response);
        }
        catch(Exception e)
                {
                    
                }
            
        }
        else
        {
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
            out.println("<script>");
            out.println("$(document).ready(function(){");
            out.println("swal('Password and confirm password are not matching.','','error')");
            out.println("});");
            out.println("</script>");
            RequestDispatcher rd=request.getRequestDispatcher("log.jsp");
            rd.include(request, response);
            
            
        }
    }


}
