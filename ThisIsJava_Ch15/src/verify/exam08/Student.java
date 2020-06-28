package verify.exam08;

public class Student {
	public int studentNum;
	public String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student)) { // Student 타입이 아니라면. 비교 불가하므로
			return false;
		}
		Student student = (Student) obj;
		if (studentNum != student.studentNum) {
			return false;
		} else {
			return true;
		}
	}
}