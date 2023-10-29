<%@ page language='java' contentType='text/html; charset=ISO-8859-1'
    pageEncoding='ISO-8859-1'%>
<!DOCTYPE html>
<%@  page import='java.sql.*' %> 
<%@ page import='java.io.*' %>
<%@ page import='java.util.*' %>
<html lang='en'>
<head>
    <meta charset='UTF-8'>
    <meta name='viewport' content='width=device-width, initial-scale=1.0'>
    <title>MCQ Test</title>
    <link rel='stylesheet' href='css/test.css'>
    
</head>

<body>
<form action="takeQuiz" method="post">
    <div class='container'>
        <h1>Subject Quizz</h1>
       	<jsp:include page="takeQuiz"><jsp:param name="question" value="0"/></jsp:include>
    
    
    
        <button id='submitBtn'>Submit Answers</button>
    </div>

    <script>
        document.getElementById('submitBtn').addEventListener('click', function () {
        });
    </script>
</form>
</body>
</html>
