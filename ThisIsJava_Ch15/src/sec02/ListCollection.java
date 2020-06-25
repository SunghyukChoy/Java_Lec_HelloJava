package sec02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List<Integer> list2 = new Vector<Integer>();
		List<String> list3 = new LinkedList<String>();

//		// 자바4 이전
//		List list = new ArrayList(); // 컬렉션 생성
//		list.add("홍길동"); // 컬렉션에 객체를 추가
//		Object obj = list.get(0); // 컬렉션에서 객체 검색
//		String name = (String) obj; // 타입 변환 후 홍길동을 얻을 수 있음.
//		// 자바5 이후
//		List<String> list = new ArrayList<String>(); // 컬렉션 생성
//		list.add("홍길동"); // 컬렉션에 객체를 추가
//		String name = list.get(0); // 컬렉션에서 객체 검색, 홍길동을 바로 얻음.
//		// 일반적으로 컬렉션에는 단일 종류의 객체들만 저장된다. 그래서 자바5부터 제네릭을 도입하여 ArrayList 객체를 생성할 때
//		// 타입 파라미터로 저장할 객체의 타입을 지정함으로써  불필요한 타입 변환을 하지 않도록 했다.

		// 객체 추가, 찾기, 삭제
		list.add("홍길동"); // 맨 끝에 객체 추가
		list.add(1, "신용권"); // 지정된 인덱스에 객체 삽입. 전의 인덱스와 객체들은 하나씩 뒤로 밀림.
		String str1 = list.get(1); // 인덱스로 객체 찾기
		list.remove(0); // 인덱스로 객체 삭제, 0번 인덱스의 객체가 삭제되면 뒤의 객체들이 앞으로 당겨져 채움. 2 -> 1, 1 -> 0
		list.remove("신용권"); // 객체 삭제, "신용권 "이라는 객체를 갖는 모든 인덱스에서 객체 삭제.

		// 전체 객체를 대상으로 반복해서 얻기
		for (int i = 0; i < list.size(); i++) { // 저장된 총 객체수만큼 반복
			String str2 = list.get(i);
		}

		for (String str3 : list) { // 저장된 총 객체수만큼 반복

		}
	}
}
