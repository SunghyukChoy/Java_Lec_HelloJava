package class01;

public class HeroMain {
	public static void main(String[] ar) {
		// 디폴트 생성자: 텅 빈 생성자로써 클래스 내부에 생성자가 정의되어 있지 않은 경우,
		// 자동으로 기입된다.
		Hero h1 = new Hero();
		// 생성자를 호출하며(Hero) 객체를 생성. 비어있는 생성자이므로 아무것도 실행되지 않음.
		// h1 -> {name = null, hp = 0;}
		h1.name = "쥬리오"; //h1 -> {name = 쥬리오, hp = 0;}
		h1.hp = 100;       //h1 -> {name = 쥬리오, hp = 100;}
		h1.punch(); 		// h1 -> {name = 쥬리오, hp = 100;}.punch();
		Hero h2 = new Hero("간달프", 80); // 객체를 생성과 동시에 생성자를 통해 초기화 
											//"간달프"와 80이 _name과 _hp로 던져짐.
										// h2 -> {name = 간달프, hp = 80;}
		h2.punch();						// h2 -> {name = 간달프, hp = 80;}.punch();
		
	}
}
class Hero {
	// 필드
	String name;
	int hp;
	
	//생성자
	//특징 1 : 리턴 타입 명시가 없는 메소드.
	//특징 2 : 이름이 클래스명과 같다. Hero = Hero
	Hero() { // 현재 비어있는 상태 // 디폴트 생성자
	}
	
	Hero(String _name, int _hp) {
		name = _name; // 위에서 던진 값이 다시 name과 hp에 대입
		hp = _hp;
	}
	void punch() {
		System.out.printf("[%s]의 펀치!\n", name);
	}
	
}