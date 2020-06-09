package bbc; //적는다면 반드시 한 개만 적으며 생략된다면 디폴트 패키지, 내용별로 분류하기 위해 사용함.

import java.sql.Date;

class A {
	
	
}
class B {
	
}
// public class B 안됨. 퍼블릭 클래스는 반드시 파일 이름과 같아야 한다.
public class HelloJava2 {
	public static void main(String[] ar) {
		System.out.println("Pi = " + Math.PI);
	//	System.out.println("Time = " + new Date());
	}


// java.lang 에 들어있는 모든 클래스(api)들은 임포트를 안 해도 자동으로 해줌 
// Math.String,System 등은 lang에 속한 클래스
// 자바측에서 만든 클래스나 타인이 만든 클래스는 임포트 하여 사용함.
// 하나의 자바 파일 안에는 여러개의 클래스를 쓸 수 있으나 퍼블릭은 하나만 씀.
// 모든 대문자로 시작하는 대문자는 클래스이므로 임포트 대상
// 임포트를 어떻게 지정해야 할지 (Lang,util 등등) 모를 때는  ctrl shift o 누르면 자동 임포트 생성됨.
// public static void main 은 예약된 메소드. 실행의 주체가 되는 main 메소드. 자바에서 프로그램 시작 시 무조건 이것부터 시작해라고 예약되어 있음
// (Stirng[] ar) 은 매개변수 [] 은 배열 표시 
// {} 은 실행하는 내용부.System.out.println 은 System 클래스에 있는 out 객체를 통해서 출력해라.
// 자바 프로그램의 명명규칙
// 1. 클래스와 메서트,필드이름의 첫 글자는 $,_,영문 대소문자(한글 가능) 숫자는 안 됨.
// 2. 글자 수 제한 없음. 하지만 너무 길게 쓰면 문제가 될 수 있음
// 3. 공백 문자, 특수 문자,자바의 에약어 불가능.
// 자바의 예약어 = 보라색으로 표시되는 글자들 

		int $ = 2;
		int _aa = 20;
		int DDD = 29;
		int aa = 20;
		int 국어 = 100;	
//		int int = 20;
//		int public = 20;
//		int this = 30;
		
// 자바 api에 적용되는 명명규칙
// 1. 클래스 이름에서 첫글자는 $,_,영문 대문자를 주로 사용(소문자도 사용 가능(우리가 만드는 것들,허나 대문자가 권고사항))
// 2. 메서드 이름에서 첫글자는 $,_,영문 소문자를 주로 사용
// 3. 필드와 변수의 이름에서 대체로 final 예약어를 사용하는 필드는 전체를 대문자로 사용하고 나머지 경우는 전체를 소문자로 사용.

		int aaa = 10;
		final int BBB = 20;
		
// 4. 이름이 합성어인 경우에는 카멜표기법으로 합성되는 첫 글자를 주로 대문자로 사용
		int helloJava = 30;
		// 합성어의 첫글자인 J는 대문자로 표기하였다 
		
}