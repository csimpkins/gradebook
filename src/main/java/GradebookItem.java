package main.java;

public class GradebookItem {
	private String name;
	private GradebookCategory gradeCategory;
	private double score;

	public GradebookItem(String name, GradebookCategory gradeCategory,
			double score) {
		this.name = name;
		this.gradeCategory = gradeCategory;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GradebookCategory getGradeCategory() {
		return gradeCategory;
	}

	public void setGradeCategory(GradebookCategory gradeCategory) {
		this.gradeCategory = gradeCategory;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}
