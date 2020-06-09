package class00;

public class CatTest2 {
	public static void main(String[] args) {
		// 고양이 객체 c1 생성
		Cat2 cat = new Cat2();

		cat.name = "나비";
		cat.breeds = "코숏";
		cat.age = 7;
		// 메소드 호출
		cat.cry();
		cat.claw();

		System.out.printf("이름 : %s, 품종 : %s, 나이 : %d", cat.name, cat.breeds, cat.age);
	}
}

/* 고양이 클래스 */
class Cat2 {
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
