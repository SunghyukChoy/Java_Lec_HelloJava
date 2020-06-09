/*체중관리를 시작한 Karl. 월요일 부터 금요일 까지 체중을 기록한 결과가 아래와 같다.

월: 78.4kg
화: 전날 대비 +0.4kg
수: 전날 대비 -0.6kg
목: 전날 대비 +0.1kg
금: 전날 대비 +0.8kg
월요일부터 금요일까지 평균 몸무게를 구하고 이를 출력 하시오.

숨은문제
printf("%.2f", avgWeight)의 의미를 구글링 하시오*/

public class Practice {
	public static void main(String[] ar) {
		float mon = 70.0f;
		float tue = mon + 0.2f;
		float wed = tue - 0.1f;
		float thu = wed + 0.8f;
		float fri = thu - 0.2f;
		float avg = (mon+tue+wed+thu+fri) / 5f;
		float goal = avg * 0.95f;
		
		System.out.printf("평균 몸무게 : %.2f kg, 목표 몸무게 : %.2f kg", avg, goal);
		
	}
}
	
