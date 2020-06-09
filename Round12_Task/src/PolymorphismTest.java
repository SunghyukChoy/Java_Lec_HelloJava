class Cat {	// extends Object가 생략되어 있음.
	public String toString() {
		return "야용";
	}
}
class Dog {	// extends Object가 생략되어 있음.
	public String toString() {
		return "명멍";		
	}
}
public class PolymorphismTest {
	public static void main(String[] ar) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		System.out.println("Cat = " + cat);
		System.out.println("DOg = " + dog);
	}
}
