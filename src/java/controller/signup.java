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
import java.sql.ResultSet;
import java.sql.Statement;
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
@WebServlet(name = "signup", urlPatterns = {"/signup"})
public class signup extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                PrintWriter out=response.getWriter();
                String name = request.getParameter("name");
                String driver = "com.mysql.jdbc.Driver";
                String connectionUrl = "jdbc:mysql://localhost:3306/";
                String database = "Travel";
                String userid = "root";
                String password = "";
                try {
                Class.forName(driver);
                } catch (ClassNotFoundException e) {
                e.printStackTrace();
                }
                Connection connection = null;
                Statement statement = null;

                try{
                connection = DriverManager.getConnection(connectionUrl+database, userid, password);
                statement=connection.createStatement();
                String sql = "SELECT * FROM `local_request` WHERE `Name` ='"+name+"' AND `Status` = 'yes'";
                ResultSet rs = statement.executeQuery(sql);
                if (rs.next()) {

                response.sendRedirect("signup.jsp");
                
            } else {
                RequestDispatcher rd = request.getRequestDispatcher("LocalLogin.jsp");
                rd.include(request, response);
          
            }
                }
                catch(Exception e){
                    out.println(""+e);
                }
    }



}
