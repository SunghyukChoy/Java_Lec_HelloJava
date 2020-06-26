package sec04;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

public class MapCollection {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> map2 = new Hashtable<String, Integer>();
		Map<String, Integer> map3 = new LinkedHashMap<String, Integer>();
		Map<String, Integer> map4 = new TreeMap<String, Integer>();
		Properties properties = new Properties();
		
		// Map 컬렉션 : 
		// 키(key)와 값(value)으로 구성된 Map.Entry 객체를 저장하는 구조
		// 기와 값은 모두 객체
		// 키는 중복될 수 없지만 값은 중복 저장 가능
		// 기존에 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 저장

		map.put("홍길동", 30); // 객체 추가
		int score = map.get("홍길동"); // 객체 찾기
		map.remove("홍길동"); // 객체 삭제

		// 저장된 전체 객체를 대상으로 객체를 하나씩 얻는 밥법 1.
		Set<String> keySet = map.keySet();
		// Entry 객체(키(key) + 값(value)) == Map.Entry에서 모든 key를 Set 컬렉션에 저장
		Iterator<String> keyIterator = keySet.iterator(); // 반복자 생성
		while (keyIterator.hasNext()) {
			String key = keyIterator.next(); // 반복자로 키를 하나씩 얻음
			Integer value = map.get(key); // 그 키로 값을 얻음
		}

		// 저장된 전체 객체를 대상으로 객체를 하나씩 얻는 밥법 2.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		// 모든 Map.Entry를 Set 컬렉션에 저장
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator(); // 반복자 생성
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next(); // 반복자로 Map.Entry를 하나씩 얻음
			String key = entry.getKey(); // 키를 얻음
			Integer value = entry.getValue(); // 값을 얻음
		}
	}
}
