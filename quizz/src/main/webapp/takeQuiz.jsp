<%--
  Created by IntelliJ IDEA.
  User: mindit
  Date: 5/25/2019
  Time: 3:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Take Quiz</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/takeQuiz.css">
</head>
<body>
<form action = "faculty_home" method="post">
<div class="hero-image">
    <div class="hero-text">
        <h1 style="font-size:70px">
            <div id="result" class="result">
    <pre>
        ${requestScope.quizName}
    </pre>
            </div>
        </h1>
    </div>
</div>


    <div class="button">
        <label for="answerQ9">Your answer (a/b/c/d): </label>
        <input  type="text" placeholder="Enter your answer: " name="answerQ9" id = "answerQ9" required>
        <br><br>
    </div>

    <div id="result10" class="result">
    <pre>
        ${requestScope.question10}
    </pre>
    </div>

    <div class="button">
        <label for="answerQ10">Your answer (a/b/c/d): </label>
        <input  type="text" placeholder="Enter your answer: " name="answerQ10" id = "answerQ10" required>
        <br><br>
    </div>

        <div>
            <button class = "btn" type="submit" name="action">Submit quiz</button>
        </div>
</form>



</body>
</html>