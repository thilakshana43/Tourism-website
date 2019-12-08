<%-- 
    Document   : admin
    Created on : Jun 15, 2019, 12:53:43 PM
    Author     : Maheshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>admin Page</title>
        <link href="form.css" rel="stylesheet" type="text/css"/>
    </head>
    <body background="fir.jpg">
    <center>
        <br><br><br><br>
        <div class="login-box">
        <form action="adminlog" method="Post" >
            <b><font face="Comic Sans MS" color="White" size="10">Login</font></b><br><br>
            <table>
                <tr height="50">
                    <td><b>Username:</b></td>
                    <td><input type="text" name="uname"></td>
                </tr>
                <tr height="50">
                    <td><b>Password:</b></td>
                    <td><input type="password" name="pass"></td>
                </tr>
                <tr height="200">
                    <td><input type="submit" value="Submit" ></td>
                    <td align="center"><input type="reset" value="Reset" ></td>
                </tr>
            </table>
        </form>
        </div>
    </center>
    </body>
</html>