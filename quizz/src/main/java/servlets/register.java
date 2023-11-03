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

/**
 * Servlet implementation class register
 */
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
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
		PrintWriter out = resp.getWriter();
		String username = req.getParameter("username");
        String password = req.getParameter("password");
        String confirm_password = req.getParameter("confirm_password");
        String role= req.getParameter("role");
        
        if(password.equals(confirm_password)) {
        	String loginStatus="Registration Successful";
        	
        	DatabaseConnection.register_user(username, password, role);
        	req.setAttribute("loginStatus", loginStatus);
        	req.getRequestDispatcher("login.jsp").forward(req, resp);
        	
        }
        else {
        	req.setAttribute("Status", "Passwords do not match");
        	req.getRequestDispatcher("register.jsp").forward(req, resp);
        }
	}

}
