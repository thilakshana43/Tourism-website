<%-- 
    Document   : signup
    Created on : Jul 7, 2019, 1:27:45 PM
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
    <body background='train.jpg'>
        <div class="post-box">
        <form action="sign" method="Post">
            <center><br>
                <b><font face="Comic Sans MS" color="White" size="10">Sign Up</font></b>
               <table>
                   <tr>
                       <td>Owner's Name:</td>
                       <td><input type="text" name="name" ></td>
                   </tr>
                   <tr>
                       <td>Business Name:</td>
                       <td><input type="text" name="bname" ></td>
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
