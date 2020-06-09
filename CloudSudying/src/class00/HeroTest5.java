//HeroTest3 파일을 반복문으로 만든 것.

package class00;

public class HeroTest5 {
	public static void main(String[] ar) {
		Hero3 thor = new Hero3("토르", 200);
		Hero3 thanos = new Hero3("타노스", 150);

		while (thor.hp > 0 || thanos.hp > 0) {
			// thor의 hp가 0 이상 또는 thnos의 hp가 0 이상 둘 중 하나라도 참이면 실행

			thanos.punch(thor);
			if (thanos.hp == 0 || thor.hp == 0) {
				// thor의 hp가 0 또는 thnos의 hp가 0 둘 중 하나라도 참이면 실행
				break; // berak를 만나면 while문을 빠져나옴.
			}

			thor.punch(thanos);
			if (thanos.hp == 0 || thor.hp == 0) {
				// thor의 hp가 0 또는 thnos의 hp가 0 둘 중 하나라도 참이면 실행
				break; // berak를 만나면 while문을 빠져나옴.
			}

		}
	}
}

class Hero5 {
	String name;
	int hp;

	Hero5(String n, int h) {
		name = n;
		hp = h;
	}

	public void punch(Hero5 enemy) {
		System.out.printf("[%s]의 펀치!! -> [%s]의 hp : %d -> ", name, enemy.name, enemy.hp);
		enemy.hp -= 20;
		System.out.printf("%d\n", enemy.hp);
	}
}
