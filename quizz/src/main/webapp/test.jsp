<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@  page import="java.sql.*" %> 
<%@ page import="java.io.*" %>
<%@ page import="java.util.*" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MCQ Test</title>
    
</head>
<style>
	body {
    font-family: Arial, sans-serif;
}
.container {
    max-width: 600px;
    margin: 0 auto;
    padding: 20px;
}
.question {
    font-size: 18px;
    margin-bottom: 10px;
    background-color: inherit;
}
.options {
    margin-left: 20px;
}
.option {
    margin-bottom: 10px;
    display: block;
}
.box{
    background-color: rgb(241, 241, 232);
    padding: 20px;
    margin: 20px;
    border-radius: 10px;
}
button {
    display: block;
    margin-top: 10px;
    padding: 10px 20px;
    background-color: #007BFF;
    color: #fff;
    border: none;
    cursor: pointer;
}
	
</style>
<body>
    <div class="container">
        <h1>Subject Quizz</h1>
        <div class="box">
        <div class="question">
            <p>1. What is the capital of France?</p>
        </div>
        <div class="options">
            <label class="option">
                <input type="radio" name="q1" value="paris"> Paris
            </label>
            <label class="option">
                <input type="radio" name="q1" value="london"> London
            </label>
            <label class="option">
                <input type="radio" name="q1" value="berlin"> Berlin
            </label>
        </div>
    </div>
    <div class="box">
        <div class="question">
            <p>1.
            <% 
         	   try{
           		   String connectionURL = "jdbc:mysql://localhost:3306/quizz";
            	   Class.forName("com.mysql.jdbc.Driver"); 

                  Connection var1 = DriverManager.getConnection(connectionURL, "root", "Sahil@1234");
                  System.out.println("Connection is created successfully:");
                  Statement var2 = var1.createStatement();
                  String var3 = "SELECT * from user;";
                  ResultSet rs=var2.executeQuery(var3);
                  while(rs.next())
                  {
                	  out.println(""+rs.getString(2));
                  }
               }
               catch(Exception ex){
            	   out.println(""+ex);
               }
            %>
            </p>
        </div>
        <div class="options">
            <label class="option">
                <input type="radio" name="q2" value="earth"> Earth
            </label>
            <label class="option">
                <input type="radio" name="q2" value="jupiter"> Jupiter
            </label>
            <label class="option">
                <input type="radio" name="q2" value="mars"> Mars
            </label>
        </div>
    </div>
    <div class="box">
        <div class="question">
            <p>3. What is the capital of France?</p>
        </div>
        <div class="options">
            <label class="option">
                <input type="radio" name="q1" value="paris"> Paris
            </label>
            <label class="option">
                <input type="radio" name="q1" value="london"> London
            </label>
            <label class="option">
                <input type="radio" name="q1" value="berlin"> Berlin
            </label>
        </div>
    </div>
    <div class="box">
        <div class="question">
            <p>4. What is the capital of France?</p>
        </div>
        <div class="options">
            <label class="option">
                <input type="radio" name="q1" value="paris"> Paris
            </label>
            <label class="option">
                <input type="radio" name="q1" value="london"> London
            </label>
            <label class="option">
                <input type="radio" name="q1" value="berlin"> Berlin
            </label>
        </div>
    </div>
    <div class="box">
        <div class="question">
            <p>5. What is the capital of France?</p>
        </div>
        <div class="options">
            <label class="option">
                <input type="radio" name="q1" value="paris"> Paris
            </label>
            <label class="option">
                <input type="radio" name="q1" value="london"> London
            </label>
            <label class="option">
                <input type="radio" name="q1" value="berlin"> Berlin
            </label>
        </div>
    </div>
    <div class="box">
        <div class="question">
            <p>6. What is the capital of France?</p>
        </div>
        <div class="options">
            <label class="option">
                <input type="radio" name="q1" value="paris"> Paris
            </label>
            <label class="option">
                <input type="radio" name="q1" value="london"> London
            </label>
            <label class="option">
                <input type="radio" name="q1" value="berlin"> Berlin
            </label>
        </div>
    </div>
    <div class="box">
        <div class="question">
            <p>7. What is the capital of France?</p>
        </div>
        <div class="options">
            <label class="option">
                <input type="radio" name="q1" value="paris"> Paris
            </label>
            <label class="option">
                <input type="radio" name="q1" value="london"> London
            </label>
            <label class="option">
                <input type="radio" name="q1" value="berlin"> Berlin
            </label>
        </div>
    </div>
    <div class="box">
        <div class="question">
            <p>8. What is the capital of France?</p>
        </div>
        <div class="options">
            <label class="option">
                <input type="radio" name="q1" value="paris"> Paris
            </label>
            <label class="option">
                <input type="radio" name="q1" value="london"> London
            </label>
            <label class="option">
                <input type="radio" name="q1" value="berlin"> Berlin
            </label>
        </div>
    </div>
    <div class="box">
        <div class="question">
            <p>9. What is the capital of France?</p>
        </div>
        <div class="options">
            <label class="option">
                <input type="radio" name="q1" value="paris"> Paris
            </label>
            <label class="option">
                <input type="radio" name="q1" value="london"> London
            </label>
            <label class="option">
                <input type="radio" name="q1" value="berlin"> Berlin
            </label>
        </div>
    </div>
    <div class="box">
        <div class="question">
            <p>10. What is the capital of France?</p>
        </div>
        <div class="options">
            <label class="option">
                <input type="radio" name="q1" value="paris"> Paris
            </label>
            <label class="option">
                <input type="radio" name="q1" value="london"> London
            </label>
            <label class="option">
                <input type="radio" name="q1" value="berlin"> Berlin
            </label>
        </div>
    </div>

        <button id="submitBtn">Submit Answers</button>
    </div>

    <script>
        document.getElementById('submitBtn').addEventListener('click', function () {
        });
    </script>
</body>
</html>
