package sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Arrays.asList() 메소드
// 고정된 객체들고 구성된 List 생성
public class ArrayAsListExample {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바");
		// 위의 코드는 아래와 같은 코드임.
//		List<String> list1 = new ArrayList<String>();
//		list1.add("홍길동");
//		list1.add("신용권"); 
//		list1.add("감자바");
		
		for (String name : list1) {
			System.out.println(name);
		}		

//		List<Integer> list2 = Arrays.asList(new Integer(1), new Integer(2), new Integer(3));
		// 위의 코드가 정석이나 그냥 정수값을 넣어줘도 Auto Boxing으로 Integer 객체 생성됨. 
		List<Integer> list2 = Arrays.asList(1, 2, 3);	// int -> Integer : Auto Boxing.
		for (int value : list2) {	// Integer -> int : Auto Unboxing.
			System.out.println(value);
		}
	}
}
