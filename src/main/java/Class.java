package main.java;

import java.util.ArrayList;

public class Class {
	private Course course;
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public ArrayList<Section> getSections() {
		return sections;
	}

	public void setSections(ArrayList<Section> sections) {
		this.sections = sections;
	}

	private ArrayList<Section> sections;
	private double aveGrade;
	private String aveLetterGrade;

	public Class(ArrayList<Section> sections, Course course) {
		this.sections = sections;
		this.course = course;
	}
	public void calculate() {
		int count = 1;
		for (Section g : this.sections) {
			g.calculate();
			this.aveGrade += g.getAveGrade();
			count++;
		}
		this.aveGrade = this.aveGrade / count;
		if (this.aveGrade < 60) {
			this.aveLetterGrade = "F";
		} else if (this.aveGrade < 70) {
			this.aveLetterGrade = "D";
		} else if (this.aveGrade < 80) {
			this.aveLetterGrade = "C";
		} else if (this.aveGrade < 90) {
			this.aveLetterGrade = "B";
		} else {
			this.aveLetterGrade = "A";
		}
	}
}
