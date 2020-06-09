package kr.co.mine_k.round10;

public class ProtectedRestrictTest_01 {
	public static void main(String[] ar) {
		ProtectedRestrict_01 pr = new ProtectedRestrict_01();
		
		System.out.println(pr.name);
		// 동일한 패키지 내의 타 클래스 변수 호출 가능.
	}
}
