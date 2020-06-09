package array;

public class ArrayExam {
	public static void main(String[] ar) {
		int[] array1 = new int[100];
		
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;   //배열 생성 방법 첫번째
		
		int[] array2 = new int[] {10, 20, 30, 40};  // 배열 생성 방법 두번째
		
		int[] array3 = {10, 20, 30, 40}; // 배열 생성 방법 세번쨰
		
		System.out.println(array3[2]);
		System.out.println(array2[1]);
		
		int value = array3[3];  // 배열에 있는 값을 하나만 꺼내서 사용 시 변수 생성.
		
		System.out.println(value);
	}
}
