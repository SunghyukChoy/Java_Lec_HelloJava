import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Comparator2 implements Comparator<Integer> {
	public int compare(Integer arg0, Integer arg1) {
		
		return arg0 - arg1;
	}
}
public class ArrayListTest {
	public static void main(String[] ar) {
		Integer[] numbers = new Integer[] {100, 500, 300, 200};
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(numbers));
		
		list.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		list.add(2, new Integer(400)); 	// 500 다음 위치에 400 삽입.
		list.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		System.out.println("300의 위치 = " + list.indexOf(300));
		
		list.set(1, 525);				// 1번째 위치에 있는 값을 525로 변경
		list.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
//		list.sort(new MyComparator2()); // 정렬
		list.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
	}
}
