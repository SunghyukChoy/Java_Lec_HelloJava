
public class DummyDbContext {
	public static Student[] GetStudent() {
		Student[] students = new Student[2];		
		students[0] = new Student("최성혁", 100, 100, 100);
		students[1] = new Student("선현민", 90, 90, 90);
		
		return students;
	}
}
