package class01;

public class HeroMain2 {
	public static void main(String[] ar) {
		// arthas -> name : 아서스, hp : 30
		Hero2 arthas = new Hero2("아서스", 30);
		// diablo -> name : 디아블로, hp : 30
		Hero2 diablo = new Hero2("디아블로", 30);
		
		arthas.punch(diablo); // arthas 변수가 punch 메소드를 수행하는데 입력값으로 diablo를 던짐. 
		diablo.punch(arthas);	
		arthas.punch(diablo);
		diablo.punch(arthas);
		arthas.punch(diablo);
	}
}
class Hero2 {
	//필드
	String name;
	int hp;
	//생성자
	Hero2(String _name, int _hp) {
		name = _name;
		hp = _hp;
	}
	//메소드
	//타입으로써의 클래스: 클래스는 사용자가 정의한 또다른 타입이다.
	void punch(Hero2 enemy) { //Hero2 enemy = diablo;
							  //변수타입 변수명의 형태
		enemy.hp -= 10;
		System.out.printf("[%s]의 펀치!\n", name); 
						// 여기서 name은 해당 메소드를 실행하는 주체의 name
						//arthas.punch(diablo)라면 arthas의 name
		System.out.printf("\t%s의 HP : %d\n", enemy.name, enemy.hp);
						//enemy.name과 enemy.hp는 전달받은 값
						//arthas.punch(diablo)라면 diblo의 name과 hp
	}
}