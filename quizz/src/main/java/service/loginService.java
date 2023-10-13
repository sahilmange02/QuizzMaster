package service;

import java.util.ArrayList;

import dao.DatabaseConnection;

public class loginService{

    public static String studentlogin(String userLogin, String passwordLogin) {

        ArrayList<String> usernames = DatabaseConnection.getAllUsernames();
        if(!usernames.contains(userLogin)) {
            return "Username is not correct.\nPlease insert your username again.";
        }

        String password = DatabaseConnection.getPassword(userLogin);
        if (!passwordLogin.equals(password))
            return "Password is not correct.\nPlease insert your password again.";

        return "Login successful";
    }
	public static String FacultyLogin(String userLogin, String passwordLogin, String userrole ) {
		
		 ArrayList<String> usernames = DatabaseConnection.getAllUsernames();
		if(!usernames.contains(userLogin)) {
            return "Username is not correct.\nPlease insert your username again.";
        }
		String password = DatabaseConnection.getPassword(userLogin);
        if (!passwordLogin.equals(password))
            return "Password is not correct.\nPlease insert your password again.";

        String role = DatabaseConnection.getFacultyRole(userLogin, userrole);
        if (!userrole.contains(role)) {
        	return "Aunthentication Error.\n."; 
        }
        else {
		return "Hello Faculty Member";
        }
	}
}