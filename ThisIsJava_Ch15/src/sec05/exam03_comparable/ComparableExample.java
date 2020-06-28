package sec05.exam03_comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("감자바", 25));
		treeSet.add(new Person("박지원", 31));
		// Person 클래스에서 Comparable 인터페이스를 구현하도록 명시하여서
		// compareTo 를 구현하면 age를 갖고 비교함.
		// age에 따라 오름차순 정렬
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + " : " + person.age);
		}
	}

}
