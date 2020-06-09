package test.bbc;

public class RestrictTest2 {
	
	public void test() {
		// First f = new First();
			// RestrictTest 파일의 클래스이지만 접근제한자가 private이므로 가져올 수 없음.
		RestrictTest rt = new RestrictTest();
		// rt.First f = new rt.First();
			// RestrictTest 객체를 선언하여도 가져올 수 없음.
		// System.out.println(rt.x);
			// RestrictTest 파일에서 private으로 선언되었기 때문에 가져올 수 없음.
		
		System.out.println("y = " + rt.y);
			// RestrictTest 파일에서 protected으로 선언되었기 때문에 가져올 수 있음.
			// protected는 같은 폴더(패키지) 안에 있으면 사용할 수 있음.
		System.out.println("z = " + rt.z);
			// package로 선언된 변수이므로 같은 package 안에서 불러올 수 있음.
	}
	public static void main(String[] ar) {
		RestrictTest rt = new RestrictTest();
		System.out.println("y = " + rt.y);
		System.out.println("z = " + rt.z);
		System.out.println();
		rt.display(); // RestrictTest 파일에서 protected로 선언된 display 메소드.
		System.out.println();
		rt.test();
	}
}
