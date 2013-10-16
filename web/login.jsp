<%-- 
    Document   : index
    Created on : 20-09-2013, 11:31:40
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login - SiQuoia</title>
        <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
        <script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
        <script>
        try {  
            $(document).ready(function() {
//                $("form").submit(function(){
//                    alert("logging in");
//                });
            });
        } catch (error) {
          console.error("Your javascript has an error: " + error);
        }
        </script>
    </head>
    <body>
        <div class="top">
            <div id="logos">
                INSERTION OF COMPANY LOGOS
            </div>
        </div>
        <div class="content">
            <div id="formbody">
                <div id="formheader">
                    Log in/Sign up
                </div>
                <div id="formcontent">
                    <form action="SiquoiaFrontController">
                        <input name="email" placeholder="Email" type="email"/><br/>
                        <input name="password" placeholder="Password" type="password"/><br/>
                        <button type="submit" name="command" value="login">Log in</button>
                    </form>
                </div>
            </div>
        </div>
        
        <div class="bot">
            
        </div>
    </body>
</html>
