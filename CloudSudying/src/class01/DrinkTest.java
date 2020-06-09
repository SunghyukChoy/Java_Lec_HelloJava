package class01;

public class DrinkTest {
	public static void main(String[] ar) {
		Drink dk = new Drink("박카스", 800);
		Drink dk1 = new Drink("콜라", 1000);
		Drink dk2 = new Drink("사이다", 900);
		Drink dk3 = new Drink();
		dk3.name = "우유";
		dk3.price = 1500;
		
		
		// 객체를 배열화
		Drink[] drinks = new Drink[] {dk, dk1, dk2, dk3};
		
		for(int i = 0; i < drinks.length; i++) {
			System.out.println(drinks[i].toString());
		}
		
	}
}
class Drink {
	String name;
	int price;
	
	Drink() {
		// 클래스 내부에 생성자가 없다면 디폴트 생상자가 자동으로 기재된다.
		// 하지만 하나 이상의 생성자가 클래스 내부에 작성되면 디폴트 생성자 효과는 사라진다
		// 따라서 직접 추가해 주어야 한다.
	}	
	Drink(String _name, int _price) {
		name = _name;
		price = _price;
	}
	public String toString() {
		return String.format("[Drink] name : %s, price : %d", name, price);
	}
}
