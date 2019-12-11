package designpatten.templatemethod_15.test1;

import designpatten.templatemethod_15.explain.better.model.LoginModel;

public class NormalLoginModel extends LoginModel{

	//������֤
	private String question;
	
	//������֤�Ĵ�
	private String answer;

	
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	
}
