package servlets;

import service.loginService;
import java.util.*;

import dao.DatabaseConnection;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@SuppressWarnings("serial")
public class StudentLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		String username = req.getParameter("username");
        String password = req.getParameter("password");
        //String role = "Faculty";
        String loginStatus = loginService.studentlogin(username, password);
        
        
        
        if(loginStatus.equals("Login successful")) {
            int userId=DatabaseConnection.getuserID(username);
        	session.setAttribute("userId", userId);
        	resp.sendRedirect("stud_home.jsp");
        }
        else{
            req.setAttribute("loginStatus", loginStatus);
            req.getRequestDispatcher("login.jsp").forward(req, resp);
            
        	}
		}
}

