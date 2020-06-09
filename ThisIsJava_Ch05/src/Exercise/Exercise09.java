package Exercise;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] score = null;
		int max = 0;
		int total = 0;
		double avg = 0.0;

		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력  | 3. 점수리스트 | 4. 분석 | 5. 종료 ");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				System.out.println("학생 수를 입력하시오.");
				studentNum = sc.nextInt();

				System.out.println("학생 수 > " + studentNum);
				score = new int[studentNum];
			} else if (selectNo == 2) {

				for (int i = 0; i < score.length; ++i) {
					System.out.println((i + 1) + "번째 학생 점수를 입력하시오.");
					score[i] = sc.nextInt();
					System.out.println((i + 1) + "번째 학생의 점수 >" + score[i]);
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < score.length; ++i) {
					System.out.println((i + 1) + "번째 학생의 점수 >" + score[i]);
				}
			} else if (selectNo == 4) {
				for (int i = 0; i < score.length; ++i) {
					if (score[i] > max) {
						max = score[i];
					}
//					max = (max < score[i]) ? score[i] : max;	// 위의 if문과 같은 코드 삼항연산자.
					total += score[i];
					avg = (double) total / studentNum;
				}
				System.out.println("최고 점수 = " + max);
				System.out.println("평균 = " + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
