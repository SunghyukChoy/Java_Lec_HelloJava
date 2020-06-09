import java.util.Scanner;

public class PolymorphismFigureTest {
	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);
		MyPoint[] figures = new MyPoint[5];
		for (int i = 0; i < figures.length; i++) {
			boolean check = false;
			do {
				check = false;
				System.out.println("\n1. 원 2. 사각형 3. 전체보기 4. 종료 = ");
				int command = in.nextInt();
				switch (command) {
				case 1:
					figures[i] = new Circle();
					break;
				case 2:
					figures[i] = new Rect();
					break;
				case 3:
					for (MyPoint mp : figures) {
						if (mp != null)
							mp.display();
					}
					i--; // 전체보기 시에는 값을 입력한 것이 아니므로 i의 증가된 값을 줄인다.
					break;
				case 4:
					System.out.println("수고하셨습니다.");
					System.exit(0);
				default:
					System.out.println("잘못 입력하셨습니다.");
					check = true;
				}
			} while (check);
		}
		System.out.println("모든 도형을 다 입력하셨습니다.");
		for (MyPoint mp : figures) {
			mp.display();
		}
		in.close();
	}
}
