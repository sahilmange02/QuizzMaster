package servlets;

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
import dao.DatabaseConnection;

/**
 * Servlet implementation class faculty_result
 */
public class faculty_result extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public faculty_result() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
    	int quizId=(Integer)session.getAttribute("quizId");
    	
    	ArrayList<Result> results = DatabaseConnection.getresultbyquizId(quizId);
    	
    	PrintWriter out = resp.getWriter();
    	
    	for(int i=0; i<results.size();i++) {
    		out.println("<li class=\"table-row\">\r\n"
    				+ "            <div class=\"col col-1\" data-label=\"Student ID\">"+results.get(i).getuserId() +"</div>\r\n"
    				+ "            <div class=\"col col-2\" data-label=\"Student Name\">"+results.get(i).getname()+"</div>\r\n"
    				+ "            <div class=\"col col-3\" data-label=\"Marks\">"+results.get(i).getmarks()+"</div>\r\n"
    				+ "          </li>");
    	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
