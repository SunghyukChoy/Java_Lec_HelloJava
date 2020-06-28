package sec05.exam01_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

// 영어 단어를 정렬하고, 범위 검색해보기
public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		treeSet.add("f");
		treeSet.add("fall");
		treeSet.add("give");
		treeSet.add("g");

		System.out.println("[c-f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		// subSet() : 범위 검색 메소드 매개변수로 (처음값, 처음값 포함 여부, 마지막값, 마지막값 포함 여부)를 갖는다.
		// "c"로 시작하는 문자열 출력, "d","e"로 시작하는 문자열 출력
		// "f"로 시작하는 단어 미출력, 문자열이 "f" 한 자인 경우 출력. f 문자 하나까지만 마지막 범위
		// 사람이 생각하는 c~f 사이의 문자열을 찾기 위해선 ("c", true, "g", false)를 매개변수로 설정
		// 처음값 포함 여부는 true나 false나 결과값 같음
		for (String word : rangeSet) {
			System.out.println(word);
		}
	}
}