import java.util.Scanner;

public class Damagochi2 {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("다마고치 키우기");
		System.out.println("1. 시작");
		System.out.println("2. 종료");
		
		int start = sc.nextInt();
		String name;
		if(start == 1) {			
			System.out.println("케릭터 이름을 입력해 주세요.");
			Scanner sc2 = new Scanner(System.in);
			name = sc2.next();
			System.out.println(name + " 키우기를 시작합니다.");					
		} else {
			System.out.println("게임을 종료합니다.");
			return;
		}
		
		System.out.println("키우기 메뉴를 선택해 주세요.");
		
		Pet pet = new Pet(name);
		
		Scanner sc3 = new Scanner(System.in);
		int menu = sc3.nextInt();
		
		switch(menu) {
		case 1 :
//			feed();
		}
		
		
		
		
	}
}

class Pet {
	String name;
	int full;
	
	
	Pet(String name) {
		this.name = name;
	}
	
	void feed() {
		System.out.println(name + " 에게 밥을 먹입니다.");
	}
	
	
	
}
