import java.util.Scanner;

public class Multiples {
 public static void main (String[] ar) {
	/* int n = 0;
	 Scanner in = new Scanner(System.in);
	 System.out.println("입력 수 =");
	 n = in.nextInt();
	test(n); */ // 입력값 받아 실험해 본 것
	test(12);
	test(123);
	test(1234);
	
 }
	 public static void test (int n) {
		 //String result = "";
		 if(n % 3 == 0) {
			 //result = "맞습니다."; // result라는 변수를 생성하여 사용할 수도 있음. 교재에 나온 내용
			 System.out.printf("%d는 3의 배수가 맞습니다.\n", n);
			 //System.out.printf("%d는 3의 배수가 %s\n", n, result);
		 }else {
			 //result = "아닙니다.";
			 System.out.printf("%d는 3의 배수가 아닙니다.\n", n);
			//System.out.printf("%d는 3의 배수가 %s\n", n, result);
		 }
	 }
 }
