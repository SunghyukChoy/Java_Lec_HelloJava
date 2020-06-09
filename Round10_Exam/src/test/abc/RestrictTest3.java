package test.abc;

import test.bbc.RestrictTest;
// test.bbc라는 패키지를 만들어서 RestrictTest 파일을 import 시켜줌
public class RestrictTest3 {
	public void test() {
		 RestrictTest rt = new RestrictTest();
		// System.out.println("x = " + rt.y);
			// 다른 폴더(패키지)에 protected로 선언되었기 때문에 가져올 수 없음.
			// 하지만 상속관계에서는 가져올 수 있음.
		
	}
}
