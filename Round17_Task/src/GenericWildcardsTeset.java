class MyType<T> {
	public T type;
	public MyType(T type) {
		this.type = type;
	}
	public void display() {
		System.out.println("type = " + type.toString()); 
	}
}
class GenWildcards {
	public static void upperMethod(MyType<? extends Number> src) {
		src.display();
	}
	public static void lowerMethod(MyType<? super Number> src) {
		src.display();
	}
	public static void unboundedMethod(MyType<?> src) {
		src.display();
	}
}
public class GenericWildcardsTeset {
	public static void main(String[] ar) {
		Integer x = new Integer(100);
		MyType<Integer> myType_01 = new MyType<>(x);
		
		Double y = new Double(200);
		MyType<Number> myType_02 = new MyType<>(y);
		
		StringBuilder z = new StringBuilder("Hello Generic");
		MyType<StringBuilder> myType_03 = new MyType<>(z);
		
		GenWildcards.upperMethod(myType_01);
		GenWildcards.upperMethod(myType_02);
		// GenWildcards.upperMethod(myType_03);		// 컴파일 오류
		
		// GenWildcards.lowerMethod(myType_01);		// 컴파일 오류
		GenWildcards.lowerMethod(myType_02);
		// GenWildcards.lowerMethod(myType_03);		// 컴파일 오류
		
		GenWildcards.unboundedMethod(myType_01);
		GenWildcards.unboundedMethod(myType_02);
		GenWildcards.unboundedMethod(myType_03);		
	}
}
