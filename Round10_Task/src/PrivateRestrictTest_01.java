class PrivateRestrict {
	private String name = "최성혁";
}

public class PrivateRestrictTest_01 {

	public static void main(String[] ar) {
		PrivateRestrict pr = new PrivateRestrict();

		// System.out.println(pr.name);
			// 타 클래스에 private으로 선언된 변수 호출 못 함.
	}
}
