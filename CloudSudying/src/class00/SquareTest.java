package class00;

public class SquareTest {
	public static void main(String[] args) {
		// 객체 생성
		Square s = new Square();

		// 필드 초기화
		s.length = 4;

		// 결과 출력
		System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d", s.length, s.area());
	}
}

class Square {
	/* 1. 필드를 추가하세요. */
	int length;

	/* 2. 메소드를 완성하세요. */
	public int area() {
		return (int) Math.pow(length, 2);
	}
}