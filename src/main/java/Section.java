package main.java;

import java.util.ArrayList;

public class Section {
	private ArrayList<Student> students;
	private Class theClass;
	private double aveGrade;
	private String aveLetterGrade;

	public Section(Class theClass, ArrayList<Student> students) {
		this.students = students;
		this.theClass = theClass;
	}

	public double getAveGrade() {
		return aveGrade;
	}

	public void setAveGrade(double aveGrade) {
		this.aveGrade = aveGrade;
	}

	public String getAveLetterGrade() {
		return aveLetterGrade;
	}

	public void setAveLetterGrade(String aveLetterGrade) {
		this.aveLetterGrade = aveLetterGrade;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public Class getTheClass() {
		return theClass;
	}

	public void setTheClass(Class theClass) {
		this.theClass = theClass;
	}

	public void calculate() {
		int count = 1;
		for (Student g : this.students) {
			g.calculate();
			this.aveGrade += g.getGrade();
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
