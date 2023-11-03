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

import dao.DatabaseConnection;

/**
 * Servlet implementation class attempt_choose
 */
public class attempt_choose extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public attempt_choose() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session =req.getSession();
		PrintWriter out = resp.getWriter();
		int subject=0;
		try {
		subject =(Integer)session.getAttribute("subject");
		}catch(Exception e) {
			subject=0;
		}
		String subname=null;
		if(subject==101)
			subname="JAVA";
		else if(subject==202)
			subname="DSA";
		else if(subject==303)
			subname="DBMS";
		
		ArrayList<Integer> quizzes=DatabaseConnection.getQuizfromSub(subject);
		
		out.print("<div class=\"container\" style=\"background: transparent; color : white;\">\r\n"
				+ "        <h2>"+ subname+"</h2>\r\n"
				+ "        <ul class=\"responsive-table\">\r\n"
				+ "          <li class=\"table-header\">\r\n"
				+ "            <div class=\"col col-1\">Quizz ID</div>\r\n"
				+ "            <div class=\"col col-3\">Attempt Quizz</div>\r\n"
				+ "          </li>");
		
		
		for(int i=0; i<quizzes.size();i++) {
			out.print("<li class=\"table-row\">\r\n"
					+ "          \r\n"
					+ "            <div class=\"col col-1\" data-label=\"Quizz ID\">"+quizzes.get(i) + "</div>\r\n"
					+ "            <div class=\"col col-3\" data-label=\"Marks\"><button class = \"attempt-btn\" name=\"attempt\" value='"+quizzes.get(i)+"'>Attempt Quizz</button></div>\r\n"
					+ "            \r\n"
					+ "          </li>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session =req.getSession();
		//PrintWriter out = resp.getWriter();
		int quizId=Integer.parseInt(req.getParameter("attempt"));
		System.out.println(quizId);
		session.setAttribute("quizId",quizId);
		resp.sendRedirect("test.jsp");
		
	}

}
