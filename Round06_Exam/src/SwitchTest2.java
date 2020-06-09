import java.util.*;

public class SwitchTest2 {
	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);
		System.out.println("좋아하는 프로그램 언어는 = ");
		String lang = in.nextLine();
		switch(lang) {
		case "자바" : System.out.println("최고의 선택입니다."); break;
		default : System.out.println("잘못된 선택입니다.");
		
			
		}
		in.close();
		
		
	}

}
