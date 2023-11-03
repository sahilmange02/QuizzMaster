<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register page</title>
    <link rel="stylesheet" href="css/login.css">
    <script src="https://kit.fontawesome.com/a4fdbdee6c.js" crossorigin="anonymous"></script>
    <style>
        .role{
            margin-right: 3.5rem;
            display: inline-block;
        }
    </style>
</head>

<body><form action="register" method="post">
    <div class="container">
        <div class="form-box">
            <h1>Register</h1>
            <div class="input-group">${requestScope.Status}
                <div class="input-field">
                    <i class="fa-solid fa-envelope"></i>
                    <input type="username" placeholder="Please enter your username" name="username">
                </div>
                <div class="input-field">
                    <i class="fa-solid fa-lock"></i>
                    <input type="password" placeholder="Enter your password" name="password">
                </div>
                <div class="input-field">
                    <i class="fa-solid fa-lock"></i>
                    <input type="password" placeholder="Confirm Password" name="confirm_password">
                </div>
                <div class="input-role" >
                    <div class="role" >
                        Role :
                    </div>
                    <div class="role" >
                       
                        <input type="radio" placeholder="Enter your password" name="role" value="Student" required>Student 
                    </div>
                    <input type="radio" placeholder="Enter your password" name="role" value="Faculty" required>Teacher 
                </div>
            </div>
            <div class="button-field"> <button class="button-field" type="submit" name="action">Register</button>
            </div>
        </div>
    </div>
    </form>
</body>
</html>