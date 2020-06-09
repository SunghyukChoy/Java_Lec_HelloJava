
public class GradeTest {
	public static void main(String[] ar) {
//		Grade st1 = new Grade();
//		st1.name = "최성혁";
//		st1.kor = 100;
//		st1.eng = 90;
//		st1.total = st1.kor + st1.eng;
//		
//		System.out.println("총점 = " + st1.total);
		
		// 위의 경우와 같이 변수값을 직접 컨트롤 할 수 있게 되면 잘못된 값이 들어갈 수 있음.

		Grade st1 = new Grade("최성혁");
		// 생성자 메소드를 통해 값을 입력하여 사용.
		st1.setKor(100);
		st1.setEng(90);
		st1.calc();
		// 생성한 setKor,setEng 메소드를 통해 값을 입력하여 사용.
		
		System.out.println("총점 = " + st1.getTotal());
		// 생성한 getTotal 메소드를 통해 값을 입력하여 사용.
		System.out.println(st1);
		// 객체명만 입력하여도 자동으로 .toString이 붙은 것과 같아 toString 메소드가 실행됨.
		// toString 메소드를 생성하지 않으면 객체의 해쉬코드 값이 출력됨.
	}
}
