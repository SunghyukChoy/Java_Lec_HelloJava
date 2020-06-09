import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void display() {
		System.out.println("name = " + name + ", age = " + age);
	}
}
public class SetTest {
	public static void main(String[] ar) {
		Set<Person> set = new HashSet<>();
			// 나는 Person만 저장하겠다. 제네릭화.
		Person p1 = new Person("신비", 22);
		Person p2 = new Person("은하", 23);
		Person p3 = new Person("소원", 25);
		Person p4 = p1;	// 동일한 객체 저장 가능.
		
		set.add(p1); 	// Person 만 넣을 수 있음.
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		System.out.println("size = " + set.size());
								// size = 3 출력. 중복데이터(p4) 허용하지 않음.
		//set에서 데이터를 무작위로 뽑아 사용하고 싶을 떄
		Iterator<Person> it = set.iterator();	//Iterator 인터페이스로 반복문 돌려 사용.
		while(it.hasNext()) {	// 다음 데이터가 있느냐..
			Person person = it.next();
			person.display();	// 정렬되지 않은 데이터 출력.
		}		
	}
}
