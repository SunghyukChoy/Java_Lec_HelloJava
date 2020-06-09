import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListTest {
	public static void main(String[] ar) {
		List<Person> vc = new Vector<>();
		List<Person> list = new ArrayList<>();
		
		Person p1 = new Person("신비", 22);
		Person p2 = new Person("은하", 23);
		Person p3 = new Person("소원", 25);
		Person p4 = p1;		// 동일한 객체 저장 가능.
		
		vc.add(p1);
		list.add(p1);
		vc.add(p2);
		list.add(p2);
		vc.add(p3);
		list.add(p3);
		vc.add(p4);
		list.add(p4);
		
		// for 반복문으로 위치 번째 지정하여 사용 가능.
		// 위치 번재를 알고 있기 때문에 Iterator로 가져올 필요 없음.
		for(int i = 0; i < vc.size(); i++) {	// 특정 위치 번째 출력 가능.
			Person person = vc.get(i); // i번쨰 찾아옴.
			person.display(); // 중복데이터(p4) 허용.
		}
		System.out.println();
		
		// 바로 객체를 뽑아서 사용 가능.
		for(Person p : vc) {	// p는 vc에서 뽑아서 사용하겠다.	// 그냥 전부 다 출력.
			p.display();			
		}
		
		System.out.println();
		
		list.add(2, new Person("예린", 24));
			// list 2번째 위치에 Person 하나 추가.
			// 기존의 2번쨰 위치의 앞에 새롭게 2번째로 위치		
		
		for(int i = 0; i < list.size(); i++) {
			Person person = list.get(i);
			person.display();
		}
		// 둘의 사용법은 동일하나 멀티 스레드에 대해 안전하냐의 차이.
	}
}
