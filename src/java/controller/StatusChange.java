/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
import java.sql.*;



@WebServlet(name = "StatusChange", urlPatterns = {"/StatusChange"})
public class StatusChange extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
       String id = request.getParameter("ID");
         
        
            String SQL=" UPDATE `local_request` SET `Status` = 'Yes' WHERE `ID` ='"+id+"'";
       try{
          Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/Travel","root","");
            com.mysql.jdbc.Statement stmt=(com.mysql.jdbc.Statement) conn.createStatement();
            
             
              stmt.executeUpdate(SQL);
              response.sendRedirect("adminnew.jsp");
            
                
            

       
       
       
       }
       catch(Exception e)
       {
       }
       
       
       
       
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
