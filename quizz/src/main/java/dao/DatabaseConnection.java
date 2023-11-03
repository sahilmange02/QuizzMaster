package dao;

import bean.*;
import bean.Question;

import java.sql.*;
import java.util.*;

public class DatabaseConnection{
	public static Connection connection;
	
	public static Connection getConnection() {
		connection=null;
		try {
			String connectionURL = "jdbc:mysql://localhost:3306/quizz";
			Class.forName("com.mysql.jdbc.Driver"); 
			connection = DriverManager.getConnection(connectionURL, "root", "root");
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


    /*public static userBean selectUser(userBean userBean)throws ClassNotFoundException {
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
    */
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
    public static ArrayList<Question> getQuestions(int quizId){
        ArrayList<Question> question = new ArrayList<Question>();
        try(PreparedStatement statement = getConnection().prepareStatement("SELECT * FROM question natural join qq WHERE quiz_id =?")){
        	statement.setInt(1, quizId);
        	ResultSet resultSet = statement.executeQuery();
        	while(resultSet.next()) {
        		Question questions = new Question();
        		questions.setQuestionID((resultSet.getInt("Qn_ID")));
        		questions.setContent(resultSet.getString("Type"));
        		ArrayList<String> answers = new ArrayList<>();
        		answers = getAnswersByQnID(questions.getQuestionID());
        		questions.setAnswers(answers);
        		questions.setrightAnswer(resultSet.getInt("cr_answer"));
        		question.add(questions);
        	}
        	resultSet.close();
        	close();
        	
        
        }catch(SQLException e){
            e.printStackTrace();
        }
        return question;
    }
    
    public static ArrayList<String> getAnswersByQnID(int Qn_ID){
    	ArrayList<String> answers = new ArrayList<String>();
    	try(PreparedStatement statement = getConnection().prepareStatement("select qn_options from qn_option where Q_ID = ?")){
    		statement.setInt(1, Qn_ID);
    		ResultSet resultSet = statement.executeQuery();
    		while(resultSet.next()) {
    			answers.add(resultSet.getString("qn_options"));
    		}
    	}catch(SQLException e){
    	            e.printStackTrace();
    	        }
    	return answers;
    
    }
    
    public static int generateQuiz(ArrayList<Integer> arr, int sub) {
    	int quiz_id =00;
    	try{	Statement st=getConnection().createStatement();
				st.executeUpdate("insert into quiz (sub) values("+sub+");");
				ResultSet rs=st.executeQuery("select MAX(Quiz_ID) from quiz;");
				
				
				while(rs.next()) {
					quiz_id = rs.getInt(1);
				}
				for(int i=0;i<arr.size();i++) {
					try(PreparedStatement statement = getConnection().prepareStatement("insert into qq values(?,?) ")){
						statement.setInt(1, quiz_id);
						statement.setInt(2, arr.get(i));
						statement.executeUpdate();    		
						   		
					}catch(SQLException e){
						e.printStackTrace();
					}
				}
				return quiz_id;
    	}catch(SQLException e){
            e.printStackTrace();
        }
		return 0;
    }
    
    public static void setmarks(int userID, int quizID, int marks) {
    	try(PreparedStatement statement = getConnection().prepareStatement("insert into results values(?,?,?)")){
    		statement.setInt(1, userID);
    		statement.setInt(2, quizID);
    		statement.setInt(3,  marks);
    		statement.executeUpdate();
    	}catch(SQLException e){
			e.printStackTrace();
		}
    }
    
    public static ArrayList<Result> getresultbyuserId(int userId, int subject) {
    	ArrayList<Result> results= new ArrayList<Result>();
    	try(PreparedStatement statement=getConnection().prepareStatement("select userId,quizId,marks from results r\r\n"
    			+ "inner join quiz q on r.quizId=q.Quiz_ID\r\n"
    			+ "where userId=? and sub=?; ")){
			statement.setInt(1,  userId);
			statement.setInt(2, subject);
			ResultSet rs=statement.executeQuery();
			
			while(rs.next()) {
				Result result=new Result();
				result.setuserId(rs.getInt("userId"));
				result.setquizId(rs.getInt("quizId"));
				result.setmarks(rs.getInt("marks"));
				results.add(result);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
    	return results;    	
    	
    }
    
    public static ArrayList<Result> getresultbyquizId(int quizId){
    	ArrayList<Result> results= new ArrayList<Result>();
    	try(PreparedStatement statement=getConnection().prepareStatement("select * from results where quizId=?")){
    		statement.setInt(1, quizId);
    		ResultSet rs=statement.executeQuery();
    		while(rs.next()) {
				Result result=new Result();
				result.setuserId(rs.getInt("userId"));
				result.setquizId(rs.getInt("quizId"));
				result.setmarks(rs.getInt("marks"));
				result.setname(getnamefromuserID(result.getuserId()));
				results.add(result);
			}
    		
    	}catch(SQLException e) {
			e.printStackTrace();
		}
    	return results;
    }
    
    public static String getnamefromuserID(int userId) {
    	try(PreparedStatement statement=getConnection().prepareStatement("select User_name from user where User_ID=?")){
    		statement.setInt(1, userId);
    		String name = null;
    		ResultSet rs=statement.executeQuery();
    		while(rs.next()) {
    			name=rs.getString("User_name");
    		
    		}
    		return name;
    	}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
    	
		
    }
    
    public static int getuserID(String username){

        try(PreparedStatement statement = getConnection().prepareStatement("SELECT User_ID FROM user where User_name = ?")){
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            int user_ID = 0;
            if(resultSet.next())
                 user_ID =  resultSet.getInt("User_ID");
            resultSet.close();
            close();
            return user_ID;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
    
    public static ArrayList<Integer> getQuizfromSub(int sub) {
		try(PreparedStatement statement = getConnection().prepareStatement("select * from quiz where sub=?")){
			ArrayList<Integer> quizzes=new ArrayList<>();
			statement.setInt(1, sub);
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				quizzes.add(rs.getInt("Quiz_ID"));
			}
			return quizzes;
		}catch(SQLException e) {
			e.printStackTrace();
		}
    	
    	return null;
    	
    }
    
    public static void register_user(String username, String Password, String Role) {
    	try(PreparedStatement statement = getConnection().prepareStatement("insert into user (User_name, Password, Role) values (?, ?, ?)")){
    		statement.setString(1, username);
    		statement.setString(2, Password);
    		statement.setString(3, Role);
    		statement.executeUpdate();
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    }
}
