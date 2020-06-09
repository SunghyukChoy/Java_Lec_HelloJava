interface One {}
interface Two {}
class Three {}
class Four extends Three implements One, Two {}

class Five<T> {
	private T clazz;
	public Five(T clazz) {
		this.clazz = clazz;
	}
	public void display() {
		System.out.println(clazz);
	}
}

class Six {
	public static <T> void display(T src, Five<? super T> data) {
		data.display();
	}
}

public class GenericRestrictTest2 {
	public static void main(String[] ar) {
		Four obj = new Four();
		
		Six.display(obj, new Five<One>(new One() {}));
		Six.display(obj, new Five<Two>(new Two() {}));
		Six.display(obj, new Five<Three>(new Three() {}));
		Six.display(obj, new Five<Four>(new Four() {}));
	}
}
