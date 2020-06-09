import java.util.Scanner;
public class GradePointManageTest_02 {
	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);
		
		String[] subjectNmae = {"국어", "영어", "수학"};
		int[] subject = new int[subjectNmae.length + 1]; //4
		float avg = 0.0f;
		
		do {
			System.out.println(subjectNmae[0] + "점수 = ");
			subject[0] = in.nextInt();
		} while (subject[0] < 0 || subject[0] > 100);
		
		do {
			System.out.println(subjectNmae[1] + "점수 = ");
			subject[1] = in.nextInt();
		} while (subject[1] < 0 || subject[1] > 100);
		
		do {
			System.out.println(subjectNmae[2] + "점수 = ");
			subject[2] = in.nextInt();
		} while (subject[2] < 0 || subject[2] > 100);
		
		subject[subject.length - 1] = subject[0] + subject[1] + subject[2];
		avg = subject[subject.length - 1] / (float)subjectNmae.length;
		
		System.out.println();
		System.out.println("총점 : " + subject[subject.length - 1] + "점");
		System.out.printf("평균 : %.2f", avg);
	}
}
