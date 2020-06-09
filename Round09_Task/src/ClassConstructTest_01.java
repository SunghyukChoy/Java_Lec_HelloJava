// 메소드 오버로딩.
// 매개변수의 개수가 다르거나 매개변수의 자료형이 다른 생성자 매서드를 
// 하나의 클래스에 여러 개 만드는 것.

class ConstructExam_01 {
	/* 멤버 필드들 */
	int age;
	double money;
	
	/* 생성자들 */
	ConstructExam_01() {
		age = 30;
		money = 600000.0;
	}
	ConstructExam_01(int x) {
		age = x;
		money = 600000.0;
	}
	ConstructExam_01(double y) {
		age = 30;
		money = y;
	}
	ConstructExam_01(int x, double y) {
		age = x;
		money = y;
	}
}

public class ClassConstructTest_01 {
	public static void main(String[] ar) {

		ConstructExam_01 first = new ConstructExam_01();
		ConstructExam_01 second = new ConstructExam_01(25);
		ConstructExam_01 third = new ConstructExam_01(40000.0);
		ConstructExam_01 fourth = new ConstructExam_01(20, 30000.0);
		
		System.out.println("first = " + first.age + ", " + first.money);
		System.out.println("second = " + second.age + ", " + second.money);
		System.out.println("third = " + third.age + ", " + third.money);
		System.out.println("fourth = " + fourth.age + ", " + fourth.money);
	
	
	
	
	}
}
