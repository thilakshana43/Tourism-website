<%-- 
    Document   : Timeline
    Created on : Jun 17, 2019, 10:01:01 AM
    Author     : Maheshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
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
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Timeline Page</title>
        <link href="form.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <center>
                <h2> <em>Hello <%=session.getAttribute("user")%></em></h2>
            </center>
        <%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from local_post";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
    
%>
<form class="post-box" action="bookset" method="Post">
            
            <table width="100%">
                 <input type="submit" value="Book"> 
                <tr>
                    <td> <h1> <%=resultSet.getString("Title") %></h1></td> 
                </tr>
                <tr>
                    <td><center><%out.print(resultSet.getBlob("Image")); %></center></td>
                </tr>
                <tr>
                    <td><p><%=resultSet.getString("Description") %></p></td>
                </tr>
                <tr>
                    <td><h3>Price: Rs:<%=resultSet.getString("Price") %>/=</h3></td>
                </tr>
                <tr>
                    <td align="right"><%=resultSet.getString("Name") %></td>
                </tr>
                
            </table>
                
               
               
        </form>
                
                
                


<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>

                      
                    
                
    </body>
</html>
