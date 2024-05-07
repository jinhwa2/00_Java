package com.kh.practice.Audition.model.vo;

public class Audition {
	private String name;
	private String vlaue;
	private int score;
	private boolean passed;
	
//Setter
public void setName(String name) {
		this.name = name;
	}
	public void setVlaue(String vlaue) {
		this.vlaue = vlaue;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setPassed(boolean passed) {
		this.passed = passed;
	}
//Getter
public String getName() {
		return name;
	}
	public String getVlaue() {
		return vlaue;
	}
	public int getScore() {
		return score;
	}
	public boolean isPassed() {
		return passed;
	}
//생성자
public Audition() {
	
}
//필수 생성자
public Audition( String name,String vlaue,int score) {
	this.name = name;
	this.vlaue = vlaue;
	this.score = score;
}
//String returns inform()
public String inform() {
	return "이름은: "+name+" 분야는; "+vlaue+" 점수는:	 "+score+ " 합격여부는"+passed;
	
}




}