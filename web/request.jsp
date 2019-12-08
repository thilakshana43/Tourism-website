<%-- 
    Document   : request
    Created on : Jun 15, 2019, 2:14:24 PM
    Author     : Maheshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            input[type="submit"] {
            height: 30px;
            color: #fff;
            font-size: 15px;
            background: #0080ff;
            cursor: pointer;
            border-radius: 25px;
            border: none;
            outline: none;
            margin-top: 3%;
            width: 100%;
        }
        input[type="reset"] {
            height: 30px;
            color: #fff;
            font-size: 15px;
            background: red;
            cursor: pointer;
            border-radius: 25px;
            border: none;
            outline: none;
            margin-top: 1%;
            width: 50%;
            text-align: center;
            margin-bottom: 5%;
        }
        
        </style>
    </head>
    <body background="10.jpg">
        <form action="requestservlet" method="Post">
            <center><br><br><br><br><br><br><br><br><br><br>
                <b><font face="Comic Sans MS" color="Red" size="10">Request Form</font></b><br><br><br>
                <table>
                    <tr>
                        <td>Name:</td>
                        <td><input type="text" name="name"></td>
                    </tr>
                    
                    <tr>
                        <td>Telephone:</td>
                        <td><input type="text" name="tel"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit"></td>
                        <td align="right"><input type="reset" value="Reset"></td>
                    </tr>
                </table>
            </center>
        </form>
    </body>
</html>
