class IntString {
	Integer key;
	String value;
	
	public IntString(Integer key, String value) {
		this.key = key;
		this.value = value;
	}
	public void display() {
		System.out.println(key + " : " + value);
	}
}
class IntDouble {
	Integer key;
	Double value;
	
	public IntDouble(Integer key, Double value) {
		this.key = key;
		this.value = value;
	}
	public void display() {
		System.out.println(key + " : " + value);
	}
}	// 위의 IntString 클래스와 IntDouble 클래스는 제네릭을 사용하지 않았을 떄의 코드.
	// 유사한 클래스여도 내부의 자료형이 다르기 때문에 또다른 클래스를 만들 수밖에 없음. 중복되는 코드.
public class GenericTest4 {
	public static void main(String[] ar) {
		IntString is = new IntString(10, "은하");
		IntDouble id = new IntDouble(20, 1.23);
		
		is.display();
		id.display();
	}
}
