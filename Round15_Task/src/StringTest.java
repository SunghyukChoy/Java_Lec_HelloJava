public class StringTest {
	public static void main(String[] ar) {
		String str = new String(" Hello! How are you? ");
		System.out.println("문자열 길이 = " + str.length());
		System.out.println("첫번째 'o' 문자는 몇 번째 위치 = " + str.indexOf("o"));
		System.out.println("마지막 'o' 문자는 몇 번쨰 위치 = " + str.lastIndexOf("o"));
		System.out.println("3 ~ 7번째 위치의 문자열 = " + str.substring(3,7));
		System.out.println("12번째 위치의 문자 = " + str.charAt(12));
		System.out.println("시작하는 문자열이 ' He'이니? = " + str.startsWith(" He"));
		System.out.println("끝나는 문자열이 '?!'이니? = " + str.endsWith("?!"));
		System.out.println("문자열 뒤에 'ok?!'를 추가하면? = " + str.concat("ok?!"));
		System.out.println("앞 뒤 공백을 제거하고 출력하면 = [" + str.trim() + "]");
		System.out.println("' Hello! '와 비교하면 몇 글자나 더 크니? " + str.compareTo(" Hello! "));
		byte[] data = str.getBytes();
		System.out.println("이 문자열을 byte 배열로 변경하면 ? " + data);
		System.out.println("문자열이 비어 있니? " + str.isEmpty());
		System.out.println("공백을 기준으로 문자열을 자르면 다음과 같다. ");
		String[] data2 = str.split(" ");
		for(int n = 0; n < data2.length; n++) {
			System.out.println(n + " --> " + data2[n]);
		}
		System.out.println("전체를 대문자로 바꾸면 = " + str.toUpperCase());
		System.out.println("전체를 소문자로 바꾸면 = " + str.toLowerCase());		
	}
}
