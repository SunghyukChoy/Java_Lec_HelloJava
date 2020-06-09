class toStringOverride {
	public String toString() {
		return "재정의 된 toString() 메서드";	
	}
}
public class toStringOverrideTest {
	public static void main(String[] ar) {
		toStringOverride to = new toStringOverride();
		System.out.println("객체 출력 = " + to);
	}
}
