package sec04.exam01_hashmap;

import java.util.*;

// 학번과 이름이 동일한 경우 같은 키로 인식
public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		// 키는 Student 타입, 값은 Integer 타입

		map.put(new Student(1, "홍길동"), 95); // Student 객체를 생성하여 키로 저장.
		map.put(new Student(1, "홍길동"), 90);
		// 학번과 이름이 동일한 Student를 키로 저장
		// 사실 위의 두 객체는 다른 객체이지만 학생번호와 이름이 같으므로 동등 객체가 됨.
		// 키가 동등 객체가 되면 중복 저장되지 앟는다.

		System.out.println("총 Entry 수: " + map.size()); // 저장된 총 Map.Entry 수 얻기

		System.out.println(map.get(new Student(1, "홍길동")));
		// 나중에 넣은 값으로 저장됨.
	}
}