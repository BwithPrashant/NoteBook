package com.prashant.noteBook.repository;

public class RegistrationUser {
	
	private String name;
	private String email;
	private String password;
	private String security_question;
	private String security_answer;
	public RegistrationUser()
	{
		
	}
	public RegistrationUser(String name, String email, String password, String security_question,
			String security_answer) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.security_question = security_question;
		this.security_answer = security_answer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecurity_question() {
		return security_question;
	}
	public void setSecurity_question(String security_question) {
		this.security_question = security_question;
	}
	public String getSecurity_answer() {
		return security_answer;
	}
	public void setSecurity_answer(String security_answer) {
		this.security_answer = security_answer;
	}
	@Override
	public String toString() {
		return "RegistrationUser [name=" + name + ", email=" + email + ", password=" + password + ", security_question="
				+ security_question + ", security_answer=" + security_answer + "]";
	}
	
}
