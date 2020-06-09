package kr.co.mine_k.round10;

public class PackageRestrictTest {
	public static void main(String[] ar) {
		PackageRestrict pr = new PackageRestrict();
		
		System.out.println(pr.name);
		
		// package는 protected와 달리 상속 받은 클래스의 멤버에 접글할 수 없다.
		// 그 외는 protected와 동일.
	}
}
