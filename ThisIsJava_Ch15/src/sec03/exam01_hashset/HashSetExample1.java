package sec03.exam01_hashset;

import java.util.*;

// String 객체를 중복 없이 저장하는 HashSet
public class HashSetExample1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		// HashSet :
		// 동일 객체 및 동등 객체는 중복 저장하지 않는다.
		// 동등 객체 판단 방법 :
		// hashCode() 리턴값 : 같음 -> equals() 리턴값 : 같음 -> 동등 객체
		// hashCode() 리턴값 : 같음 -> equals() 리턴값 : 다름 -> 다른 객체
		// hashCode() 리턴값 : 다름 -> 다른 객체
		/*
		 * HashSet이 판단하는 동일한 객체란 꼭 같은 인스턴스를 뜻하지는 않는다. HashSet은 객체를 저장하기 전에 먼저 객체의
		 * hashCode() 메소드를 호출해서 해시코드를 얻어낸다. 그리고 이미 저장되어 있는 객체들의 해시코드와 비교한다. 만약 동일한 해시코드가
		 * 있다면 다시 equals() 메소드로 두 객체를 비교해서 true가 나오면 동일한 객체로 판단하고 중복 저장을 하지 않는다.
		 */

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // "Java"는 한 번만 저장됨
		set.add("iBATIS");

		int size = set.size(); // 저장된 객체 수 얻기
		System.out.println("총 객체수: " + size);

		Iterator<String> iterator = set.iterator(); // 반복자 얻기
		// Set 컬렉션은 인덱스로 객체를 검색해서 가져오는 메소드가 없다.
		// Set의 타입 파라미터와 Iterater의 타입 파라미터는 같아야 한다. Set 객체의 값들을 가져오기 때문.

		while (iterator.hasNext()) { // 객체 수만큼 루핑 // 가져올 요소가 있느냐
			String element = iterator.next(); // 한 개의 객체를 가져온다.
			System.out.println("\t" + element);
		}

		set.remove("JDBC"); // 한 개의 객체 삭제
		set.remove("iBATIS"); // 한 개의 객체 삭제

		System.out.println("총 객체수: " + set.size()); // 저장된 객체 수 얻기

		iterator = set.iterator();
		while (iterator.hasNext()) { // 객체 수만큼 루핑
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		System.out.println("총 객체수: " + set.size()); // 저장된 객체 수 얻기

		for (String elemnet : set) {
			System.out.println("\t" + elemnet);
		}

		while (iterator.hasNext()) {
			String str = iterator.next();
			if (str.equals("Java")) {
				iterator.remove();
			}
		}

		System.out.println("총 객체수: " + set.size()); // 저장된 객체 수 얻기

		set.remove("Java");
		System.out.println("set.remove 후 총 객체수: " + set.size()); // 저장된 객체 수 얻기
		iterator = set.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println("\t" + str);
		}

		set.clear(); // 모든 객체를 제거하고 비움
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}
