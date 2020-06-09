package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-789012", "계백");
		
		
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
//		p1.nation = "usa";				//final 필드는 값 수정 불가.
//		p1.ssn = "789456-123456";		//final 필드는 값 수정 불가.
		p1.name = "을지문덕";				//일반 필드
	}

}
