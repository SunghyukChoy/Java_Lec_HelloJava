import java.util.Scanner;
public class Grade {
	public static void main(String[] ar) {
		int score = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요 = ");
		score = in.nextInt();
		
		grade(score);
		
		System.out.printf("%d점 -> %s", score, grade(score));
		}
	public static String grade(int score) {
		String result = "";
		if (score >= 95) 
			result = "A+";
		else if (score >= 90)
			result = "A";
		else if (score >= 80)
			result = "B";
		else if (score >= 70)
			result = "C";
		else if (score >= 60)
			result = "D";
		else 
			result = "F";
		
		return result;
			
	}
}
