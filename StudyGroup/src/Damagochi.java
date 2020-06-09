import java.util.Scanner;

public class Damagochi {

	static String name;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("케릭터 이름을 입력해주세요");
		name = sc.next();
//		System.out.println("입력한 이름은 " + name + "입니다.");

		Scanner sc2 = new Scanner(System.in);
		int menu;
		System.out.println(name + "키우기를 시작합니다.");
		System.out.println("1. 밥 먹이기");
		System.out.println("2. 산책시키기");
		System.out.println("3. 배변하기");
		System.out.println("메뉴를 선택하세요");
		menu = sc2.nextInt();

		/*
		 * switch (menu) { case 1: feed(); break; case 2: workingOut(); break; case 3:
		 * shit(); }
		 */
	}

	class Pet {
		String name;

		Pet() {

		}

		/*
		 * static void feed() { System.out.println(name + "에게 밥을 먹입니다."); }
		 */
		
	}

}
