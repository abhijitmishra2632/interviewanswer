package com.cosmos.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "answerdb")
public class Answer {
	@Id
	public long answerseq;
	private LocalDate now;
	private long questionseq;
	private String answer;
		
	private boolean active;

	public Answer() {
		super();
	}

	public long getAnswerseq() {
		return answerseq;
	}



	public void setAnswerseq(long answerseq) {
		this.answerseq = answerseq;
	}



	public long getQuestionseq() {
		return questionseq;
	}



	public void setQuestionseq(long questionseq) {
		this.questionseq = questionseq;
	}



	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public LocalDate getNow() {
		return now;
	}

	public void setNow(LocalDate now) {
		this.now = now;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	

}
