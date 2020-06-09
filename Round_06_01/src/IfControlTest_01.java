import java.util.Scanner;

/************* 제일중요 꼭중요 이거모르면 개발못함 ****************/
public class IfControlTest_01 {
	public static void main(String[] ar) {
		//Scanner in = new Scanner(System.in);	// 쓸데없이 입력은 왜받고 ㅈㄹ

		int firstsu = 16, secondsu = 17;

		//System.out.print("첫번째 수 = ");
		//firstsu = in.nextInt();

		//System.out.print("두번째 수 = ");
		//secondsu = in.nextInt();

		
		/******* 예제의 핵심부분 *******/
		if (firstsu > secondsu) {
			System.out.printf("첫번째 수(%d)가 두번째 수(%d)보다 큰 수 입니다", firstsu, secondsu);
		} else {
			System.out.printf("첫번째 수(%d) 보다 두번째 수(%d)보다 작은 수 입니다.", firstsu, secondsu);
		}
		
		
		System.out.println();
		System.out.println("---------- 심화 ----------");
		
		// 심화
		String text = firstsu > secondsu ? "큰 수" : "작은 수";
		System.out.printf("첫번째 수(%d) 보다 두번째 수(%d)보다 %s 입니다.", firstsu, secondsu, text);

		//in.close();
	}
}
