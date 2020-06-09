import java.util.StringTokenizer;
public class StringTokenizerTest {
	public static void splitData(String source) {
		String[] data = source.split(",");
		for(int n = 0; n < data.length; n++) {
			System.out.println(n + " : " + data[n]);
		}
	}
	public static void StringTokenizerData(String source) {
		StringTokenizer data = new StringTokenizer(source, ",");
		int n = 0;
		while(data.hasMoreTokens()) {
			System.out.println((n + " : " + data.nextToken()));
			n++;
		}
	}
	public static void main(String[] ar) {
		String source = "A,B,C,,E,F";
		splitData(source);
		System.out.println();
		StringTokenizerData(source);
	}
}
