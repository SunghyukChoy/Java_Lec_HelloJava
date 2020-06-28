package sec03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		Set<Integer> set2 = new LinkedHashSet<>();
		Set<Integer> set3 = new TreeSet<>();

		// Set 컬렉션 :
		// 수학의 집합에 비유될 수 있다.
		// 저장 순서가 유지되지 않는다.
		// 객체를 중복해서 저장할 수 없고 하나의 null만 저장할 수 있다.

		// 객체 추가 및 삭제
		set.add("홍길동"); // 객체 추가
		set.add("신용권");
		set.remove("홍길동"); // 객체 삭제

		// Set 컬렉션은 인덱스로 객체를 검색해서 가져오는 메소드가 없는 대신에
		// 전체 객체를 대상으로 한 번씩 반복해서 가져오는 반복자(Iterator)를 제공한다.
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) { // 저장된 객체 수만큼 반복한다
			// String 객체 하나를 가져옴
			String str = iterator.next();
		}

		for (String str : set) {

		}

		// 반복자를 통한 객체 제거
		while (iterator.hasNext()) {
			String str = iterator.next();
			if (str.equals("신용권")) {
				iterator.remove();
			}
		}
	}
}
