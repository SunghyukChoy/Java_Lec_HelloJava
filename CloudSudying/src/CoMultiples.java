//출력예 : 144는 3과 4의 공배수입니다.
/*import java.util.Scanner;

public class CoMultiples {
	public static void main(String[] ar) {
		int num = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 = ");
		num = in.nextInt();
		
		comultiples(num);
	}
	public static void comultiples(int num) {
		if (num % 3 == 0 && num % 4 == 0) {
			System.out.printf("%d는 3과 4의 공배수입니다.\n", num);
		} else {
			System.out.printf("%d는 3과 4의 공배수가 아닙니다.\n", num);
		}
	}
	
	
}
*/ //이상 내가 직접 짜 본 것. 아래는 교재에 있는 것.
public class CoMultiples {
  public static void main(String[] args) {
    test(141, 3, 4);
    test(144, 3, 4);
    test(148, 3, 4);
  }
  
  // 숫자 n을 입력 받아 a와 b의 공배수 여부를 출력
  public static void test(int num, int a, int b) {
    // 밑줄 친 곳에 적절한 논리 연산자를 넣어주세요.
    if ((num % a == 0) && (num % b == 0)) {
      System.out.printf("%d는 %d과 %d의 공배수입니다.\n", num, a, b);
    }
    else {
    	System.out.printf("%d는 %d과 %d의 공배수가 아닙니다.\n", num, a, b);
    }
  }
}
