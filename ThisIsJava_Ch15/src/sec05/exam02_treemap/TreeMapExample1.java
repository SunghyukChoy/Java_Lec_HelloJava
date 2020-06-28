package sec05.exam02_treemap;

import java.util.Map;
import java.util.TreeMap;

// 특정 Map.Entry 찾기
public class TreeMapExample1 {
	public static void main(String[] ar) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		// TreeMap :
		// 이진 트리를 기반으로 한 Map 컬렉션
		// 키와 값이 저장된 Map.Entry를 저장
		// 왼쪽과 오른쪽 자식노드를 참조하기 위한 두 개의 변수로 구성
		// 객체의 크고 작음 비교는 key를 가지고 비교함. 키가 중수면 정수의 크기, 문자면 아스키 코드..
		scores.put(Integer.valueOf(87), "홍길동");
		scores.put(Integer.valueOf(87), "이동수");
		scores.put(Integer.valueOf(75), "박길순");
		scores.put(Integer.valueOf(95), "신용권");
		scores.put(Integer.valueOf(80), "김자바");

		Map.Entry<Integer, String> entry = null; // 검색 결과를 담을 Map.Entry 객체

		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수: " + entry.getKey() + "-" + entry.getValue());

		entry = scores.lastEntry();
		System.out.println("가장 높은 점수: " + entry.getKey() + "-" + entry.getValue());

		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95점 아래 점수: " + entry.getKey() + "-" + entry.getValue());

		entry = scores.higherEntry(new Integer(95));
		System.out.println("95점 위의 점수: " + entry.getKey() + "-" + entry.getValue());

		entry = scores.floorEntry(new Integer(95));
		System.out.println("95점이거나 바로 아래 점수: " + entry.getKey() + "-" + entry.getValue());

		entry = scores.ceilingEntry(new Integer(85));
		System.out.println("85점이거나 바로 위의 점수: " + entry.getKey() + "-" + entry.getValue());

		while (!scores.isEmpty()) { // 객체가 저장되어 있다면
			entry = scores.pollFirstEntry(); // 제일 왼쪽 노드부터 TreeNao에서 뽑아 버림(out)
			// entry = scores.pollLastEntry();
			System.out.println(entry.getKey() + "-" + entry.getValue() + "(남은 객체 수: " + scores.size() + ")");
		}
	}
}
