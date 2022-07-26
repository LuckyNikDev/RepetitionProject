package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
	private List<Student> studentList = new ArrayList<>();

	public void addStudents() {
		studentList.add(new Student("Nik", 5));
		studentList.add(new Student("Bob", 3));
		studentList.add(new Student("Jack", 1));
	}

	public List<Student> getStudentList() {
		return studentList;
	}
}
