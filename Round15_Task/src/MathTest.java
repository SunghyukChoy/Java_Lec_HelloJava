public class MathTest {
	public static void main(String[] ar) {
		System.out.println("e = " + Math.E);
		System.out.println("pi = " + Math.PI);
		System.out.println("절댓값(-75.12) = " + Math.abs(-75.12));
		System.out.println("버림(12.98) = " + Math.floor(12.98));
		System.out.println("반올림(12.5) = " + Math.round(12.5));
		System.out.println("올림(12.01) = " + Math.ceil(12.01));
		System.out.println("최댓값(50, 30) = " + Math.max(50, 30));
		System.out.println("최솟값(50, 30) = " + Math.min(50, 30));
		System.out.println("4의 2제곱 = " + Math.pow(4, 2));
		System.out.println("4의 제곱근 = " + Math.sqrt(4));
		System.out.println("0 ~ 1 사이의 난수 = " + Math.random());
		System.out.println("정수 1 ~ 10 사이의 난수 = " + ((int)(Math.random() * 10) + 1));
		System.out.println("각도 180도의 라디안 = " + Math.toRadians(180));
		System.out.println("2파이 라디안의 각도 = " + Math.toDegrees((2*Math.PI)));
	}	
}