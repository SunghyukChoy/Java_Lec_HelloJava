
public class StaticInnerClassTest_01 {
	public static class StaticInner_02 {
		public static void main(String[] ar) {
			System.out.println("inner 클래스 내부에 존재하는 main 메서드");
		}
	}
}

// main 메소드를 inner 클래스 내에서 사용하는 예
// main 메소드가 static으로 선언되었기 떄문에 정적 중첩 클래스(static 중첩 클래스)를 사용해야 함 .