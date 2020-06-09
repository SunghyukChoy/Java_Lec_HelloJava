import java.util.Random;

public class MathTest {
	public static void main(String[] ar) {
		System.out.println("Pi = " + Math.PI);	// 파이 값 
		System.out.println("Max = " + Math.max(10, 20));	//10과 20중 더 큰 것
		System.out.println("round = " + Math.round(12.745)); // 반올림 값
		System.out.println("round = " + Math.floor(12.745));	// 소수점 이하 버림.
		
		int x = (int)(Math.random() * 10);	// 0에서 9까지 난수 생성.
				// Math.random() : 0.0에서 0.9까지 난수 생성.
		int y = (int)(Math.random()*10 + 1);	// 1에서 10까지 난수 생성.
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);		
		// Math.random() 은 비교적 고르지 못한 난수 생성함.
		
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());	// 난수 발생의 기준값 부여.여기서는 시간값 부여.
		for (int i = 0; i < 5; i++) {
			int z = random.nextInt(10); 
			// nextInt 호출시에 파라미터를 넣어주지 않으면 int의 전체범위에서 랜덤값을 추출한다.
			//(int 전체 범위 : -2,147,483,648 ~2,147,483,647 )
			//nextInt() 에 숫자를 넣어주면, 0 ~ num-1 까지의 범위에서 랜덤값을 추출한다.
			//ex> nextInt(10) : 0~9
			System.out.println("z = " + z);			
		}
	}
}
