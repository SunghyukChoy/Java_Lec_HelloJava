import java.util.Scanner;

public class GradePointManageTest_04 {
	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);

		String[] subjectName = { "국어", "영어", "수학" };
		//int[] subject = new int[subjectName.length + 1]; // 4
		int[] subject = new int[subjectName.length];
		int total = 0;
		float avg = 0.0f;

		for (int n = 0; n < subjectName.length; n++) {
			do {
				System.out.println(subjectName[n] + "점수 = ");
				subject[n] = in.nextInt();
			} while (subject[n] < 0 || subject[n] > 100);
			//subject[subject.length - 1] += subject[n];
			total += subject[n];
		}

		//avg = subject[subject.length - 1] / (float) subjectName.length;
		avg = total / (float) subjectName.length;
		// subject.length-1는 총합의 위치
		System.out.println();
		//System.out.println("총점 : " + subject[subject.length - 1] + "점");
		System.out.println("총점 : " + total + "점");
		System.out.printf("평균 : %.2f", avg);
	}
}
