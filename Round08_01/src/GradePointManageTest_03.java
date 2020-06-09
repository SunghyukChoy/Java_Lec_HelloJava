import java.util.Scanner;

public class GradePointManageTest_03 {
	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);
		
		String[] subjectNmae = {"국어", "영어", "수학"};
		int[] subject = new int[subjectNmae.length + 1]; //4
		float avg = 0.0f;
		
		for (int n = 0; n < subjectNmae.length; n++) {
			do {
				
			System.out.println(subjectNmae[n] + "점수 = ");
			subject[n] = in.nextInt();
			} while (subject[n] < 0 || subject[n] > 100);
			subject[subject.length - 1] += subject[n];
		}
		
			avg = subject[subject.length - 1] / (float)subjectNmae.length;
				//subjfect.length-1는 총합의 위치
		System.out.println();
		System.out.println("총점 : " + subject[subject.length - 1] + "점");
		System.out.printf("평균 : %.2f", avg);
	}
}
