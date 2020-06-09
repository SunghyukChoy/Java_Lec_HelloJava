/* Object 클래스 */
// 모든 클래스는 Object 클래스의 하위 클래스 개념이다.
// 자바 api의 최상위 클래스
// equals, getClass, toString, hashCode

class Kim extends Object { // 눈에는 안 보이지만 extends Object가 생략되어 있음.
			// 클래스에 아무런 상속관계도 지정하지 않으면 Object 클래스를 상속받고 있다고 판단.
	// 내용부에 아무것도 없음.
}
class Lee extends Object {
	
	/* toString 메소드 재정의 */
	public String toString() {
		//toString();
			//상위에 있는 toString을 호출하기 위해 이렇게 코딩한다면??
			// 상위에 있는 toString을 호출하는 것이 아니라 자기 자신인 toString을 호출함(엄밀히 얘기하면 this.toString()
			// 무한루프에 빠지고 메모리 오버플로우로 프로그램 종료됨...
			// 그래서 사용하는 예약어가 super
		/* super 예약어 */
		// 상위클래스를 지칭하는 예약어
		// 여러 단계의 상속 시 가장 가까운 상위를 지칭하는 예약어
			// A-B-C 상속 시 B에서 찾고 없으면 A에서 찾고 없으면 Object에서 찾음
		// 메서드의 형태로 상위 클래스의 생성자 호출 가능
		// 메서드의 형태로 사욜할 경우에는 생성자 메서드의 첫번째 코드로 한번만 작성 가능.
		String original = super.toString();
		return "abcd" + original;
		// 상위클래스인 Object 클래스의 toString메소드 실행 후 재정의 한 toString 메소드 실행.
		
	}
}

public class ObjectTest {
	public static void main(String[] ar) {
		Kim kim = new Kim();
		System.out.println("hashicode = " + kim.hashCode());
		System.out.println("KimtoString = " + kim.toString());
		// Kim 클래스 내용부에는 아무것도 없지만 출력 결과가 나옴.
		Lee lee = new Lee();
		System.out.println("LeetoString = " + lee.toString());
		// toString 메서드 재정의 후 재정의한 값으로 나옴.
		
		/* Object 클래스의 toString과 재정의한 toString 모두 출력하고 싶다면?? */
		
	}
}
