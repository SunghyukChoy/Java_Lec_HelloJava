
public class StaticTest {
	public static void main(String[] ar) {
	
		JBank a1 = new JBank("최성혁", 1000);
		JBank a2 = new JBank("황은비", 2000);
		
		a1.display();
		a2.display();
		
		//만약 백만명의 통장을 만든다면 ..
//		a1.interest = 0.03f;
//		a2.interest = 0.03f;
//		......
//		백만 개의 메모리 공간을 만들어야 하므로 엄청난 낭비
//		이러한 공간을 공통적으로 사용하기 위해 static 예약어 사용.		
		
		JBank.interest = 0.03f;
		// static인 멤버는 접근제한이 없으므로 클래스명으로 접근. 객체명으로도 가능. 
		
		a1.display();
		a2.display();
		
	}

}

