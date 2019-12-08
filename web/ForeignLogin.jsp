<%-- 
    Document   : ForeignLogin
    Created on : Jun 16, 2019, 7:55:08 PM
    Author     : Maheshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="form.css" rel="stylesheet" type="text/css"/>
        <style>
            a:link, a:visited {
                background-color: #ffb84d;
                color: white;
                padding: 14px 25px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                 border-radius: 10px;
            }

            a:hover, a:active {
                background-color:  #ffb84d;
            }
        
        </style>
    </head>
    <body background="7.jpg"  >
    <center>
        <br><br><br>
        <div class="login-box">
        <form action="foreignlog" method="Post" >
            <b><font face="Comic Sans MS" color="White" size="10">Login</font></b><br><br><br><br><br>
            <table>
                <tr height="50">
                    <td><b>Username:</b></td>
                    <td><input type="text" name="uname"></td>
                </tr>
                <tr height="50">
                    <td><b>Password:</b></td>
                    <td><input type="password" name="pass"></td>
                </tr>
                <tr height="50">
                    <td><input type="submit" value="Submit">
                    <td align="right"><input type="reset" value="Reset" ></td>
                </tr>
            </table>
            <a href="log.jsp">Sign Up</a>
        </form>
        </div>
    </center>
    </body>
</html>
