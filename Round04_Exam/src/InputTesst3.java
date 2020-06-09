import java.util.Scanner;
	
public class InputTesst3 {
	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("이름 = ");
		String name = in.nextLine();
		System.out.print("나이 = ");
		int age = in.nextInt();
		age = age - 1;
		
		System.out.println("당신의 이름은 " + name +"이고, 나이는 만 " + age + "세입니다");
		
		in.close();
	}
	
}
 