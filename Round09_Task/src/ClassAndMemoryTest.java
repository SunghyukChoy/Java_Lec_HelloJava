class MyType {
	int a;
	int b;
	float c;
}

public class ClassAndMemoryTest {
	public static void main(String[] ar) {
		MyType kor1 = null;
		kor1 = new MyType();
		
		kor1.a = 100;
		kor1.b = 200;
		kor1.c = 300.0f;
		
		System.out.println("a = " + kor1.a);
		System.out.println("b = " + kor1.b);
		System.out.println("c = " + kor1.c);
	}

}
