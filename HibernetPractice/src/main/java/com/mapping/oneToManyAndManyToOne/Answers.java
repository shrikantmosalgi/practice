package com.mapping.oneToManyAndManyToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
public class Answers {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "answer_seq")
	@SequenceGenerator(name = "answer_seq", sequenceName = "ANSWER_SEQ", allocationSize = 1)
	@Column(name="answer_id")
	private int answerId;
	
	private String answer;
	
	@ManyToOne
	private Questions question;

	public Answers() {
		
	}

	public Answers(int answerId, String answer) {
		
		this.answerId = answerId;
		this.answer = answer;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Questions getQuestion() {
		return question;
	}

	public void setQuestion(Questions question) {
		this.question = question;
	}
	
	
	
}
