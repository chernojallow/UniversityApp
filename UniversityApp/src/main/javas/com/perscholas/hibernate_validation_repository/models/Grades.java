package com.perscholas.hibernate_validation_repository.models;

public class Grades {
	
	private int gradeId;
	private int courseId;
	private int userId;
	private String letter;
	private int score;
	
	public int getGradeId() {
		return gradeId;
	}
	
	public Grades(){};
	
	public Grades(String letter, int score ) {
		this.letter = letter;
		this.score = score;
	}
	
	
	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getLetter() {
		return letter;
	}
	public void setLetter(String letter) {
		this.letter = letter;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}



}
