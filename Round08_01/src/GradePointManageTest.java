import java.util.Scanner;
public class GradePointManageTest {
	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);
		
		int kor = 0, eng = 0, math = 0, total = 0;
		float avg = 0.0f;
		
		do {
			System.out.println("국어  = ");
			kor = in.nextInt();
		} while (kor < 0 || kor > 100);
		
		do {
			System.out.println("영어  = ");
			eng = in.nextInt();
		} while (eng < 0 || eng > 100);
	
		do {
			System.out.println("수학  = ");
			math = in.nextInt();
		} while ( math < 0 || math > 100);
		
		total = kor + eng + math;
		avg = total / 3.0f;
		
		System.out.println();
		System.out.println("총점 : " + total + "점");
		System.out.printf("평균 : %.2f점", avg);
	}
}
