package sec04.exam02_hashtable;

import java.util.*;

// 아이디와 비밀번호 검사하기
public class HashTableExample {
	public static void main(String[] ar) {
		Map<String, String> map = new Hashtable<String, String>();

		// Hashtable :
		// 키 객체는 hashCode()와 equals()를 재정의해서 동등 객체가 될 조건을 정해야 한다.
		// Hashtable은 스레드 동기화(synchronization)가 되어 있기 떄문에
		// 복수의 스레드가 동시에 Hashtable에 접근해서 객체를 추가, 삭제하더라도 스레드에 안전(thread safe)하다.
		// 스레드 1이 Hashtable에 접근 시 스레드 2는 접근하지 못하므로 안전함.
		// 싱글 스레드 환경에서는 HashMap을 사용하는 것이 성능면에서 유리하다.

		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		// 아이디와 비밀번호를 미리 저장시킨다.

		Scanner scanner = new Scanner(System.in); // 키보드로부터 입력된 내용을 받기 위해 생성

		while (true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디: ");
			String id = scanner.nextLine(); // 키로드로 입력한 아이디를 읽는다.
			// nextLine() : 엔터키를 누르기 전까지 입력한 문자열을 얻어옴

			System.out.print("비밀번호: ");
			String password = scanner.nextLine(); // 키보드로 입력한 비밀번호를 읽는다.
			System.out.println();

			if (map.containsKey(id)) { // 아이디인 키가 존재하는지 확인한다.
				if (map.get(id).equals(password)) { // 비밀번호를 비교한다.
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
	}
}
