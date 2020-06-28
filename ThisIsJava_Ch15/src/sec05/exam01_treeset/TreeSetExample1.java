package sec05.exam01_treeset;

import java.util.Iterator;
import java.util.TreeSet;

// 특정 객체 찾기
public class TreeSetExample1 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		// 타입 파라미터는 TreeSet 객체의 타입에 따라 지정
		// TreeSet :
		// 이진 트리(binary tree)를 기반으로 한 Set 컬렉션
		// 왼쪽과 오른쪽 자식노드를 참조하기 위한 두 개의 변수로 구성 :
		// 하나의 노드에는 세 가지 영역이 있는데 중앙에는 value, 왼쪽에는 왼쪽 자식 노드에 대한 참조(번지)
		// 오른쪽에는 오른쪽 자식 노드에 대한 참조(번지)로 구성되어 있다.
		/*
		 * TreeSet은 Set 인터페이스를 구현한 클래스이기 때문에 Set 인터페이스 타입의 변수에 대입해도 되지만 TreeSet 변수에 담은
		 * 이유는 TreeSet이 갖고 있는 검색 메소드를 사용하기 위해서이다. Set 인터페이스는 모든 Set 구현 클래스가 갖고 있는 공통
		 * 메소드만 갖고 있다.
		 */
		scores.add(Integer.valueOf(87));
		scores.add(Integer.valueOf(98));
		scores.add(Integer.valueOf(75));
		scores.add(Integer.valueOf(95));
		scores.add(Integer.valueOf(80));
		// 이진 트리를 구성하며 저장

		Integer score = null;

		score = scores.first();
		System.out.println("가장 낮은 점수: " + score); // 가장 왼쪽 노드의 객체

		score = scores.last();
		System.out.println("가장 높은 점수: " + score + "\n"); // 가장 오른쪽 노드의 객체

		score = scores.lower(new Integer(95)); // 95를 저장한 노드의 왼쪽 바로 아래 노드
		System.out.println("95점 아래 점수: " + score);

		score = scores.higher(new Integer(95)); // 95롤 저장한 노드의 오른쪽 바로 위 노드
		System.out.println("95점 위의 점수: " + score + "\n");

		score = scores.floor(new Integer(95));
		System.out.println("95점이거나 바로 아래 점수: " + score);

		score = scores.ceiling(new Integer(85));
		System.out.println("85점이거나 바로 위의 점수: " + score + "\n");

		while (!scores.isEmpty()) { // 객체가 저장되어 있다면
			score = scores.pollFirst(); // 제일 왼쪽 노드부터 TreeSet에서 뽑아 버림(out)
			System.out.println(score + "(남은 객체 수: " + scores.size() + ")"); // pollFirst() 메소드에 의해 하나씩 삭제됨.
		}

//		Iterator<Integer> iterator = scores.iterator();
//		while (iterator.hasNext()) {
//			int s = iterator.next();
//			System.out.println(s);			
//		}
		// pollFirst(), pollLast() 메소드와 iterator() 메소드의 차이점 :
		// pollFirst() : TreeSet에서 제일 왼쪽 객체를 가져온 후 그 객체를 TreeSet에서 제거함(오름차순)
		// pollLast() : TreeSet에서 제일 오른쪽 객체를 가져온 후 그 객체를 TreeSet에서 제거함(내림차순)
		// iterator() : TreeSet에서 가져오기만 함. 아래와 같이 작성하면 pollFirst()와 같아짐.

//		while (iterator.hasNext()) {
//			int s = iterator.next();
//			iterator.remove();
//			System.out.println(s + "(남은 객체 수 : " + scores.size() + ")");			
//		}
	}
}
