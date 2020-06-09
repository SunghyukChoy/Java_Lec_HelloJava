package class00;

public class catTest {
	public static void main(String[] args) {
		// 고양이 객체 생성
		Cat c = new Cat();

		// 고양이 객체 초기화
		c.name = "짬타이거";
		c.breeds = "페르시안";
		c.age = 4;

		/* 1. 필드값을 변경해주세요 */

		// 고양이 객체 정보 출력
		System.out.printf("[고양이] { name: %s, breeds: %s, age: %d }", c.name, c.breeds, c.age);
		System.out.println();
		c.claw();
		c.cry();

	}
}

/* 고양이 클래스 */
class Cat {
	/* 필드(상태) */
	String name; // 이름
	String breeds; // 품종
	int age; // 나이

	/* 메소드(동작) */
	public void cry() {
		System.out.println("야옹~");
	}

	public void claw() {
		System.out.println("할퀴기 시전! 슥샥!");
	}
}