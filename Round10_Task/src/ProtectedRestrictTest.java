class ProtectedRestrict {
	protected String name = "최성혁";
	
}


public class ProtectedRestrictTest {
	public static void main(String[] ar) {
		ProtectedRestrict pr = new ProtectedRestrict();
		
		System.out.println(pr.name);
		
		// protected는 하나의 파일 내에서는 접근 가능.
	}
}
