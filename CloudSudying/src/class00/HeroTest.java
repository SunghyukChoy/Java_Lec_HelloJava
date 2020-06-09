package class00;

public class HeroTest {
	public static void main(String[] args) {
		// 객체 생성
		Hero h1 = new Hero();
		Hero h2 = new Hero();
 
		// 객체 필드 초기화
		h1.name = "타노스";
		h1.hp = 100;
		h2.name = "아이언맨";
		h2.hp = 80;

		// 인스턴스(객체) 메소드를 통한 정보 출력
		System.out.printf("h1 => %s\n", h1.toString());
		System.out.printf("h2 => %s\n", h2.toString());
		System.out.println("h1 => " + h1.toString());
	}
}

class Hero {
	/* 1. 필드(이름, 체력)를 추가하세요. */
	String name;
	int hp;

	/* 메소드 */
	public String toString() {
		return "{name: " + name + ", hp: " + hp + "}";
	}
}