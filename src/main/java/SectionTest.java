package main.java;

import java.util.ArrayList;

import org.junit.Test;


public class SectionTest {

  @Test
	public void test() {
		Course course = new Course("CS", 2340, "OOD",new ArrayList<Course>(), new ArrayList<Class>());
		Section testSection = new Section(new Class(new ArrayList<Section> (), course), new ArrayList<Student> () );
		assert(testSection.getStudents().size() == 0);
		assert(testSection.getClass().getName() != "OOD");
		assert(testSection.getTheClass().getCourse().getName() == "OOD");
	}

}
