package com.HBOneToManyMap;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Question {

	@Override
	public String toString() {
		return "Question [queid=" + queid + ", question=" + question + ", answers=" + answers + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "queid")
	int queid;

	@Column(name = "que")
	String question;

	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "queid")
	@OrderColumn(name = "type")
	List<Answer> answers;

	public int getQueid() {
		return queid;
	}

	public void setQueid(int queid) {
		this.queid = queid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

}
