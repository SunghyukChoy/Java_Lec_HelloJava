package sec02.exam03_linkedlist;

import java.util.*;

// ArrayList와 LinkedList의 실행 성능 비교
public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		// 인접 참조를 링크해서 체인처럼 관리
		// 특정 인덱스에서 객체를 제거하거나 추가하게 되면 바로 앞뒤 링크만 변경
		// 빈번한 객체 삭제와 삽입이 일어나는 곳에서는 ArrayList보다 좋은 성능을 발휘

		long startTime;
		long endTime;

		startTime = System.nanoTime(); // 현재 시간을 저장
		for (int i = 0; i < 10000; i++) { // 10000번 객체 저장 반복
			list1.add(0, String.valueOf(i)); // i를 문자열로 변환하여 0번 인덱스에 저장. 10000번 반복
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime - startTime) + " ns");

		// 빈번한 객체 삭제와 삽입이 일어나는 곳에서는 ArrayList를 사용하는 것이 바람직하지 않다.
		// 이런 경우라면 LinkedList를 사용하는 것이 좋다.
		// 그러나 인덱스 검색이나, 맨 마지막에 객체를 추가하는 경우에는 ArrayList가 더 좋은 성능을 발휘한다.

		List<String> list3 = new LinkedList<String>();
		list3.add("영");
		list3.add("일");
		list3.add("이");
		list3.add("삼");
		list3.add("사");
		list3.add("오");

		list3.remove(2);
		for (int i = 0; i < list3.size(); i++) {
			String str = list3.get(i);
			System.out.println(i + "번 인덱스의 값 = " + str);
		}
		// 인덱스 삭제 시 앞으로 1씩 당겨짐.
		System.out.println();

		list3.add("객체 추가");
		for (int i = 0; i < list3.size(); i++) {
			String str = list3.get(i);
			System.out.println(i + "번 인덱스의 값 = " + str);
		}
		// 객체 추가 시 마지막 인덱스에 추가
	}
}