interface First {}
interface Second {}
class Third {}
class Fourth implements First {}
class Fifth implements Second {}
class Sixth extends Third {}
class Seventh extends Third implements First, Second {}

class MyBox <T extends Third & First & Second> {}

class NumberBox <T extends Number> {
	private T number;
	public NumberBox(T number) {
		this.number = number;
	}
	public boolean compare(T otherNumber) {
		return number.equals(otherNumber);
	}
}

public class GenericRestrictTest {
	public static void main(String[] ar) {
	//	MyBox<Fourth> mbox_01 = new MyBox();		// 컴파일 오류
	//	MyBox<First> mbox_02 = new MyBox();			// 컴파일 오류		
	//	MyBox<Sixth> mbox_03 = new MyBox();			// 컴파일 오류
		MyBox<Seventh> mbox_04 = new MyBox();		// 컴파일 성공
		
		NumberBox<Integer> nbox = new NumberBox<>(100);
		System.out.println("check = " + nbox.compare(120));
				
	}
}
