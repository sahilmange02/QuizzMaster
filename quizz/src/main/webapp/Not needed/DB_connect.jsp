<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page	import="java.sql.*" %>
<%@page import="java.util.*" %>
<%@page import="java.io.*" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%

			try {	 
				String connectionURL = "jdbc:mysql://localhost:3306/quizz";
				
				Connection connection = null; 

				Class.forName("com.mysql.jdbc.Driver"); 

				connection = DriverManager.getConnection(connectionURL, "root", "Sahil@1234");

				if(!connection.isClosed())
				
				System.out.println("Successfully connected to " + "MySQL server using TCP/IP...");
				connection.close();
				}
				catch(Exception ex){
				
					System.out.println("Unable to connect to database.");
					System.out.println(""+ex);
				}
	
	%>
</body>
</html>