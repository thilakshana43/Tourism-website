<%-- 
    Document   : log
    Created on : Jun 15, 2019, 2:28:14 PM
    Author     : Maheshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="form.css" rel="stylesheet" type="text/css"/>
    </head>
    <body background="foreign.jpg">
        <div class="post-box">
        <form action="tlog" method="Post">
            <center>
                <b><font face="Comic Sans MS" color="white" size="10">Sign Up</font></b>
               <table>
                   <tr>
                       <td>Name:</td>
                       <td><input type="text" name="name" placeholder="Enter your name"></td>
                   </tr>
                   <tr>
                       <td>Email:</td>
                       <td><input type="email" name="email"></td>
                   </tr>
                   <tr>
                       <td>Telephone:</td>
                       <td><input type="text" name="tel"></td>
                   </tr>
                   <tr>
                       <td>Country:</td>
                       <td><input type="text" name="coun"></td>
                   </tr>
                   <tr>
                       <td>Username:</td>
                       <td><input type="text" name="uname" ></td>
                   </tr>
                   
                   <tr>
                       <td>Password:</td>
                       <td><input type="password" name="pass"></td>
                   </tr>
                   <tr>
                       <td>Confirm Password:</td>
                       <td><input type="password" name="cpass"></td>
                   </tr>
                   <tr>
                       <td><input type="submit" value="Submit"></td>
                       <td align="right"><input type="reset" value="Reset"></td>
                   </tr>
               </table> 
            </center>
        </form>
        </div>
    </body>
</html>
