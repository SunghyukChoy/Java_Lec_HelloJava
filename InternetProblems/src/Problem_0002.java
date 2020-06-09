// break 사용 방법.
public class Problem_0002 {
	public static void main(String[] ar) {
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break; // 만난 지점부터 반복문을 빠져 나옴.
			}
//			if (i % 2 != 0) {
//				continue; // continue를 만나면 아래 블럭을 실행하지 않고 반복문으로 돌아감.
//			}
			total += i;			
		}
		System.out.println("1부터 4까지의 합은 = " + total);
	}
}
