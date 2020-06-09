package kr.co.mine_k.round10;

import kr.co.mine_k.other.ProtectedRestrict_02;

public class ProtectedRestrictTest_02 {	
	public static void main(String[] ar) {
		ProtectedRestrict_02 pr = new ProtectedRestrict_02();
		
		//System.out.println(pr.name);
			// import 하여도 protected로 선언된 변수 접근 불가능.
			// 동일한 파일과 동일한 패키지 내에서만 접근 가능
		
	}
}
