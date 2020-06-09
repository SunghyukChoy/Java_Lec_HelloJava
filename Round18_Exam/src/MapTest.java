import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] ar) {
		Map<Integer, Person> hashtable = new Hashtable<>();
		Map<Integer, Person> hashmap = new HashMap<>();
			// key, value로 저장되기 때문에 제네릭 사용 시 두 개의 제네릭 타입 지정.
		
		Person p1 = new Person("신비", 22);
		Person p2 = new Person("은하", 23);
		Person p3 = new Person("소원", 25);
		Person p4 = p1;	// 동일한 객체 저장 가능. 

		hashtable.put(1, p1);
		hashtable.put(2, p2);
		hashtable.put(3, p3);
		hashtable.put(4, p4);	// p1과 p4 동일한 데이터
		
		hashmap.put(1, p1);
		hashmap.put(1, p2);
		hashmap.put(1, p3);
		hashmap.put(1, p4);		// key 값으로 전부 동일한 데이터	// value 값에는 p4만 남음.
		
		// 사이즈 확인
		System.out.println("hashtable size = " + hashtable.size());
							// 4 출력. key 값이 다르기 때문에 서로 다른 데이터로 인식.
		System.out.println("hashMap size = " + hashmap.size());
							// 1 출력. key 값이 같기 때문에 같은 데이터로 인식.
		
		// set처럼 iterator로 가져올 수 있음.
		/*
		Set<Person>persons =(Set<Person>) hashtable.values();
								// Set으로 형변환	// key 값들은 제거한 value 값들만 가져옴.
								// 향뱐환 오류 남..왜...?		*/
		Collection persons = hashtable.values();
								// 오류 안 남.
		Iterator<Person> it = persons.iterator();
			// Iterator 타입으로 형변환
		while(it.hasNext()) {
			Person person = it.next();
			person.display();
		}	// 그러나 위와 같이 코딩하는 것보단 Set을 쓰는 것이 나음. key에 대해 특정한 데이터를
			// 뽑는 것이 아니라 무작위로 추출하는 것이기 때문에.*/
		
		// Map을 쓰는 이유는 key 값에 의해 특정한 데이터를 가져오기 위해
		System.out.println();
		Person pp = hashtable.get(3);
		pp.display();
		System.out.println();
		Person sinb = hashmap.get(1);
		pp.display();
	}
} 
