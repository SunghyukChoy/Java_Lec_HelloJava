
public class EtcTest {
	private final String kor = "국어";
	// 변하지 않는 상수값을 지정하고자 할 떄 final 예약어 사용. 남발 가능...
	// 클래스에 선언할 경우 상속에 제한이 생김.
	// 메소드에 선언할 경우 오버라이드 하지 않겠다..
	
	transient int x = 100;
	// 파일에는 굳이 저장하지 않는 객체, 그런데 클래스에서는 사용하는 객체를 만들 때 쓰는 transient 예약어.
	int y = 200;
	
	public void test() {
		// kor = "영어";
		// 위처럼 변경 불가능. final로 선언되었기 때문.
	}
}
