class GenMethod {
	public <K, V> boolean compare(K f_key, V f_value, K s_key, V s_value) {
		if(f_key.equals(s_key) && f_value.equals(s_value)) {
			return true;
		} return false;
	}
}
public class GenericMethodTest {
	public static void main(String[] ar) {
		GenMethod gm = new GenMethod();
		boolean check = gm.compare(1, "은비", 1, "은비");
		System.out.println("check = " + check );
	}
}
