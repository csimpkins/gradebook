package main.java;

import java.util.ArrayList;

import org.junit.Test;

public class CourseTest {

  @Test
	public void test() {
		Course course = new Course("CS", 2340, "OOD",new ArrayList<Course>(), new ArrayList<Class>());
		assert(course.getCourseNumber() == 2340);
		assert(course.getName() == "OOD");
		assert(course.getSubject() == "CS");
	}

}
