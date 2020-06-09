package sec04.exam01;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 媛泥댁 areaCircle() ?ㅽ");
		return Math.PI * r * r;
	}
}
