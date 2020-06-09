import java.util.Arrays;
public class ArraysTest {
	public static void main(String[] ar) {
		char[] data = new char[] {'H','E','L','L','O'};
		char[] data2 = "HELLO".toCharArray();
		
		boolean check = Arrays.equals(data, data2); // 두 배열의 내용 비교
		System.out.println("data와 data2는 같니? = " + check);
		
		String str = Arrays.toString(data);	// 배열의 내용 추출 후 문자열로 반환
		System.out.println("data = " + str);
		
		char[] copy = Arrays.copyOfRange(data, 1, 3);	
						// 배열의 1번째에서 3번쨰 직전(2번째)까지 추출
		System.out.println("copy = " + Arrays.toString(copy));	// 추출한 값을 문자열로 반환
		
		Arrays.sort(data);	// 알파벳 오름차순(A부터 Z방향)으로 정렬
		System.out.println("sort data = " + Arrays.toString(data));	// 추출한 값을 문자열로 반환
		
		int pos = Arrays.binarySearch(data, 'E');	// 배열로부터 값의 위치  
		System.out.println("'E' position = " + pos);	// 위에서 알파벳 오름차순으로 정렬했으므로 0번쨰 위치.
		
		Arrays.fill(data2, 'A');	// 배열의 모든 값을 A로 초기화.	
		System.out.println("'A' initialize = " + Arrays.toString(data2));		
	}
}
