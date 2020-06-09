import java.util.Scanner;
public class SwitchControlTest_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String menu = "";
		double pay = 0.0;        // 일반적으로 돈은 double로 선언한다
		short count = 0;		// 주문수량
		
		System.out.print("주문(짜장면, 짬뽕, 탕수육) = ");
		menu = in.nextLine();
		
		System.out.print("주문수량 = ");
		count = in.nextShort();
		
		switch(menu) {
		case "짜장면" : pay = 5500 * count; break;
		case "짬뽕" : pay = 6500 * count; break;
		case "탕수육" : pay = 11500 * count; break;
		default :
			System.out.println("메뉴에 없는 항목입니다. ");
			System.exit(0);
			
		
		}
		
		System.out.println();
		System.out.println("주문한 메뉴는 " + menu + "이고, " + count + "개 주문했습니다. ");
		System.out.println("총 금액은 " + pay + "원 입니다. ");
	}
}

// 단품 메뉴가 아닌 여러 메뉴 섞어서 주문했을 때 코드
// 주문에 짜장면, 짬뽕이라 입력했을 때 결과 안 나옴
// 

