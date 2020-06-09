import java.util.*;
public class SwitchTest123 {
	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);
		System.out.print("Jumin's 7th = ");
		int n = in.nextInt();
		int year = 1800;
		if (n == 1 || n == 2) year = 1900;
	
		else if (n == 3 || n == 4) year = 2000;
		
		switch(n) {
		case 9 :
		case 1 :											// break를 만날 떄까지 계속 내려옴. case 9,3,1 모두 같은 내용부이므로 중복하여 적을 필요 없음.
		case 3 : System.out.println(year + "년대 남성입니다."); break;
		case 0 :
		case 2 :
		case 4 : System.out.println(year + "년대 여성입니다."); break;
		default : System.out.println("잘못된 입력입니다."); 
		}
		in.close();
		
	}
}
