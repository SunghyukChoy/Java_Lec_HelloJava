import java.util.Scanner;

public class ArrayTest4 {
	public static void main(String[] ar) {
		
		Scanner in = new Scanner(System.in);
		int[][] data = new int[3][]; // data[0] --> ?, data[1] --> ?, data[2] --> ?
		
		for(int i = 0; i < 3; i++) {
			System.out.println("data의 " + i + "번째 공간은 몇개를 반드시겠습니까?");
			int x = in.nextInt();
			data[i] = new int[x]; 
			// data[i]번째에는 몇개의 배열을 만들겠냐고 묻는 것. 3을 입력 받으면 data[i][3]을 만들겠다는 뜻.
			/* int[][] data = new int[3][]는 				
			data[0][x], data[1][x], data[2][x]  --> 동적으로 하위 공간을 만들기 위해 사용 하는 선언방식이다.	*/
		}
		System.out.println();
		
		for(int i =0; i < 3; i++) {
			System.out.println("data[" + i + "]번째의 공간 개수 = " + data[i].length);
		
		}
		// byte[][] x = new byte[3][2];
		   /* x라는 것은 어딘가를 참조하는 주소의 시작점이고 x가 참조하는 주소는 new byte[]까지 참조하고
		      다차원 배열이고 뒤로 갈수록 실제 공간은 마지막에 있는 []이 우리가 선언한 데이터 공간. 나머지는 참조형, 4byte로 
		      어딘가의 주소를 참조하는 형태. */
	}
}
