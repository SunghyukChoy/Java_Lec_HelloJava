package Ex15_5;

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
		
		System.out.println("[c-f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("C", true, "f", true);
		for(String word : rangeSet) {
			System.out.println(word);
		}
	}
}