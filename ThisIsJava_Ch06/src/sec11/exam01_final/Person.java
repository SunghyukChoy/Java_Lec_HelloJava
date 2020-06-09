package sec11.exam01_final;

public class Person {
	final String nation = "Korea";
		//final 필드를 초기화 하는 두 가지 방법 중 하나
		//선언 시 바로 초기화
	final String ssn;
	String name;
	
	Person(String ssn, String name) {
		this.ssn = ssn;
		//final 필드를 초기화 하는 두 가지 방법 중 하나
		//생성자를 통한  초기화
		this.name = name;
		
//		this.nation = "Japan";
			// 이시 선언 시 초기화 하였으므로 생성자라 하더라도 수정 불가능.
	}
}
