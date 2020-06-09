
public class ArrayTest3 {
	public static void main(String[] ar) {
		
		
		//2차원 배열 선언 및 초기화 방법
		char[][] a = {{'H', 'E', 'L', 'L', 'O'}, {'A','B','C', 'D'}, {'B', 'B', 'C'}};  // runtime stack 영역세 'a' 4byte 할당
					// 3행. 3개의 만들어짐
					// a[0] --> 5개 배열, a[1] --> 4개 배열, a[2] --> 3개 배열
		long[] b[];  //  runtime stack 영역세 'b' 4byte 할당
		int c[][];  // runtime stack 영역세 'c' 4byte 할당
		
		 System.out.println(a[0]);
		 System.out.println(a[1][1]);
		 System.out.println(a[0][4]);
		 
		 b = new long[3][2];
		 		 // 3행 2열
		 		// b[0] --> 2개,b[1] --> 2개,b[2] --> 2개 배열.
		 
		 b[0][1] = 100;
		 b[2][0] = 200;
		 
		 System.out.println(b[0][1]);
		 System.out.println(b[2][0]);
		 
		 c = new int[][] {{1,2,3}, {4,5,6},{7,8,9,10}};
		    			//c[0] --> 3개 c[1] --> 3개 c[2] --> 4개 배열
		 
		 System.out.println(c[2]); // {7,8,9,10}이 선언된 힙 영역의 주소를 출력.
		 							// 위의 char 자료형의 a 배열과는 다른데 a 같은 경우 자바 8버전부터 지원된 것.
		 System.out.println(c[2][3]); 
		 
		 System.out.println(c[2].length); //4개 {7,8,9,10} --> c
		 System.out.println(c.length);   // 3개 {{1,2,3}, {4,5,6},{7,8,9,10}}
		 
		 
	}
}
