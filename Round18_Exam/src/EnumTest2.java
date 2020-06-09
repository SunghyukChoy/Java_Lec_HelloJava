enum MyData3 {	// 클래스와 비슷하게 쓰일 수 있으며 정적인 데이터를 관리하기 편하다.
	Sunday(0, "일요일") {	// 메서드 재정의.
		public String toString() {
			return "이 날은 일요일입니다.";
		}
	}, Monday(1, "월요일"), Tuesday(2, "화요일");
	 
	// 나는 Sunday가 몇번 째 날인지 알고 싶다면..
	private int position;
	private String kor;
	
	MyData3(int pos) {	// 생성자 메서드
		this.position = pos;			
	}
	MyData3(int pos, String kor) {
		this.position = pos;
		this.kor = kor;
	}
	int getPosition() {	// getter, setter 메서드
		return position;
	}
	String getKor() {
		return kor;
	}
	void display() {	// 일반 메서드
		System.out.println("이 날짜는 일주일 중 " + position + "번쨰의 요일이며, " + kor + "이라고 부릅니다.");
	}
}
public class EnumTest2 {
	public static void main(String[] ar) {
		System.out.println(MyData3.Sunday);
		
		MyData3 md = MyData3.Monday;
		System.out.println("position = " + md.getPosition());
		
		MyData3 md2 = MyData3.Tuesday;
		System.out.println("position = " + md2.getPosition() + ", 요일 = " + md2.getKor());
	
		md.display();
		md2.display();
		
		MyData3 md3 = MyData3.Sunday;
		System.out.println(md3.toString());
	}				
}
