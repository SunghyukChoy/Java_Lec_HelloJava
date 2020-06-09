package class00;

public class HeroTest2 {
	public static void main(String[] ar) {
		Hero2 ironMan = new Hero2("아이언맨", 100);
		Hero2 tanos = new Hero2("타노스", 200);
		Hero2 thor = new Hero2("토르", 80);
		Hero2 groot = new Hero2("그루트", 30);

		// 객체를 배열화
		Hero2[] heroes = new Hero2[] { ironMan, tanos, thor, groot };
		
		for (int i = 0; i < heroes.length; i++) {
			System.out.println(heroes[i].toString());
		}

	}
}

class Hero2 {
	String name;
	int hp;
	

	Hero2(String _name, int _hp) { // 전달받은 매개변수로 변수를 초기화하기 위한 메소드
		name = _name;
		hp = _hp;
	}

	public String toString() {
		return String.format("[Hero] name : %s, hp : %d", name, hp);
	}
}
