package kr.co.mine_k.round10;

import kr.co.mine_k.other.ProtectedRestrict_02;

public class ProtectedRestrictTest_02_01 extends ProtectedRestrict_02 {
	// ProtectedRestrict_02 클래스 상속 받음.					
	
	public static void main(String[] ar) {
		
		ProtectedRestrictTest_02_01 pr = new ProtectedRestrictTest_02_01();
		// 상속 받음으로써 ProtectedRestrict_02 클래스의 분신이 됨.
		// 따라서 ProtectedRestrictTest_02_01 클래스에 대해 객체를 생성함..
		// 뭔 소리야..
		
		System.out.println(pr.name);
		
		// 상속 받았다 하더라도 private 으로 선언된 변수에는 접근 불가능.
	}
}
