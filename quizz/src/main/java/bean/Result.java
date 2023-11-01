package bean;

public class Result{
	private int userId;
	private int quizId;
	private int marks;
	private String name;
	public void setuserId(int userId) {
		this.userId=userId;
	}
	
	public int getuserId() {
		return userId;
	}
	
	public void setquizId(int quizId) {
		this.quizId=quizId;
	}
	
	public int getquizId() {
		return quizId;
	}
	
	public void setmarks(int marks) {
		this.marks=marks;
	}
	
	public int getmarks() {
		return marks;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
}