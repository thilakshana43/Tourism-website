<%-- 
    Document   : createpost
    Created on : Jun 16, 2019, 3:46:19 PM
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
    <body background="temp.jpg" width="100%" >
        
        <div class="post-box">
            <form action="PostServe" method="Post">
        <center> 
            
            <table border="0">            
            <tr>
                <td>Title:
                <input type="text" name="t" placeholder="Title"></td>
            </tr>
            <tr>
                <td><p>Image:</p><br><input type="file" name="ima"></td>
            </tr>
            <tr>
                <td><p>Details</p>
                    <textarea id="txtarea" name="com" rows="4" cols="50" placeholder="Give Us More Information!!!"></textarea></td>
            </tr>
            <tr>
                <td>Name: <input type="text" name="ownername" placeholder="Owner's name"></td>
            </tr>
            <tr>
                <td>Price: <input type="text" name="prices" placeholder="LKR"></td>
            </tr>
            <tr><td><input type="submit" name="submit" value="Submit">
                    &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
                <input type="reset" name="reset" value="Reset" ></td>
            </tr>
            </table>
        </center>
            </form>
        </div><br><br>
    
    </body>
</html>
