import java.util.ArrayList;
import java.util.List;

public class GenericTest8 {
	public static void display(List<? super Integer> li) {
		// <? super Integer> : 어떤 것이든 출력하고는 싶은데 Integer보다 큰 것만 출력하겠다
		// Integer의 상위 클래스만 출력하고 싶다.= Double은 출력하지 않겠다.
		for (int i = 0; i < li.size(); i++) {
			Object obj = li.get(i);
			System.out.println(i + " = " + obj);
		}
	}
	public static void main(String[] ar) {
		List<Integer> list = new ArrayList();
			// list에는 Integer값만 들어갈 수 있음.
		list.add(10);
		list.add(20);
		display(list);
		
		List<Double> list2 = new ArrayList();
		list2.add(12.34);
		list2.add(99.99);
//		display(list2);		// 출력 안 됨.
		
		
		List<Object> list3 = new ArrayList();
			// Object는 모든 것의 최상위 클래스.
//		list3.add("소원");
//		list3.add('a');
//		list3.add(56.78);
//		list3.add(30);
		list3.add(new Object());
		list3.add(new Object());
		display(list3);
		
	}
}
