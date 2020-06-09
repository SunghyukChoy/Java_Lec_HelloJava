package array;

public class Grade {
	public static void main(String[] ar) {
		double[] score = {4.0, 3.8, 4.1, 3.4};
		
		score[1] = 5.0; // 직접 값을 입력해주면 변경 가능
		score[2] = score[1] + 2.2;
		
		System.out.printf("a학생 학점 : %.1f\n", score[0]);
		System.out.printf("b학생 학점 : %.1f\n", score[1]);
		System.out.printf("c학생 학점 : %.1f\n", score[2]);
		System.out.printf("d학생 학점 : %.1f\n", score[3]);
		
	}
}



/*
 * public static void main(String[] ar) { 
 * 		double[] grade = {3.0, 2.5, 4.0, 1.8};
 * 
 * System.out.printf("1학녁 학점 = %.1f\n", grade[0]);
 * System.out.printf("2학녁 학점 = %.1f\n", grade[1]);
 * System.out.printf("3학녁 학점 = %.1f\n", grade[2]);
 * System.out.printf("4학녁 학점 = %.1f\n", grade[3]);
 * 
 * }
 */