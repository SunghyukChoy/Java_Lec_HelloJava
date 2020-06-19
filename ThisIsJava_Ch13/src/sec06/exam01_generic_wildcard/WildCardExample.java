package sec06.exam01_generic_wildcard;

import java.util.Arrays;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		// Course<?> : Course 객체 생성 시 제네릭 타입으로 어떠한 타입의 클래스가 지정되어도 상관없다.
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		// Course<? extends Student> : Course 객체 생성 시 제네릭 타입으로 상위클래스(Student)와 그 하위클래스들만
		// 올 수 있따.
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));

	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		// Course<? super Worker> : Course 객체 생성 시 제네릭 타입으로 하위클래스(Worker)와 그 상위클래스들만 올 수
		// 있다
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));

	}

	public static void main(String[] args) {

//		registerCourse(new Course<Person>("일반인 과정", 5));
//		registerCourse(new Course<Student>("학생 과정", 5));
//		registerCourse(new Course<Worker>("근로자 과정", 5));
//		registerCourse(new Course<HighStudent>("고등학생 과정", 5));
//
//		// registerCourseStudent(new Course<Person>("일반인 과정", 5));
//		// Student 또는 그의 하위클래스가 아니므로 컴파일 에러
//		registerCourseStudent(new Course<Student>("학생 과정", 5));
//		// registerCourseStudent(new Course<Worker>("근로자 과정", 5));
//		// Student 또는 그의 하위클래스가 아니므로 컴파일 에러
//		registerCourseStudent(new Course<HighStudent>("고등학생 과정", 5));
//
//		registerCourseWorker(new Course<Person>("일반인 과정", 5));
//		// registerCourseWorker(new Course<Student>("학생 과정", 5));
//		// Worker 또는 그의 상위클래스가 아니므로 컴파일 에러
//		registerCourseWorker(new Course<Worker>("근로자 과정", 5));
//		// registerCourseWorker(new Course<HighStudent>("고등학생 과정", 5));
//		// Worker 또는 그의 상위 클래스가 아니므로 컴파일 에러

		Course<Person> personCourse = new Course<Person>("일반인 과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Person("직장인"));
		personCourse.add(new Person("학생"));
		personCourse.add(new Person("고등학생"));

		Course<Worker> workerCourse = new Course<Worker>("직장인 과정", 5);
		workerCourse.add(new Worker("직장인"));

		Course<Student> studentCourse = new Course<Student>("학생 과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new Student("고등학생"));

		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생 과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));

		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();

		// registerCourseStudent(personCourse);
		// registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();

		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		// registerCourseWorker(studentCourse);
		// registerCourseWorker(highStudentCourse);
		System.out.println();
	}
}