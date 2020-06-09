
public class EnumTest {
	public static final String spring = "Spring";
		// void main 내부에서 사용하기 위해 static 적어줌
		// 13행과 같이 값을 변경 못하게 만들기 위해 final 예약어 사용
		// 값을 변경할 수 없는 정적 데이터를 선언할 때 final 예약어 사용
	private static final String summmer = "Summer";
	private static final String autumn = "Autumn";
	private static final String winter = "Winter";
	// 봄, 여름, 가을, 겨울의 값을 정적으로 정해둠
	public static void main(String[] ar) {
		System.out.println(spring);
		//	spring = "Winter";		// compile error
		System.out.println(spring);
		// 이렇게 하면 spring = "Spring"으로써만 사용하게 됨.
		// 3~9행까지를 하나의 프로그램이 아닌 여러 프로그램에서 사용하기 위해 하나의 클래스로 묶어둠. 그것이 enum
	}
}
