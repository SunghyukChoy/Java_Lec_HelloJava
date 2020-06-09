// 이해 안 됨.
public class StringBuilderTest {
	public static String appendData(String source, String[] data) {
		StringBuilder builder = new StringBuilder(source);
		for(String str : data) {
			builder.append(" : " + str);
		}
		return builder.toString();
	}
	public static String insertData(String source, int pos, String data) {
		StringBuilder builder = new StringBuilder(source);
		builder.insert(pos, data);
		return builder.toString();
	}	
	public static void main(String[] ar) {
		String source = "Hello";
		System.out.println("source = " + source);
		
		String[] data = new String[] {"Everyone!", "How are you?"};
		source = appendData(source, data);
		System.out.println("source = " + source);
		
		source = insertData(source, 6, "My name is Eunbi!");
		System.out.println("source = " + source);
	}
}
