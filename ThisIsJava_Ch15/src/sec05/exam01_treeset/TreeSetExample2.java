package sec05.exam01_treeset;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

// 객체 정렬하기
public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(Integer.valueOf(87));
		scores.add(Integer.valueOf(98));
		scores.add(Integer.valueOf(75));
		scores.add(Integer.valueOf(95));
		scores.add(Integer.valueOf(80));

		for (Integer score : scores) {
			System.out.println("오름차순 정렬 : " + score);
			// TreeSet의 객체와 TreeMap의 키는 저장과 동시에 자동 오름차순으로 정렬
		}
		System.out.println();

		NavigableSet<Integer> descendingSet = scores.descendingSet(); // 내림차순으로 정렬된 Set 컬렉션 반환
		for (Integer score : descendingSet) {
			System.out.println(score);
		}
		System.out.println();

		Iterator<Integer> descendingIterator = scores.descendingIterator(); // 내림차순으로 정렬된 반복자 리턴
		while (descendingIterator.hasNext()) {
			int value = descendingIterator.next();
			System.out.println(value);
		}
		System.out.println();

		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet(); // 내림차순 * 내림차순 == 오름차순.

		for (Integer score : ascendingSet) {
			System.out.println(score);
		}
	}
}
