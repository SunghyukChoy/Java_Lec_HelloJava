class clazzTest2Super {
	int x = 100;
}
public class ClazzTest2 extends clazzTest2Super {
	int x = 200;
	
	public void test() { // 전달되는 매개변수 없음.
		System.out.println("x = " + x);
		// 전달되는 매개변수 값 없으므로 가장 가까운 값인 200 출력 

		System.out.println("this x = " + this.x);
		// 여기선 8행과 같은 의미의 코드.
		
		System.out.println("super x = " + super.x);
		// 상위에 있는, 상속 받은 클래스의 x 값을 출력하고자 할 때 super 예약어 사용.
	}
}
