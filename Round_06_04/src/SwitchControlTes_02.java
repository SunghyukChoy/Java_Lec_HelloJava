import java.util.Scanner;

public class SwitchControlTes_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int su1 = 0, su2 = 0, result = 0;
		char yon = '\0';
		// char는 0으로 초기화해도 되고 '\0'으로 초기화해도 됨.
		// '\0'의 아스키 코드(값)가 0이기 때문에 동일함.
		
		System.out.print("첫번째 수 = ");
		su1 = in.nextInt();
		
		System.out.print("연산자(+, -, *, /, %) = ");
		yon = in.next().charAt(0);
		// in.next()는 문자열을 입력받음
		// 입력받은 문자열에서 charAt은 특정 위치(여기에서는 인덱스 0)의 문자 하나를 가져옴
		
		System.out.print("두번째 수 = ");
		su2 = in.nextInt();
		
		switch(yon) {
		case '+': 
			result = su1 + su2; 
			break;
		case '-': 
			result = su1 - su2; 
			break;		
		case '*': 
			result = su1 * su2; 
			break;
		case '/': 
			result = su1 / su2; 
			break;
		case '%': 
			result = su1 % su2; 
			break;
		default :
			System.out.println("연산자를 잘못 입력하셨습니다. : " + yon);
			System.exit(0);
		}
		
		System.out.println();
		System.out.println(su1 + " " + yon + " " + su2 + " = " + result);
	}
}

// 교재에 분명 콜론 표시 (:)로 나와있는데 오류남.
