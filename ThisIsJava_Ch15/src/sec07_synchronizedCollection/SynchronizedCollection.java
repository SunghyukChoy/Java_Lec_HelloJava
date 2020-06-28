package sec07_synchronizedCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SynchronizedCollection {

	public static void main(String[] args) {
		// 동기화(synchronized) : 멀티 스레드 환경에서 하나의 스레드가 사용하고 있을 때 다른 스레드가 사용할 수 없음을 말함.
		// Vector, Hashtable은 동기화된 컬렉션

		// 비동기화된 컬렉션을 동기화된 컬렉션으로 래핑 :
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		// Collections 클래스의 정적 메소드 sysynchronizedList() 메소드 호출 시
		// 매개값으로 ArrayList 객체를 주면 ArrayList를 래핑한 동기화된 컬렉션 생성됨.
		Set<String> set = Collections.synchronizedSet(new HashSet<String>());
		Map<String, Integer> map = Collections.synchronizedMap(new HashMap<String, Integer>());
	}
}