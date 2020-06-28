package sec05.exam02_treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

// 키로 정렬하고 범위 검색하기
public class TreeMapExample3 {
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

		treeMap.put("apple", Integer.valueOf(10));
		treeMap.put("forever", Integer.valueOf(60));
		treeMap.put("description", Integer.valueOf(40));
		treeMap.put("even", Integer.valueOf(50));
		treeMap.put("zoo", Integer.valueOf(10));
		treeMap.put("base", Integer.valueOf(20));
		treeMap.put("guess", Integer.valueOf(70));
		treeMap.put("cherry", Integer.valueOf(10));

		System.out.println("[c-f 사이의 단어 검색]");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", true);
		// subMap() : 범위 검색 메소드 매개변수로 (처음값, 처음값 포함 여부, 마지막값, 마지막값 포함 여부)를 갖는다.
		// "c"로 시작하는 문자열 출력, "d","e"로 시작하는 문자열 출력
		// "f"로 시작하는 단어 미출력, 문자열이 "f" 한 자인 경우 출력. f 문자 하나까지만 마지막 범위
		// 사람이 생각하는 c~f 사이의 문자열을 찾기 위해선 ("c", true, "g", false)를 매개변수로 설정
		// 처음값 포함 여부는 true나 false나 결과값 같음
		for (Map.Entry<String, Integer> entry : rangeMap.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue() + "페이지");
		}
	}
}
