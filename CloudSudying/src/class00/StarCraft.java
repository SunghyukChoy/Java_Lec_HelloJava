// HeroTest4 연장
package class00;

public class StarCraft {
	public static void main(String[] ar) {
		Marine marine = new Marine("마린", 100);
		Medic medic = new Medic("메딕", 100);
		Dragoon dragoon = new Dragoon("드라군", 150);
		
		marine.stimpack();
		while (marine.hp > 0 || dragoon.hp > 0) {
			marine.AttackDragoon(dragoon);
			if (marine.hp <= 0 || dragoon.hp <= 0) {
				System.out.println("쥬금");
				break;
			}
			if (marine.hp < 50) {
				medic.healing(marine);
			}
			dragoon.AttackMarine(marine);
			if (marine.hp <= 0 || dragoon.hp <= 0) {
				System.out.println("쥬금");
				break;
			}
		}
		
	}
}

class Marine {
	String name;
	int hp;

	Marine(String n, int h) {
		name = n;
		hp = h;
	}

	void stimpack() {
		System.out.printf("[%s]의 스팀팩!! [%s]의 hp : %d ", name, name, hp);
		hp -= 10;
		System.out.printf("-> %d\n", hp);
	}

	void AttackDragoon(Dragoon ar) {
		System.out.printf("[%s]의 공격!! [%s]의 hp : %d ", name, ar.name, ar.hp);
		ar.hp -= 10;
		System.out.printf("-> %d\n", ar.hp);
	}
}

class Medic {
	String name;
	int hp;

	Medic(String n, int h) {
		name = n;
		hp = h;
	}

	void healing(Marine ar) {
		System.out.printf("[%s]의 치료!! [%s]의 hp : %d ", name, ar.name, ar.hp);
		ar.hp += 5;
		System.out.printf("-> %d\n", ar.hp);
	}
}

class Dragoon {
	String name;
	int hp;

	Dragoon(String n, int h) {
		name = n;
		hp = h;
	}

	void AttackMarine(Marine ar) {
		System.out.printf("[%s]의 공격!! [%s]의 hp : %d ", name, ar.name, ar.hp);
		ar.hp -= 17;
		System.out.printf("-> %d\n", ar.hp);

	}
}
