
public class ContinueTest {
	public static void main(String[] ar) {
		for (int i = 1; i <= 10; ++i) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("end");
	}
	
}