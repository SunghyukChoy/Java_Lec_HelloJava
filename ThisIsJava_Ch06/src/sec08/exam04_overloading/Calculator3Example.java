package sec08.exam04_overloading;

public class Calculator3Example {

	public static void main(String[] args) {
		Calculator3 myCalc = new Calculator3();
		
		//정사각형의 넓이 구하기
		double result1 = myCalc.areaRectangle(10);
		
		//직사각형의 넓이 구하기
		double result2 = myCalc.areaRectangle(10, 20);
			//매개변수로 전달하는 값은 int형이지만 받는 쪽에서의 
			//타입이 double이므로 자동형변환 되어 들어간다.
		
		System.out.println("정사각형의 넓이 = " + result1);
		System.out.println("직사각형의 넓이 = " + result2);
		
	}

}
