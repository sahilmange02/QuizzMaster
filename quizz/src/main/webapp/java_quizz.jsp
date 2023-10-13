<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
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
<%@ page import="java.util.*, java.sql.*, java.io.*"  %>
<% 	
	 ArrayList<Integer> arr= new ArrayList<Integer>(10);
	 for(int i =1; i<11; i++){
		 arr.add(i);
	 }
	 Collections.shuffle(arr);
	 
	 try{
		 Class.forName("com.mysql.jdbc.Driver");
		 
	 }catch(Exception e){out.print(e);}
%>

<body>
    <div class="container">
    
        <h1>Subject Quizz</h1>
        <div class="box">
        <div class="question">
            <p>1. 
            <%	try{
            	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quizz","root","root"); 
       		    Statement st=con.createStatement();
            	ResultSet rs = st.executeQuery("select Type from question where Qn_ID=" + arr.get(0));
            	
            	while(rs.next()){
            		out.print(rs.getString(1));
            	
            		}
            	
            	
            }catch(Exception e){out.println(e);}
            %></p>
        </div>
        <div class="options">
            <label class="option">
                <input type="radio" name="q1" value="1"> 
                <%	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quizz","root","root"); 
                	Statement st=con.createStatement();
       		    	ResultSet rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(0)+" AND A_ID=1;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q1" value="2">
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(0)+" AND A_ID=2;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q1" value="3">
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(0)+" AND A_ID=3;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q1" value="4">
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(0)+" AND A_ID=4;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                	
                %>
            </label>
        </div>
    </div>
    <div class="box">
        <div class="question">
            <p>2. 
            <%	try{
            	rs = st.executeQuery("select Type from question where Qn_ID=" + arr.get(1));
            	
            	while(rs.next()){
            		out.print(rs.getString(1));
            		}
            	
            }catch(Exception e){out.println(e);}
            %>
            </p>
        </div>
        <div class="options">
            <label class="option">
                <input type="radio" name="q2" value="1"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(1)+" AND A_ID=1;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q2" value="2"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(1)+" AND A_ID=2;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q2" value="3"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(1)+" AND A_ID=3;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q2" value="4"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(1)+" AND A_ID=4;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
        </div>
    </div>
    <div class="box">
        <div class="question">
            <p>3. 
            <%	try{
            	rs = st.executeQuery("select Type from question where Qn_ID=" + arr.get(3));
            	
            	while(rs.next()){
            		out.print(rs.getString(1));
            		}
            	
            }catch(Exception e){out.println(e);}
            %>
            </p>
        </div>
        <div class="options">
            <label class="option">
                <input type="radio" name="q3" value="1"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(3)+" AND A_ID=1;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q3" value="2"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(3)+" AND A_ID=2;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q3" value="3"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(3)+" AND A_ID=3;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q3" value="4"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(3)+" AND A_ID=4;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
        </div>
    </div>
    <div class="box">
        <div class="question">
            <p>4. 
            <%	try{
            	rs = st.executeQuery("select Type from question where Qn_ID=" + arr.get(3));
            	
            	while(rs.next()){
            		out.print(rs.getString(1));
            		}
            	
            }catch(Exception e){out.println(e);}
            %>
            </p>
        </div>
        <div class="options">
            <label class="option">
                <input type="radio" name="q4" value="1"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(3)+" AND A_ID=1;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q4" value="2"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(3)+" AND A_ID=2;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q4" value="3"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(3)+" AND A_ID=3;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q4" value="4"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(3)+" AND A_ID=4;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
        </div>
    </div>
    <div class="box">
        <div class="question">
            <p>5. 
            <%	try{
            	rs = st.executeQuery("select Type from question where Qn_ID=" + arr.get(4));
            	
            	while(rs.next()){
            		out.print(rs.getString(1));
            		}
            	
            }catch(Exception e){out.println(e);}
            %>
            </p>
        </div>
        <div class="options">
            <label class="option">
                <input type="radio" name="q5" value="1"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(4)+" AND A_ID=1;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q5" value="2"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(4)+" AND A_ID=2;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q5" value="3"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(4)+" AND A_ID=3;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q5" value="4"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(4)+" AND A_ID=4;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
        </div>
    </div>
    <div class="box">
        <div class="question">
            <p>6. 
            <%	try{
            	rs = st.executeQuery("select Type from question where Qn_ID=" + arr.get(5));
            	
            	while(rs.next()){
            		out.print(rs.getString(1));
            		}
            	
            }catch(Exception e){out.println(e);}
            %>
            </p>
        </div>
        <div class="options">
            <label class="option">
                <input type="radio" name="q6" value="1"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(5)+" AND A_ID=1;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q6" value="2"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(5)+" AND A_ID=2;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q6" value="3"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(5)+" AND A_ID=3;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q6" value="4"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(5)+" AND A_ID=4;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
        </div>
    </div>
    <div class="box">
        <div class="question">
            <p>7. 
            <%	try{
            	rs = st.executeQuery("select Type from question where Qn_ID=" + arr.get(6));
            	
            	while(rs.next()){
            		out.print(rs.getString(1));
            		}
            	
            }catch(Exception e){out.println(e);}
            %>
            </p>
        </div>
        <div class="options">
            <label class="option">
                <input type="radio" name="q7" value="1"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(6)+" AND A_ID=1;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q7" value="2"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(6)+" AND A_ID=2;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q7" value="3"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(6)+" AND A_ID=3;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q7" value="4"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(6)+" AND A_ID=4;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
        </div>
    </div>
    <div class="box">
        <div class="question">
            <p>8. 
            <%	try{
            	rs = st.executeQuery("select Type from question where Qn_ID=" + arr.get(7));
            	
            	while(rs.next()){
            		out.print(rs.getString(1));
            		}
            	
            }catch(Exception e){out.println(e);}
            %>
            </p>
        </div>
        <div class="options">
            <label class="option">
                <input type="radio" name="q8" value="1"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(7)+" AND A_ID=1;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q8" value="2"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(7)+" AND A_ID=2;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q8" value="3"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(7)+" AND A_ID=3;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q8" value="4"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(7)+" AND A_ID=4;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
        </div>
    </div>
    <div class="box">
        <div class="question">
            <p>9. 
            <%	try{
            	rs = st.executeQuery("select Type from question where Qn_ID=" + arr.get(8));
            	
            	while(rs.next()){
            		out.print(rs.getString(1));
            		}
            	
            }catch(Exception e){out.println(e);}
            %>
            </p>
        </div>
        <div class="options">
            <label class="option">
                <input type="radio" name="q9" value="1"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(8)+" AND A_ID=1;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q9" value="2"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(8)+" AND A_ID=2;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q9" value="3"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(8)+" AND A_ID=3;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q9" value="4"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(8)+" AND A_ID=4;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
        </div>
    </div>
    <div class="box">
        <div class="question">
            <p>10. 
            <%	try{
            	rs = st.executeQuery("select Type from question where Qn_ID=" + arr.get(9));
            	
            	
            	while(rs.next()){
            		out.print(rs.getString(1));
            		}
            	
            }catch(Exception e){out.println(e);}
            %>
            </p>
        </div>
        <div class="options">
            <label class="option">
                <input type="radio" name="q10" value="1" id="q10"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(9)+" AND A_ID=1;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q10" value="2" id="q10"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(9)+" AND A_ID=2;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q10" value="3" id="q10"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(9)+" AND A_ID=3;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
            <label class="option">
                <input type="radio" name="q10" value="4" id="q10"> 
                <%	rs = st.executeQuery("select Qn_options from qn_option where Q_ID=" + arr.get(9)+" AND A_ID=4;");
                	while(rs.next()){
            			out.print(rs.getString(1));
            		}
                %>
            </label>
        </div>
    </div>

        <button type = "button" id="submitBtn" onclick="myevent()">Submit Answers</button>
    </div>
	<script>
		function myevent(){
			   var ele = document.getElementsByName('q1');
			   
			 	
			 
			   for (i = 0; i < ele.length; i++) {
	                if (ele[i].checked){
	                    console.log(ele[i]);
	                    <% 
	                    	String ab = request.getParameter("q10");
	                    if("1".equals(ab)){
	                    	out.print("one");
	                    }
	                    	%>
	                    
	                    
	                    console.log(<%=ab%>);
	                }
			   }
		}	
	</script>
    
    </body>
</html>
    