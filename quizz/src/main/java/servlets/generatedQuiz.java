package servlets;

import dao.DatabaseConnection;
import bean.Question;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Servlet implementation class takeQuiz
 */

public class generatedQuiz extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @Override
       protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	   HttpSession session = req.getSession();
    	   String user = (String)session.getAttribute("user");
    	   int quizId=119;//session.getAttribute("quizId", quizId);
    	   ArrayList<Question> questions = DatabaseConnection.getQuestions(quizId);
    	   
    	   
    	   session.setAttribute("questions", questions);
    	   String[] p = req.getParameterValues("question");
    	   
    	   PrintWriter out = resp.getWriter();
    	   for(int i=0;i<questions.size();i++) {
    	   out.println("<html lang='en'>\r\n"
    	   		+ "<head>\r\n"
    	   		+ "    <meta charset='UTF-8'>\r\n"
    	   		+ "    <meta name='viewport' content='width=device-width, initial-scale=1.0'>\r\n"
    	   		+ "    <title>MCQ Test</title>\r\n"
    	   		+ "    <link rel='stylesheet' href='css/test.css'>\r\n"
    	   		+ "    \r\n"
    	   		+ "</head>\r\n"
    	   		+ "\r\n"
    	   		+ "<body>\r\n"
    	   		+ "<div class='box'>\r\n"
    	   		+ "        <div class='question'>\r\n"
    	   		+ "            <p> " + (i+1) + ". " + questions.get(i).getContent()
    	   		+ "				</p>\r\n" 
    	   		+ "        </div>\r\n"
    	   		+ "        <div class='options'>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q"+i+"' value='1'>" + questions.get(i).getAnswers().get(00)+ "\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q"+i+"' value='2'> " + questions.get(i).getAnswers().get(01)+ "\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q"+i+"' value='3'> " + questions.get(i).getAnswers().get(02)+ "\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "				<label class='option'>\r\n"
    	    	+ "                <input type='radio' name='q"+i+"' value='4'> " + questions.get(i).getAnswers().get(03)+ "\r\n"
    	   		+ "            </label>\r\n"
    	    	+ "<p>Correct Answer "+questions.get(i).getrightAnswer()
    	   		+ "        </div>\r\n"
    	   		+ "    </div>"
    	   		+ "</body>\r\n"
    	   		+ "</html>\r\n"
    	   		 );
    	   }
    	 /*int quizId=111;
           session.setAttribute("quizId", quizId);
           ArrayList<Question> questions = DatabaseConnection.getQuestions(quizId);
           req.setAttribute("quizId", quizId);
           req.setAttribute("size",  questions.size());
           for(int i = 0; i < questions.size(); i++ )
               req.setAttribute("question" + (i+1), questions.get(i));
           req.getRequestDispatcher("/takeQuiz.jsp").forward(req, resp);
           */
    	   //String abc="HOIIII";
    	  // req.setAttribute("abc", abc);
    	  // req.getRequestDispatcher("/takeQuiz.jsp").forward(req, resp);
    	   
   	}
       
    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	/*HttpSession session = req.getSession();
    	
    	
        
    	int userId=222;//int userId=(Integer)session.getAttribute("userId");
    	int quizId=119;//int quizId=(Integer)session.getAttribute("quizId");
    	int marks=0;
    	
        PrintWriter out = resp.getWriter();
        
        ArrayList<Question> questions =(ArrayList<Question>) session.getAttribute("questions");
        int []option_chosen=new int[questions.size()];
        out.print("Marks:" + marks);
        for(int i=0;i<questions.size();i++) {
        	if(req.getParameter("q"+i)!=null) {
        		option_chosen[i]=Integer.parseInt(req.getParameter("q"+i));
        		if (option_chosen[i]==questions.get(i).getrightAnswer()) {
        			marks++;
        		}
        		out.print("Right Answer: "+questions.get(i).getrightAnswer());
        	
        		out.println("\tOption Chosemn:"+option_chosen[i]);
        	}
        }
        String abc=req.getParameter("submitBtn");
        DatabaseConnection.setmarks(userId,quizId , marks); 
        out.println(abc);
        out.println(marks);
        out.println("ODNE");
        //save ans array in database with userId and quizId
    	
        //questions.size()
 	    //req.getRequestDispatcher("/takeQuiz.jsp").forward(req, resp);
	*/}

}
