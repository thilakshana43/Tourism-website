/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beans.tloginBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import beans.tloginBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.Cookie;

/**
 *
 * @author Maheshi
 */
@WebServlet(urlPatterns = {"/foreignlog"})
public class foreignlog extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        
        tloginBean lb=new tloginBean();
        lb.setUname(request.getParameter("uname"));
        lb.setPass(request.getParameter("pass"));
        String uname=lb.getUname();
        String pass=lb.getPass();
        PrintWriter out=response.getWriter();
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
String sql ="SELECT * FROM tourist_signup  ";
ResultSet rs = statement.executeQuery(sql);

while(rs.next()){
    String user=rs.getString("User_Name");
    String passw=rs.getString("Password");
    if(user.equals(uname) && passw.equals(pass)){
        Cookie loginCookie = new Cookie("password",passw);
        loginCookie.setMaxAge(30*60);
        response.addCookie(loginCookie);
         HttpSession session = request.getSession(true);
        session.setAttribute("user", user);
        response.sendRedirect("foindex.jsp");
    }
    else{
        out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
            out.println("<script>");
            out.println("$(document).ready(function(){");
            out.println("swal('Incorrect username or password.','','error')");
            out.println("});");
            out.println("</script>"); 
            RequestDispatcher r=request.getRequestDispatcher("ForeignLogin.jsp");
            r.include(request, response);
    }
   
}

 
    }
catch(Exception e){
    
}
    
         
         
    } 


}
