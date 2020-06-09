
public class MySingletonTest {
	public static void main(String[] ar) {
		// MySingleton sing = new MySingleton();
			// private로 선언되었기 때문에 불러올 수 없음.
		// MySingleton sing = MySingleton.sing;
			// private로 선언되었기 때문에 불러올 수 없음.
		MySingleton sing = MySingleton.getInstance();
							// static 사용. 클래스명으로 접근
		MySingleton sing2 = MySingleton.getInstance();
		
		// sing과 sing2 두 개의 객체는 같을까?
		System.out.println(sing.equals(sing2));
		// sing과 sing2가 같냐고 묻는 질문
		// 결과 : true. 같은 객체를 가져오는 것이므로 두 객체는 같다.
		
		Person p = new Person();
		Person p2 = new Person();
		// new를 사용하여 객체를 생성하면 매번 다른 heap 영역에 메모리 할당..
		// p는 10억 번지.. p2는 20억 번지.. 서로 주소가 다름.
		System.out.println(p.equals(p2));
		// 결과 : false
		
		
		// 필요에 따라 하나의 클래스에서 나오는 객체는 하나인 것처럼 쓰여야 한다면 싱글톤 패턴
		// 그렇지 않고 개별적이고 독립적으로 쓰여야 할 이유가 있다면 일반적인 객체 사용.
	}
}
