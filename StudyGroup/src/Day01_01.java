import java.util.Scanner;

public class Day01_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = (int)(Math.random()*1000) + 1;
		int b = (int)(Math.random()*1000) + 1;
		
		int sum = a + b;
		
		System.out.println(a + " + " + b + " = " + sum);
		
		if(sc.nextInt() != sum) {
			System.out.println("오답입니다.");
		} else {
			System.out.println("정답입니다.");
		}
	}
}
