/*
 *for문은 정해진 수치만큼 반복시킬 때 사용. while은 반복횟수를 잘 모를 때(주로 무한으로 반복 시킬 때) 사용.
 */
public class WhileTest {
	public static void mian(String[] ar) {
		int x = 1; //for문과 달리 초기화 구문 없어.
		while(x <= 5) {
			System.out.println("*");
			++x;
			
		}
		System.out.println("끝");
	}
}
