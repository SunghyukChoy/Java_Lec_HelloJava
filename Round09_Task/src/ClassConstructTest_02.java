// this() 메소드. this 메소드와 다름.

class ConstructExam_02 {
	int a, b, c, d, e;
	
	ConstructExam_02() {
		a = 0;
		b = 1;
		c = 2;
		d = 3;
		e = 4;
	}
	// d의 값을 변경하고자 할 때 반복되는 코드를 피하고 d만 변경할 수 있다.
	ConstructExam_02(int x) { //현재의 메소드가 호출되었을 떄
		// System.out.println("이런 걸 먼저 적으면 오류가 발생한다.");		
		this(); // 현재의 메소드가 호출되었을 때	 
				// ConstructExam_02() 메소드를 참조하는 this() 메소드가 실행된다, 따라서 각 값이 초기화된다.
		d = x;  // 그 이후 d 값만 전달 받은 매개변수 값으로 대입된다.
	}
	// d의 값과 e의 값을 둘 다 변경하고 싶을 때
	ConstructExam_02(int x, int y) { // 현재의 메소드가 호출되었을 떄
		this(x); // x를 매개변수로 하는 this()메소드가 실행되는데 이 메소드는
				// 위의 ConstructExam_02(int x) 메소드를 참조한다
				// 따라서 x 값이 d 에 대입된다.
		e = y;	// 위의 코드 실행의 전달 받은 y가 e에 대입된다
		
	}

}

public class ClassConstructTest_02 {
	public static void main(String[] ar) {
		ConstructExam_02 ce = new ConstructExam_02();
		ConstructExam_02 ce2 = new ConstructExam_02(10);
		ConstructExam_02 ce3 = new ConstructExam_02(100, 200);
		
		System.out.println(ce.a);
		System.out.println(ce.d);

		System.out.println(ce2.a);
		System.out.println(ce2.d);
		
		System.out.println(ce3.a + ce3.b);
		System.out.println(ce3.d + ce3.e);
		
		
		
	}
}
