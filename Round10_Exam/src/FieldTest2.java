
public class FieldTest2 {
	public void ccc() {
		FieldTest ft = new FieldTest();
		System.out.println(ft.x);
		System.out.println(ft.y);
		// protected, package로 선언된 변수 x, y. 사용 가능
		// 값이 대입되어 있든(x), 값이 대입되어 있지 않든(y) 사용 가능.
		// 객체 생성 시 new 로 할당하면 heap 영역에 할당. 
		// heap 메모리 공간에는 모든 값이 자동으로 초기화 되어 있다.
		// int는 0, char는 null.....
		
		
		ft.aaa();
		ft.bbb();
		
		// ft.ccc();
			// private으로 선언된 메소드 ccc 호줄 불가능.
	}
}
