package sec05.exam02_treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

// 객체 정렬하기
public class TreeMapExample2 {
	public static void main(String[] ar) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(Integer.valueOf(87), "홍길동");
		scores.put(Integer.valueOf(98), "이동수");
		scores.put(Integer.valueOf(75), "박길순");
		scores.put(Integer.valueOf(95), "신용권");
		scores.put(Integer.valueOf(80), "김자바");

		Set<Map.Entry<Integer, String>> entrySet = scores.entrySet();
		for (Map.Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
			// TreeSet의 객체와 TreeMap의 키는 저장과 동시에 자동 오름차순으로 정렬
		}
		System.out.println();

		// NavigableSet<Integer> descendingKeySet = scores.descendingKeySet();
		// Map.Entry 객체의 key들만 가져와 내림차순으로 정렬

		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		// Map.Entry 객체를 내림차순으로 정렬
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
		// Map.ENtry객체 (키(key) + 값(value))를 Set 컬렉션에 저장
		for (Map.Entry<Integer, String> entry : descendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
		System.out.println();

		NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
		for (Map.Entry<Integer, String> entry : ascendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
	}
}
