
import java.util.Scanner;

public class MySubject {

	Scanner in = new Scanner(System.in);

	String[] subjectName = { "국어", "영어", "수학" };
	int[] subject = new int[subjectName.length + 1]; // 4
	float avg = 0.0f;

	public void input() {

		for (int i = 0; i < subjectName.length; i++) {
			System.out.println(subjectName[i] + " = ");
			subject[i] = in.nextInt();
			if (subject[i] < 0 || subject[i] > 100) {
				System.out.println(subjectName[i] + "점수를 잘못 입력");
				subject[i] = 0;
				break;
			}
			subject[i] = this.subject[i];
			subject[subject.length - 1] += subject[i];
					// 3, subject 배열의 마지막 공간

		}
		in.close();
	}

	public void calc() {
		avg = subject[subject.length - 1] / (float) subjectName.length;

	}

	public void output() {

		System.out.println("총합 : " + subject[subject.length - 1] + "점");
		System.out.println("평균 : " + avg);

	}
//	public static void main(String[] ar) {
//		MySubject m = new MySubject();
//		
//		m.input();
//		m.calc();
//		m.output();

//	}
}
