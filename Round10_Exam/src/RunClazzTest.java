
public class RunClazzTest {
	public static void main(String[] ar) {
		ClazzTest ct = new ClazzTest();
		ClazzTest ct2 = new ClazzTest();
		
		ct.test(500);
//		ClazzTest의 test 메소드에 500의 값을 넣으면 test 메소드의 x는 가장 가까운 값을 
//		사용하므로 x = 500이 출력된다. 

		ct2.test(200);
		// ct1과 ct2 중 어떠한 변수를 통하여 test 메소드에 접근하였는가...는 이해 못함.
		
		System.out.println();

		ClazzTest2 ct3 = new ClazzTest2();
		ct3.test();
	
		
	}
}
