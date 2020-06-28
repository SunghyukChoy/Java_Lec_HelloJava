package sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Set;

// Member 객체를 중복없이 저장하는 HashSet
public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();

		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		// 인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장
		/*
		 * HashSet이 판단하는 동일한 객체란 꼭 같은 인스턴스를 뜻하지는 않는다. HashSet은 객체를 저장하기 전에 먼저 객체의
		 * hashCode() 메소드를 호출해서 해시코드를 얻어낸다. 그리고 이미 저장되어 있는 객체들의 해시코드와 비교한다. 만약 동일한 해시코드가
		 * 있다면 다시 equals() 메소드로 두 객체를 비교해서 true가 나오면 동일한 객체로 판단하고 중복 저장을 하지 않는다.
		 */

		System.out.println("총 객체수 : " + set.size()); // 저장된 객체 수 얻기
	}
}
