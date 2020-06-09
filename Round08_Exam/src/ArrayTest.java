import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);
//		int kor = 0, eng = 0, math = 0;
//	
		int[] subjectScore = new int[3]; // 0 = kor, 1 = eng, 2 = math
		String[] subjectName = new String[] {"국어", "영어", "수학"};
//		subjectName[0] = "국어";
//		subjectName[1] = "영어";
//		subjectName[2] = "수학";
		
		for (int i = 0; i < subjectName.length; i++) {
			System.out.println(subjectName[i] + " = ");
			subjectScore[i] = in.nextInt();
//			System.out.println(subjectName[i] + " = ");
//			subjectScore[i] = in.nextInt();
//			System.out.println(subjectName[i] + " = ");
//			subjectScore[i] = in.nextInt();
		}
		
	}
}
