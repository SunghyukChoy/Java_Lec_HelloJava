import java.util.Random;
public class RandomTest {
	public static void main(String[] ar) {
		Random rd = new Random();
		// rd.setSeed(1000);	// 시드를 고정해서 사용하면 동일한 난수 패턴 발생.
		rd.setSeed(System.currentTimeMillis());	
				// 중첩되지 않으면서 계속 변하는 현재시간 값을 시드로 사용
				// Random 클래스는 디폴트 생성자가 자동으로 현재이 시각을 시드로 사용하므로 굳이 기재 불필요.								
		for (int i = 0; i < 5; i++) {
			System.out.print(rd.nextInt(10) + "\t");
							//nextInt(n) : 0 ~ (n-1) 사이의 난수 발생.
		}
	}
}
