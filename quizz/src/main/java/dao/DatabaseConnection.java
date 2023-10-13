package dao;

import bean.userBean;

import java.sql.*;
import java.util.*;

public class DatabaseConnection{
	public static Connection connection;
	
	public static Connection getConnection() {
		connection=null;
		try {
			String connectionURL = "jdbc:mysql://localhost:3306/quizz";
			Class.forName("com.mysql.jdbc.Driver"); 
			connection = DriverManager.getConnection(connectionURL, "root", "Sahil@1234");
        } catch(Exception e){
            e.printStackTrace();
        }
        return connection;
    }
    public static void close(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static userBean selectUser(userBean userBean)throws ClassNotFoundException {
    	try(PreparedStatement statement = getConnection().prepareStatement("select * from user where User_name = ? and Password = ? ")){
            statement.setString(2, userBean.getUser_name());
            statement.setString(4, userBean.getPassword());
            statement.setString(5, userBean.getRole());
            
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                userBean.setUser_ID(resultSet.getInt("User_ID"));
                userBean.setUser_name(resultSet.getString("User_name"));
                userBean.setEmail(resultSet.getString("Email"));
                userBean.setPassword(resultSet.getString("password"));
                userBean.setRole(resultSet.getString("Role"));
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return userBean;
    }
    public static String getPassword(String username){

        try(PreparedStatement statement = getConnection().prepareStatement("SELECT Password FROM user where User_name = ?")){
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            String password = null;
            if(resultSet.next())
                 password =  resultSet.getString("Password");
            resultSet.close();
            close();
            return password;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public static ArrayList<String> getAllUsernames(){
        try(PreparedStatement statement = getConnection().prepareStatement("Select User_name from user")){
            ResultSet resultSet = statement.executeQuery();
            ArrayList<String> usernames = new ArrayList<>();
            while(resultSet.next()){
                String username = resultSet.getString("User_name");
                usernames.add(username);
            }
            resultSet.close();
            close();
            return usernames;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public static String getFacultyRole(String username, String Role){

        try(PreparedStatement statement = getConnection().prepareStatement("SELECT role FROM user where User_name = ?")){
            statement.setString(1, username);
            

            ResultSet resultSet = statement.executeQuery();
            String role = null;
            if(resultSet.next())
                 role =  resultSet.getString("Role");
            resultSet.close();
            close();
            return role;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
