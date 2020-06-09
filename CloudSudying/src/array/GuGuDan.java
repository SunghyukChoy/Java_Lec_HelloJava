package array;

public class GuGuDan {
	public static void main(String[] ar) {
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("\t%d x %d = %d\n", i, j, i * j); // \t는 들여쓰기 \n는 개행.
			}
			System.out.println("--------------------------");
		}
	}
}
 	
