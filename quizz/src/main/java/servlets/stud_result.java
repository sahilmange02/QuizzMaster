package servlets;

import dao.DatabaseConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import bean.Result;

/**
 * Servlet implementation class stud_result
 */
public class stud_result extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	HttpSession session = req.getSession();
    	Boolean from_test=(Boolean) session.getAttribute("from_test");
    	int quizId=0;
    	int userId=1;//int userId=(Integer)session.getAttribute("userId");
    	ArrayList<Result> results;
    	
    	
    		
    		
    	
    	
    	if(from_test) {
    		quizId=(int) session.getAttribute("quizId");
    		results = DatabaseConnection.getresultbyquizId(quizId);
    	}else {
    		int sub=101;//int sub=(Integer)session.getAttribute("subject");
    		results = DatabaseConnection.getresultbyuserId(userId, sub);
    	}
    	
    	
    	
    	
    	PrintWriter out = resp.getWriter();
    	
    	for(int i=0;i<results.size();i++) {
    	out.println("<li class=\"table-row\">\r\n"
    			+ "            <div class=\"col col-1\" data-label=\"Quizz ID\">"+ results.get(i).getquizId()+"</div>\r\n"
    			+ "            <div class=\"col col-3\" data-label=\"Marks\">"+results.get(i).getmarks()+"</div>\r\n"
    			+ "          </li>");
    	
    	
		//response.getWriter().append("Served at: ").append(request.getContextPath());
    	}
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
