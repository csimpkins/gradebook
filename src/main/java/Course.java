package main.java;

import java.util.ArrayList;

public class Course {
	private String subject;
	private int courseNumber;
	private String name;
	private ArrayList<Course> preRequizites;
	private ArrayList<Class> classes;

	public Course(String subject, int courseNumber, String name,
			ArrayList<Course> preRequizites,ArrayList<Class> classes) {
		this.subject = subject;
		this.courseNumber = courseNumber;
		this.name = name;
		this.preRequizites = preRequizites;
		this.classes =classes;
	}

	public ArrayList<Class> getClasses() {
		return classes;
	}

	public void setClasses(ArrayList<Class> classes) {
		this.classes = classes;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Course> getPreRequizites() {
		return preRequizites;
	}

	public void setPreRequizites(ArrayList<Course> preRequizites) {
		this.preRequizites = preRequizites;
	}

}
