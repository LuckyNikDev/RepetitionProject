package aop;

public class Student {
	private String name;
	private int course;

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", course=" + course +
				'}';
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public int getCourse() {
		return course;
	}
}
