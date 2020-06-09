package sec08.exam01_method_declaraion;

public class Calculator1Example {

	public static void main(String[] args) {
		Calculator1 myCalc = new Calculator1();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 = " + result1);
		
		byte x = 10;
		byte y = 4;		
		double result2 = myCalc.divide(x, y);
		// byte 자료형의 매개변수 값을 전달해주어도 받는 쪽에서 int로 자동형변환 되어 전달된다.
		// 리턴값의 자료형이 double이믐로 double형 변수로 받아준다.
		System.out.println("result2 = " + result2);
		
		myCalc.powerOff();

	}

}
