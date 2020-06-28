package sec02.exam01_arraylist;

import java.util.*;

// String 객체를 저장하는 ArrayList
public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// ArrayList의 생성자는 기본값으로 10의 저장 용량을 가짐.
		// 괄호에 30 입력 시 저장 용량은 30으로 지정됨.
		// 저장 용량을 초과한 객체들이 들어오면 자동적으로 늘어남. 10개씩 늘어남.

		list.add("Java"); // 비어있는 마지막 인덱스에 저장. // index : 0
		list.add("JDBC"); // index : 1
		list.add("Servlet/JSP"); // index : 2 -> 3
		list.add(2, "Database"); // index : 2
		list.add("iBATIS"); // index : 4

		int size = list.size(); // 저장된 총 객체 수 얻기
		System.out.println("총 객체수: " + size);
		System.out.println();

		String skill = list.get(2); // 2번 인덱스의 객체 얻기
		System.out.println("2: " + skill);
		System.out.println();

		for (int i = 0; i < list.size(); i++) { // 저장된 총 객체 수만큼 루핑
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();

		list.remove(2); // 2번 인덱스 객체(Database) 삭제 // index : 2에 Servlet/JSP 주소 저장
		for (int i = 0; i < list.size(); i++) { // 저장된 총 객체 수만큼 루핑
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();

		list.remove(2); // 2번 인덱스 객체(Servlet/JSP) 삭제됨
		for (int i = 0; i < list.size(); i++) { // 저장된 총 객체 수만큼 루핑
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();

		list.remove("iBATIS"); // 객체 "iBATIS" 삭제
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}

		List<String> list2 = new ArrayList<String>();
		list2.add("영");
		list2.add("일");
		list2.add("이");
		list2.add("삼");
		list2.add("사");
		list2.add("오");

		list2.remove(2);
		for (String str : list2) {
			System.out.println(str);
		}
		list2.add("객체 추가"); // 객체 추가 시 마지막 인덱스에 저장됨.
		for (int i = 0; i < list2.size(); i++) {
			String str = list2.get(i);
			System.out.println(i + "번 인덱스의 값 = " + str);
		}
	}
}