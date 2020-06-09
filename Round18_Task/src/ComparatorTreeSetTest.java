import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
class Student {
	private String name;
	private int grade;
	private int classNo;
	public Student(String name, int grade, int classNo) {		
		this.name = name;
		this.grade = grade;
		this.classNo = classNo;
	}
	public String getName() {
		return name;
	}
	public void display() {
		System.out.printf("이름 : %s, 학년 : %d학년, 반 : %d반\n", name, grade, classNo);
	}	
}
class MyComparator implements Comparator<Student> {
	@Override
	public int compare(Student arg0, Student arg1) {
		
		return arg0.getName().compareTo(arg1.getName());
	}	
}
public class ComparatorTreeSetTest {
	public static void main(String[] ar) {
		SortedSet<Student> sets = new TreeSet<>(new MyComparator());
		sets.add(new Student("신비", 1, 13));
		sets.add(new Student("예린", 2, 7));
		sets.add(new Student("은하", 2, 7));
		sets.add(new Student("소원", 3, 15));
		sets.add(new Student("지수", 2, 8));
		
		sets.forEach(student -> student.display());
	}
}
