package sec01;

import java.util.ArrayList;
import java.util.List;

public class Note {
	public static void main(String[] ar) {

		List list = new ArrayList();
		// List : 인터페이스 객체
		// ArrayList() : 구현 클래스, 다양한 객체 저장 가능.
		list.add("hellO");
		// 문자열을 저장하였다 하여도 String 타입이 아닌 Object 타입으로 변환 되어 저장됨.
		String str = (String) list.get(0);
		// Object 타입으로 리턴되는 것을 다시 String 타입으로 변환 하여야 한다 -> 성능 저하

		List<String> list2 = new ArrayList<String>();
		// String만 저장하겠다 선언.
		list2.add("hello");
		// String 타입으로 저장. 다른 타입 저장 불가능. 타입 변환이 발생하지 않음.
		String str2 = list2.get(0);
		// 타입 변환이 발생하지 않음. -> 성능 향상. 
	}
}
