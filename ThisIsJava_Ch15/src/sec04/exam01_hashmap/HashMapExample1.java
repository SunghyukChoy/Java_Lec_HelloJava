package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 이름을 키로 점수를 값으로 저장하기
public class HashMapExample1 {
	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		// 키의 타입 String, 값의 타입 Integer

		// HashMap :
		// 키 객체는 hashCode()와 equals()를 재정의해서 동등 객체가 될 조건을 정해야 한다.
		// 키 타입은 String을 많이 사용
		// - String은 문자열이 같을 경우 동등 객체가 될 수 있도록 hashCode()와 equals() 메소드가 재정의되어 있기 때문.

		// 객체 저장
		map.put("신용권", new Integer(85));
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // "홍길동" 키가 같기 때문에 제일 마지막에 저장한 값으로 대치
		System.out.println("총 Entry 수: " + map.size()); // 저장된 총 Entry 수 얻기

		// 객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동")); // 이름(키)으로 점수(값)를 검색
		System.out.println();

		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet(); // Key Set 얻기

		// 반복해서 키를 얻고 값을 Map에서 얻어냄
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		// 객체 삭제
		map.remove("홍길동"); // 키로 MapEntry를 제거
		System.out.println("총 Entry 수: " + map.size());

		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // MapEntry Set 얻기
		// Map.Entry : Map 인터페이스의 중첩 인터페이스 (Map 인터페이스 안에 선언된 Entry 인터페이스)
		// 키의 타입은 String이고 값의 타입은 Integer인 Map.Entry 객체를 Set 컬렉션에 저장
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		// Map.Entry 객체의 반복자를 얻는 것이드모 Iterater 객체의 타입은 Map.Entry 객체의 타입과 같다.

		// 반복해서 Map.Entry를 얻고 키와 값을 얻어냄
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next(); // 하나의 Map.Entry 객체를 얻어냄
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		// 객체 전체 삭제
		map.clear(); // 모든 Map.Entry 삭제
		System.out.println("총 Entry 수: " + map.size());
	}
}