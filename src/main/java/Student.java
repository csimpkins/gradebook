package main.java;

import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<Section> sections;
	private ArrayList<GradebookItem> gradeItems;
	private double grade;
	private String letterGrade;
	private GradingScheme gradeScheme;

	public Student(String name, ArrayList<Section> sections,
			ArrayList<GradebookItem> gradeItems, GradingScheme gradeScheme) {
		this.name = name;
		this.sections = sections;
		this.gradeItems = gradeItems;
		this.gradeScheme = gradeScheme;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Section> getSections() {
		return sections;
	}

	public void setSections(ArrayList<Section> sections) {
		this.sections = sections;
	}

	public ArrayList<GradebookItem> getGradeItems() {
		return gradeItems;
	}

	public void setGradeItems(ArrayList<GradebookItem> gradeItems) {
		this.gradeItems = gradeItems;
	}

	public void calculate() {

		for (GradebookItem g : this.gradeItems) {
			this.grade += g.getScore() * g.getGradeCategory().getWeight() / 100;
		}
		this.grade += this.gradeScheme.getCurve();
		if (this.gradeScheme.isRoundUp()) {
			this.grade = Math.ceil(this.grade);
		}
		if (this.grade < 60) {
			this.letterGrade = "F";
		} else if (this.grade < 70) {
			this.letterGrade = "D";
		} else if (this.grade < 80) {
			this.letterGrade = "C";
		} else if (this.grade < 90) {
			this.letterGrade = "B";
		} else {
			this.letterGrade = "A";
		}
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}
}
