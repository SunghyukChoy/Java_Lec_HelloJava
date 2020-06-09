
public class ClazzTest {
	int x = 100;
	
	
	
	public void test(int x) {
		System.out.println("member x = " + this.x);
		// 전달받은 매개변수 값이 아닌 자기 자신의 x 값을 출력하고자 할 떈 this 예약어 사용
		// 자신의 클래스 내부에서 자기 자신을 지칭할 때 this 예약어 사용.
		System.out.println("x = " + x);
		
	
	}
}
