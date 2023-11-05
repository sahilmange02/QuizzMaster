<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login page</title>
    <link rel="stylesheet" href="css/login.css">
    <script src="https://kit.fontawesome.com/a4fdbdee6c.js" crossorigin="anonymous"></script>
</head>
<body>
	<form action="StudentLogin" method="post">
    <div class="container">
        <div class="form-box">
            <h1>Student Login</h1>${requestScope.loginStatus}
            <div class="input-group">
                <div class="input-field">
                    <i class="fa-solid fa-envelope"></i>
                    <input type="username" placeholder="Enter your username" name="username">
                </div>
                <div class="input-field">
                    <i class="fa-solid fa-lock"></i>
                    <input type="password" placeholder="Enter your password" name="password">
                </div>
                <p>New User? <a href="register.jsp">Register</a></p>
            </div>
           <div class="button-field"> <button class="button-field" type="submit" name="action" onclick="myevent()">
            
           
                <!-- <button type="button">Sign in</button> -->
                     Login
                </button>
            </div>
        </div>
    </div>
    </form>
  	<div id="result" class="result">
    <pre>
        ${requestScope.loginStatus}
    </pre>
</div>
 <script>
		function myevent(){
			console.log("Hello")
		} 
 </script>
</body>
</html>
