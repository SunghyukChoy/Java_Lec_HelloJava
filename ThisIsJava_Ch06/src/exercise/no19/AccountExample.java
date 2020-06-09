package exercise.no19;

import java.text.DecimalFormat;

public class AccountExample {

	public static void main(String[] args) {
		Account acc = new Account();
		DecimalFormat formatter = new DecimalFormat("###,###,###.##");
			//DecimalFormat 클래스. 생성자에서 끊어줄 자릿수 설정 가능.
			//생성자 매개변수에 끊어줄 자릿수와 , 찍어줌. 소수점 아래 자릿수까지 설정 가능(# 갯수만큼. 끝자리 반올림.
			//매개변수에 값 미입력 시 세자리씩 끊어 , 표시해줌.
		acc.setBalance(10000);
		System.out.println("현재 잔고 : " + formatter.format(acc.getBalance()) + " 원");			
		
		acc.setBalance(-100);
		System.out.println("현재 잔고 : " + formatter.format(acc.getBalance()) + " 원");
		
		acc.setBalance(2000000);
		System.out.println("현재 잔고 : " + formatter.format(acc.getBalance()) + " 원");
		
		acc.setBalance(500000);
		System.out.println("현재 잔고 : " + formatter.format(acc.getBalance()) + " 원");
		
		System.out.println(formatter.format(12345678.456789));
		//DecimalFormat 클래스의 format() 메소드.
		//매개변수 값을 생성자에서 지정한 자릿수대로 끊어 , 찍어줌.

	}

}
