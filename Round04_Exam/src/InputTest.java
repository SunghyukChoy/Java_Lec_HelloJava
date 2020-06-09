import java.io.IOException;

public class InputTest {
	public static void main(String[] ar) throws IOException {
		System.out.print("입력 = ");
		int ascii = System.in.read();
		int enter_01 = System.in.read(); // \r : 13
		int enter_02 = System.in.read(); // \n : 10
		System.out.println("\n입력된 값은 " + ascii + "입니다");
		System.out.println("엔터기의 값은 " + enter_01 + "과" + enter_02 + "입니다");
		System.out.println();
		System.out.print("입력 = ");
		int ascii2 = System.in.read();
		int enter2_01 = System.in.read(); // \r : 13
		int enter2_02 = System.in.read(); // \n : 10
		System.out.println("\n입력된 값은 " + ascii2 + "입니다");
		System.out.println("엔터기의 값은 " + enter2_01 + "과" + enter2_02 + "입니다");
	}
}
 