
public class PolymorphismTest_rev {
	public static void main(String[] ar) {
		Object[] obj = new Object[] { new Cat(), new Dog()};
			// Cat 클래스와 Dog 클래스 모두 Object 클래스의 하위 클래스
			// 클래스를 배열로 묶은 형태
		for(Object o: obj) {
			System.out.println(o.getClass() + " = " + o);			
		}
	}
}
