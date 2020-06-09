import java.util.Scanner;
public class ForControlTest_01 {
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
		
		int begin = 1, end = 100, total = 0;
//		int imsi = 0;  //시작 수가 마지막 수보다 클 경우 두 수를 교환하기 위해 필요
		
//		System.out.print("시작 수 = ");
//		begin = in.nextInt();
//		
//		System.out.print("마지막 수 = ");
//		end = in.nextInt();
		
//		if(begin > end) {
//			imsi = begin;
//			begin = end;
//			end = imsi;
//		}
		
		if (begin > end) {
			System.out.println("앞에 값이 더 작아야 됩니다. 다시 해주세요");
			return;
		}
		
		
		/* 현업에서 for문 쓰면 십중팔구 이런식 (배열 이용) */
		int[] scores = new int[3]; 	// 0 : 국어, 1 : 수학, 2 : 영어
		
		scores[0] = 100; //	국어점수
		scores[1] = 90; // 수학점수
		scores[2] = 94; // 영어점수
		
		for (int i = 0; i < scores.length; i++) {
			String subject = "";
			
			if (i == 0) {	// 국어
				subject = "국어";
			} else if (i == 1) { // 수학
				subject = "수학";
			} else if (i == 2){	// 영어 
				subject = "영어";
			}
			
			//System.out.println(subject + "점수 : " + scores[i]);
		}
		
		/************ 레알 현업용 for문 실전 : 이거만 알면 자바 끗 ***************/
		Student[] students = DummyDbContext.GetStudent();
		
		for (int i = 0; i < students.length; i++) {
			// 여기에 변수를 총합, 평균 변수를 생성하고, 값을 구한뒤에 출력하라
			int sum = students[i].korScore + students[i].mathScore + students[i].engScore;
			//int average = (students[i].korScore + students[i].mathScore + students[i].engScore)/3;
			int average = sum / 3;
			
			System.out.printf("이름 : %s, 국어 : %d, 수학 : %d, 영어 : %d, 총합 : %d, 평균 : %d", 
					students[i].name, 
					students[i].korScore, 
					students[i].mathScore, 
					students[i].engScore,
					sum,
					average);
			System.out.println();
		}
		
		for(int n = begin; n <= end; ++n) {
			total += n; // total = total + n;과 동일
		}
		
		System.out.println();
		System.out.println(begin + " ~ " + end + " 사이의 합은 " + total);
		
//		in.close();
		
	}
}
