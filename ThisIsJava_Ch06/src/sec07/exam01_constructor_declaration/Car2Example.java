package sec07.exam01_constructor_declaration;

public class Car2Example {
	public static void main(String[] ar) {
		Car2 car2 = new Car2("블랙", 3000);
		//Car2 car2 = new Car2();	// 기본 생성자 호출 불가능.
			//Car2 클래스에서 생성자를 선언하였으므로 디폴트 생성자는 선언되지 않는다
			//따라서 디폴트 생성자 호출 불가능하다.
	}
}
