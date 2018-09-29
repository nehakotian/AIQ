package lti.quiz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
//@Table(name="answer")//shud be same as db table name
public class Answer implements Serializable {

	@ManyToOne(fetch=FetchType.EAGER)	
	@JoinColumn(name="qid", referencedColumnName="qid")
	private Quiz quiz;
	
	@Id
	@Column(name="options")
	private String option;
	private String score;
	

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	
}
