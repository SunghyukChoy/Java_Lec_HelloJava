package sec05.exam04_comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		// 방법 1.
		TreeSet<Fruit> treeSet = new TreeSet<>(new DescendingComparator());
		// Comparable 인터페이스를 구현하지 않았다면 TreeSet 객체 생성 시 매개변수로 정렬자(Comparator 구현 객체) 제공
		// 정렬자가 없으면 ClassCastException 발생

		// 방법 2.
//		TreeSet<Fruit> treeSet = new TreeSet<>(new Comparator<Fruit>() {
//			@Override
//			public int compare(Fruit o1, Fruit o2) {
//				return o2.price - o1.price;
//			}
//		});
		// 방법 3.
// 		TreeSet<Fruit> treeSet = new TreeSet<>((o1, o2) -> o1.price - o2.price);

		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
//		treeSet.add(new Car("그랜져", 3000));

		Iterator<Fruit> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + " : " + fruit.price);
		}
	}
}