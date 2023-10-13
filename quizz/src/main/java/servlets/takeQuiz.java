package servlets;

import dao.DatabaseConnection;
import bean.Question;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
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

public class takeQuiz extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @Override
       protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	   //HttpSession session = req.getSession();
    	  int quizId=119;
    	   ArrayList<Question> questions = DatabaseConnection.getQuestions(quizId);
    	   
    	   PrintWriter out = resp.getWriter();
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
    	   		+ "    <div class='container'>\r\n"
    	   		+ "        <h1>Subject Quizz</h1>\r\n"
    	   		+ "        <div class='box'>\r\n"
    	   		+ "        <div class='question'>\r\n"
    	   		+ "            <p>1."+ questions.get(0).getContent() +" </p>\r\n"
    	   		+ "        </div>\r\n"
    	   		+ "        <div class='options'>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='1'>"+ questions.get(0).getAnswers().get(0) +"\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='2'> "+ questions.get(0).getAnswers().get(01) +"\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='3'> "+ questions.get(0).getAnswers().get(2) +"\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "				<label class='option'>\r\n"
    	   		+ "    	   			<input type='radio' name='q1' value='3'>"+ questions.get(0).getAnswers().get(3) +"\r\n"
    	   		+ "    	   		</label>\r\n"
    	   		+ "        </div>\r\n"
    	   		+ "    </div>\r\n"
    	   		+ "    <div class='box'>\r\n"
    	   		+ "        <div class='question'>\r\n"
    	   		+ "            <p>1.\r\n"
    	   		+ "            \r\n"
    	   		+ "            </p>\r\n"
    	   		+ "        </div>\r\n"
    	   		+ "        <div class='options'>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q2' value='earth'> Earth\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q2' value='jupiter'> Jupiter\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q2' value='mars'> Mars\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "        </div>\r\n"
    	   		+ "    </div>\r\n"
    	   		+ "    <div class='box'>\r\n"
    	   		+ "        <div class='question'>\r\n"
    	   		+ "            <p>3. What is the capital of France?</p>\r\n"
    	   		+ "        </div>\r\n"
    	   		+ "        <div class='options'>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='paris'> Paris\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='london'> London\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='berlin'> Berlin\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "        </div>\r\n"
    	   		+ "    </div>\r\n"
    	   		+ "    <div class='box'>\r\n"
    	   		+ "        <div class='question'>\r\n"
    	   		+ "            <p>4. What is the capital of France?</p>\r\n"
    	   		+ "        </div>\r\n"
    	   		+ "        <div class='options'>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='paris'> Paris\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='london'> London\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='berlin'> Berlin\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "        </div>\r\n"
    	   		+ "    </div>\r\n"
    	   		+ "    <div class='box'>\r\n"
    	   		+ "        <div class='question'>\r\n"
    	   		+ "            <p>5. What is the capital of France?</p>\r\n"
    	   		+ "        </div>\r\n"
    	   		+ "        <div class='options'>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='paris'> Paris\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='london'> London\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='berlin'> Berlin\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "        </div>\r\n"
    	   		+ "    </div>\r\n"
    	   		+ "    <div class='box'>\r\n"
    	   		+ "        <div class='question'>\r\n"
    	   		+ "            <p>6. What is the capital of France?</p>\r\n"
    	   		+ "        </div>\r\n"
    	   		+ "        <div class='options'>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='paris'> Paris\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='london'> London\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='berlin'> Berlin\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "        </div>\r\n"
    	   		+ "    </div>\r\n"
    	   		+ "    <div class='box'>\r\n"
    	   		+ "        <div class='question'>\r\n"
    	   		+ "            <p>7. What is the capital of France?</p>\r\n"
    	   		+ "        </div>\r\n"
    	   		+ "        <div class='options'>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='paris'> Paris\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='london'> London\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='berlin'> Berlin\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "        </div>\r\n"
    	   		+ "    </div>\r\n"
    	   		+ "    <div class='box'>\r\n"
    	   		+ "        <div class='question'>\r\n"
    	   		+ "            <p>8. What is the capital of France?</p>\r\n"
    	   		+ "        </div>\r\n"
    	   		+ "        <div class='options'>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='paris'> Paris\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='london'> London\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='berlin'> Berlin\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "        </div>\r\n"
    	   		+ "    </div>\r\n"
    	   		+ "    <div class='box'>\r\n"
    	   		+ "        <div class='question'>\r\n"
    	   		+ "            <p>9. What is the capital of France?</p>\r\n"
    	   		+ "        </div>\r\n"
    	   		+ "        <div class='options'>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='paris'> Paris\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='london'> London\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='berlin'> Berlin\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "        </div>\r\n"
    	   		+ "    </div>\r\n"
    	   		+ "    <div class='box'>\r\n"
    	   		+ "        <div class='question'>\r\n"
    	   		+ "            <p>10. What is the capital of France?</p>\r\n"
    	   		+ "        </div>\r\n"
    	   		+ "        <div class='options'>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='paris'> Paris\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='london'> London\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "            <label class='option'>\r\n"
    	   		+ "                <input type='radio' name='q1' value='berlin'> Berlin\r\n"
    	   		+ "            </label>\r\n"
    	   		+ "        </div>\r\n"
    	   		+ "    </div>\r\n"
    	   		+ "\r\n"
    	   		+ "        <button id='submitBtn'>Submit Answers</button>\r\n"
    	   		+ "    </div>\r\n"
    	   		+ "\r\n"
    	   		+ "    <script>\r\n"
    	   		+ "        document.getElementById('submitBtn').addEventListener('click', function () {\r\n"
    	   		+ "        });\r\n"
    	   		+ "    </script>\r\n"
    	   		+ "</body>\r\n"
    	   		+ "</html>\r\n"
    	   		 );
    	   
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
    	int quizId=111;
        session.setAttribute("quizId", quizId);
        ArrayList<Question> questions = DatabaseConnection.getQuestions(quizId);
        req.setAttribute("quizId", quizId);
        req.setAttribute("size",  questions.size());
        for(int i = 0; i < questions.size(); i++ )
            req.setAttribute("question" + (i+1), questions.get(i));
        req.getRequestDispatcher("/takeQuiz.jsp").forward(req, resp);
        */
    	String abc="HOIIII";
 	   req.setAttribute("abc", abc);
 	   req.getRequestDispatcher("/takeQuiz.jsp").forward(req, resp);
	}

}
