package class00;

public class StarCraft2 {
	public static void main(String[] ar) {
		Unit mr = new Unit("마린", 100);
		Unit md = new Unit("메딕", 100);
		Unit hr = new Unit("히드라", 100);

		while (mr.hp > 0 || hr.hp > 0) {
			if (hr.hp >= 50 && mr.hp > 10) {
				mr.stimpack();
				mr.stimpackAttack(hr);
			} else
				mr.mrAttackEnemy(hr);
			if (hr.hp <= 0) {
				hr.declareDeath();
				break;
			}
			if (mr.hp < 50) {
				md.healAllied(mr);
			}
			hr.hrAttackEnemy(mr);
			if (mr.hp <= 0) {
				mr.declareDeath();
				break;
			}
		}
	}
}
class Unit {
	String name;
	int hp;

	Unit() {

	}

	Unit(String n, int h) {
		name = n;
		hp = h;
	}
	void hrAttackEnemy(Unit ar) {
		System.out.printf("[%s]의 공격!! [%s]의 hp : %d ", name, ar.name, ar.hp);
		ar.hp -= 13;
		if(ar.hp < 0) {
			ar.hp = 0;
		}
		System.out.printf("-> %d\n", ar.hp);
		
	}
	void mrAttackEnemy(Unit ar) {
		System.out.printf("[%s]의 공격!! [%s]의 hp : %d ", name, ar.name, ar.hp);
		ar.hp -= 10;
		if(ar.hp < 0) {
			ar.hp = 0;
		}
		System.out.printf("-> %d\n", ar.hp);
	}
	void healAllied(Unit ar) {
		System.out.printf("[%s]의 치료!! [%s]의 hp : %d ", name, ar.name, ar.hp);
		ar.hp += 5;
		System.out.printf("-> %d\n", ar.hp);
	}
	void stimpackAttack(Unit ar) {
		System.out.printf("[%s]의 공격!! [%s]의 hp : %d ", name, ar.name, ar.hp);
		ar.hp -= 15;
		if(ar.hp < 0) {
			ar.hp = 0;
		}
		System.out.printf("-> %d\n", ar.hp);
	}
	void stimpack() {
		System.out.printf("[%s]의 스팀팩!! [%s]의 hp : %d ", name, name, hp);
		hp -= 5;
		System.out.printf("-> %d\n", hp);
	}
	void declareDeath() {
		System.out.printf("%s가 쥬금!!! ㅠㅠ", name);
	}
}