package array;

public class DailyUser {
	public static void main(String[] ar) {
//		int[] visitors = new int[7];
//		visitors = new int[] {100, 200, 300, 400, 500, 600, 700};

		int[] visitors2 = { 100, 200, 300, 400, 500, 600, 700 };

		int[] visitors = new int[] { 184, 201, 1870, 164, 170, 191, 205 };

//		int result = 0;
//		for (int i = 0; i < visitors.length; i++) {
//			
//			result += visitors[i];
//			result = result / visitors.length;
//		} 

		int avaerageVisitor = average(visitors);

		int averageVisitor2 = average(visitors2);

		System.out.printf("하루 평균 접속자 수 : %d명, %d명", avaerageVisitor, averageVisitor2);
	}

	public static int average(int[] arr) { // int[] arr = visitors
		int result = 0; // 결과값 변수 생성은 for 문 밖에서
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result / arr.length; // 리턴 값은 메서드 대괄호 안에 위치
									// visitors.length가 아닌 arr.length
	}
}