package com.mapping.oneToManyAndManyToOne;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name ="question_one_to_many")
public class QuestionOneToMany {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "question_seq")
	@SequenceGenerator(name = "question_seq", sequenceName = "QUESTION_SEQ", allocationSize = 1)
	@Column(name="question_id")
	private int questionId;
	private String question;
	@OneToMany(mappedBy ="question",cascade = CascadeType.ALL)
	private List<AnswerOneToMany> answers;
	
	public QuestionOneToMany() {
		
	}

	public QuestionOneToMany(int questionId, String question, List<AnswerOneToMany> answers) {
		
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<AnswerOneToMany> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswerOneToMany> answers) {
		this.answers = answers;
	}

	
	
}
