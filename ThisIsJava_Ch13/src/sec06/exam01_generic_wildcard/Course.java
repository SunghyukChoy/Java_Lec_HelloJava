package sec06.exam01_generic_wildcard;

public class Course<T> {

	private String name; // 과정명
	private T[] students; // 학생수

	public Course(String name, int capacity) {
		// capacity : student 배열의 크기를 결정하기 위한 파라미터

		this.name = name;
		// students = new T[capacity];
		// 자바 문법에서 허용 안 됨. T가 결정되지 않은 상태에서 배열 생성 불가능.
		students = (T[]) new Object[capacity];
		// Object 타입으로 배열 생성 뒤 T 타입으로 강제 형변환
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

	public void add(T t) {

		// students 배열에서 비이었는 값이 생기면 찾아서 넣음.
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}