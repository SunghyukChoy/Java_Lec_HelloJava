public class Problem_0005 {
	public static void main(String[] ar) {
		for(int i = 2; i < 10; i++) {
			System.out.println("==================");
			System.out.println(i + "단");
			for(int j = 1; j < 10; j++) {
			System.out.printf("\t%d x %d = %d\n", i, j, i*j);
			}
		}
	}
}
