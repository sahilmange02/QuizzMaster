package bean;

import java.io.Serializable;

public class userBean implements Serializable {
	private static final long serialVersionUID = 1L ;
	private int User_ID;
	private String User_name;
	private String Email;
	private String Password;
	private String Role;
	
	public userBean(){}
	public int getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(int User_ID) {
		this.User_ID= User_ID ;
	}
	public String getUser_name() {
		return User_name;
	}
	public void setUser_name(String User_name) {
		this.User_name= User_name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email= Email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password= Password;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String Role) {
		this.Role= Role;
	}
	 public userBean( String User_name, String Email, String Password, String Role) {
	        this.User_name = User_name;
	        this.Email = Email;
	        this.Password = Password;
	        this.Role = Role;
	    }
}

