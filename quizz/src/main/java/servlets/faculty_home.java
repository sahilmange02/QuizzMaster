package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import dao.DatabaseConnection;

/**
 * Servlet implementation class generateQuiz
 */
public class faculty_home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public faculty_home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		int sub=Integer.parseInt(req.getParameter("generateQuiz"));
		int no_of_Q=0;
		try{
			no_of_Q=Integer.parseInt(req.getParameter("no_of_Q"));
		}catch(Exception e) {
			no_of_Q=10;
		}
		
		int a=0;
		if(sub==101) {
			a=100;
		}
		else if(sub==202) {
			a=200;
		}else if(sub==303) {
			a=300;
		}
		
		ArrayList<Integer> arr= new ArrayList<Integer>(10);
		 for(int i=1; i<=no_of_Q; i++){
			 arr.add((a+i));
			 //System.out.println(arr.get(i-1)); 
		 }
		 Collections.shuffle(arr);
		 
		 int quizId=DatabaseConnection.generateQuiz(arr,sub);
		 session.setAttribute("quizId", quizId);
		 resp.sendRedirect("generatedQuiz.jsp");
	}

}
