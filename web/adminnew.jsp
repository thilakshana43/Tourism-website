
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%

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
        <title>JSP Page</title>
        <style>
            .login-box input[type="submit"]
{
    border: none;
    outline: none;
    height: 40px;
    background: blue;
    color: #fff;
    font-size: 18px;
    border-radius: 20px;
}
.login-box input[type="submit"]:hover
{
    cursor: pointer;
    background: #39dc79;
    color: #000;
}
            button {
            height: 30px;
            color: #fff;
            font-size: 15px;
            background: red;
            cursor: pointer;
            border-radius: 25px;
            border: none;
            outline: none;
            margin-top: 3%;
            width: 100%;
        }
        </style>
    </head>
    <body background="8.jpg">
    <center>
        <b><font face="Comic Sans MS" color="Green" size="10">Accept Locals</font></b><br><br><br>
            <%
                
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from local_request where status='NO'";
resultSet = statement.executeQuery(sql);


%>
                <form >
            <center>
                
            <table width="50%" border="1">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Contact No</th>
                    
                </tr><%while(resultSet.next()){%>
                <tr>
                    <td><%=resultSet.getString("ID") %></td>
                    <td><%=resultSet.getString("Name") %></td> 
                    <td><%=resultSet.getString("Tel_No") %></td>
                
                     
                    
                </tr><%}%>
            </table>
            </center>        
        </form>
        <form action="delete" method="Post">
            <center>
             
                <table>
                 
                    <tr><td> Enter ID : <input type="text" name="ID"></td> 
                
                        <td><button> Delete Request </button></td></tr> 
                    
               </table>
            
            </center>
        </form>
         <form action="StatusChange" method="Post">
            <center>
             
                <table>
                 
                    <tr><td> Enter ID : <input type="text" name="ID"></td> 
                
                        <td><button> Accept Request </button></td></tr> 
                    
               </table>
            
            </center>
        </form>

<%

connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
     <div class="login-box">
        
            <form action="logout"  method="Post">       
                <em><h3>Hello <%=session.getAttribute("user")%></h3></em><br>
            <input type="submit" value="Logout" name="Logout" >  
            </form></div>  
     </body>
</html>
