package class00;

public class BicycleTest3 {
	public static void main(String[] ar) {
		Bicycle3 b3 = new Bicycle3("신비자전거", 9.65, 50000);
								// 매개변수가 34행의 메소드로 전달되어 변수값이 초기화된다.
		Bicycle3 b4 = new Bicycle3();
		// 매개변수를 전달 받는 메소드 존재 시 이런 식의 매개변수가 없는 객체 생성은
		// 디폴트 생성자를 직접 적어줘야 생성 가능하다.
		b4.name = "은하자전거";
		b4.weight = 10.45;
		b4.price = 40000;
		// 디폴트 생성자로 객체 선언 후 변수의 초기값을 지정해준다
		// b4.Bicycle3("은하자전거", 10.45, 40000); -> 이런 식의 코드 안 됨.
			// 생성자는 메소드가 아니기 때문(?)(.. 인터넷 검색 결과) 
		
		System.out.println(b3.toString());
		System.out.println(b4.toString());
				
	}
}

class Bicycle3 {
	String name;
	double weight;
	int price;
	
	Bicycle3() {
		
	} 
	
	/*매개변수를 통한 초기화 구문 - 생성자 */
	// 5행의 객체 선언 시의 매개변수가 아래의 메소드에 전달된다.
	Bicycle3(String _name, double _weight, int _price) {
		name = _name;
		weight = _weight;
		price = _price;
	} 
	public String toString() {
		//toString()의 메소드는 public 접근제한자로 선언한다.
		return String.format("Bicycle 이름 : %s, 무게 : %.2fkg, 가격 : %s원\n", name, weight, price);
	}					//("내용", args);
	
}
