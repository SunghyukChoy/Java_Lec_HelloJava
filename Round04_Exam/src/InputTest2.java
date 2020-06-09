import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest2 {
	public static void main (String[] ar) throws IOException{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	
	
	System.out.print("이름 = ");
	String name = in.readLine();
	System.out.print("나이 = ");
	String ageStr = in.readLine();
	int age = Integer.parseInt(ageStr);
	age = age - 1;
	
	System.out.println("당신의 이름은 " + name + "입니다");
	System.out.println("당신의 나이는 만 "  + age + "세입니다");
	} 
}
