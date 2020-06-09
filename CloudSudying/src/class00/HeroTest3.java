package class00;

public class HeroTest3 {
	public static void main(String[] ar) {
		Hero3 thor = new Hero3("토르", 200);
		Hero3 thanos = new Hero3("타노스", 150);

		thor.punch(thanos);
		thanos.punch(thor);
		thor.punch(thanos);
		thanos.punch(thor);
		thor.punch(thanos);
		thanos.punch(thor);

	}
}

class Hero3 {
	String name;
	int hp;

	Hero3(String n, int h) { // 객체 생성 시 매개변수 값을 전달 받아 변수 값을 초기화 하는 메소드
		name = n;
		hp = h;
	}

	public void punch(Hero3 enemy) {
		// 이 메소드가 실행되면 전달된 매개변수가 enemy에 대입된다.
		// thanos.punch(thor)일 경우 thor의 name, hp값이 전달됨.
		System.out.printf("[%s]의 펀치!! -> [%s]의 hp : %d -> ", name, enemy.name, enemy.hp);
		// 여기서 name은 메소드를 실행한 주체의 name
		// thanos.punch(thor)일 경우  thano의 name, enemy.name과 enemy.hp는 thor의 name,hp
		enemy.hp -= 10;
		// enemy.hp - 10 = enemy.hp
		System.out.printf("%d\n", enemy.hp);
	}
}
