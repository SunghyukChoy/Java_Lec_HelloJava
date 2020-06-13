package sec03.exam01_multi_type_parameter;

// 제네릭 객체 생성
public class ProductExample {

	public static void main(String[] args) {

		Product<Tv, String> product1 = new Product<>();
		// 생성자의 다이아몬드 연산자 내에 있는 타입 생략 가능
		// Product 클래스 생성 시 제네릭 선언만 하고 구체적 타입 명시 안 함.
		// Product 객체 생성 시 타입 지정
		product1.setKind(new Tv());
		// Tv 타입의 객체만 저장 가능
		product1.setModel("스마트TV");
		// String 타입의 객체만 저장 가능
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();

		Product<Car, String> product2 = new Product<Car, String>();
		// Car, String 타입으로 객체 생성
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}
}