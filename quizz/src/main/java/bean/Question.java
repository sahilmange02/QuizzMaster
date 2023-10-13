package bean;
import java.util.ArrayList;
public class Question {

    private int questionID;
    private String content;
    ArrayList<String> answers;
    int rightAnswer;
    
    public Question(){}
    
    public Question(int questionID, String content, ArrayList<String> answers) {
        this.questionID = questionID;
        this.content = content;
        this.answers = answers;
    }
    
    public void setrightAnswer(int rightAnswer) {
    	this.rightAnswer=rightAnswer;
    }
    public int getQuestionID() {
        return questionID;
    }
    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }
    
    @Override
    public String toString() {
        /*StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(content + "\n");
        for(int i = 0; i < answers.size()-1; i++)
            stringBuilder.append(answers.get(i) + "\n");
        stringBuilder.append("\n\n\n");
        return stringBuilder.toString(); */

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(content + "\n");
        char letter = 'a';
        for (int i = 0; i < answers.size(); i++) {
            stringBuilder.append(letter + ".  " + answers.get(i) + "\n");
            letter++;
        }
        return stringBuilder.toString();

    }


}