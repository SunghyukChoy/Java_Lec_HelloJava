import java.util.*;
public class ArraysTest {
	public static void main(String[] ar) {
		char[] data1 = new char[] { 'H','E','L','L','O'};
		char[] data2 = "HELLO".toCharArray();		
		
	/*	if(data1.length == data2.length) {
			for(int i = 0; i < data.length; i++) {
				if(data[i] != data[i]) {
					System.out.println("data1과 data2는 같지 않다.");
				}
			}	
		}	*/  // 복잡함.....이러한 비교 문구를 Arrays를 사용해서 간단하게 작성 가능.
		boolean check = Arrays.equals(data1, data2); // 배열 비교 구문. 비교하여 값을 check에 대입.
		System.out.println("두 배열은 같은가? = " + check);
		
		String str = Arrays.toString(data1); // data1을 문자열로 바꿔라.
		System.out.println(str);
	}
}
