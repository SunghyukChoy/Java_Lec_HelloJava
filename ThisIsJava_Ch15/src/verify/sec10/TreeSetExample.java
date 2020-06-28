package verify.sec10;

import java.util.TreeSet;

/*TreeSet에 Student 객체를 저장하려고 합니다. Student의 score 필드값으로 자동으로 정렬하도록 구현하고 싶습니다.
TreeSet의 last() 메소드를 호출했을 때 가장 높은 score의 Student 객체가 리턴되도록 Student 클래스를 완성해 보세요.*/
public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student("blue", 96));
		treeSet.add(new Student("red", 86));
		treeSet.add(new Student("white", 92));

		Student student = treeSet.last();
		System.out.println("최고 점수 : " + student.score);
		System.out.println("최고 점수를 받은 아이디 : " + student.id);
	}
}