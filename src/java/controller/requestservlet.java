/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.beans.Statement;
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

/**
 *
 * @author Maheshi
 */
@WebServlet(urlPatterns = {"/requestservlet"})
public class requestservlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name=request.getParameter("name");
        
        String tel=request.getParameter("tel");
        
        String SQL="INSERT INTO local_request (Name,Tel_No,Status) VALUES('"+name+"','"+tel+"','NO')";
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Travel","root","");
            com.mysql.jdbc.Statement stmt=(com.mysql.jdbc.Statement)conn.createStatement();
            stmt.executeUpdate(SQL);
            RequestDispatcher rd=request.getRequestDispatcher("RequestSuccess.jsp");
            rd.include(request, response);
        }
        catch(Exception e)
                {
                    
                }
        
    }

}
