import java.util.ArrayList;
import java.util.List;
public class DebugTest {
	public static void main(String[] ar) {
		List<Integer> list = new ArrayList<Integer>();
		for(int n = 0; n < 5; n++) {
			int random = (int)(Math.random() * 10) + 1;
			list.add(new Integer(random));
			System.out.println(random);
		}		
	}
}
