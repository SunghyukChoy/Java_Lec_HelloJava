import java.util.Scanner;

public class PlusGame {

	public static void main(String[] args) {
		
		int a = (int)(Math.random()*1000)+1;
		int b = (int)(Math.random()*1000)+1;		
		int sum = a + b;
		
		System.out.println(a + " + " + b + " = ");
		
		Scanner sc = new Scanner(System.in);
		
		
		int input = sc.nextInt();
		
		if(input != sum) {
			System.out.println("오답입니다.");
		} else {
			System.out.println("정답입니다.");
		}

	}

}
