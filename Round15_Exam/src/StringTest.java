
public class StringTest {
	private static CharSequence f;

	public static void main(String[] ar) {
		String a = "abc";
		String b = "abc";
		// 이렇게 선언하는 방식은 Constant 영역에 메모리 할당. 동일한 문자열이 있으면
		// b라는 객체는 새로운 공간을 할당하는 것이 아니라 같은 주소값을 갖게 됨.
		// a가 다른 값을 갖게 된다면 a,b 각각 메모리 할당.
		
		System.out.println(a==b);	//메모리의 주소 비교 // a와 b는 같습니까? -> true
		System.out.println(a.equals(b)); // 내용을 비교  // a와 b는 같습니까? -> true
		
		String c = new String("abc");
		String d = new String("abc");
		//new을 사용하여 객체 생성 시 항상 힙 영역에 메모리 할당.
		// 따라서 c와 d는 다른 주소값을 갖게 됨.
		
		System.out.println(c==d);	// c와 d는 같습니까? -> false
		System.out.println(a.equals(b)); // 내용을 비교  // c와 d는 같습니까? -> true

		a.replace('a', 'z');	  // 문자 'a'를 'z'로 바꿔라.
		System.out.println(a);	  // 출력결과 'abc'
		a = a.replace('a', 'z');  // 문자 'a'를 'z'로 바꿔라. 그 후 a에 대입해라.
		System.out.println(a);	  // 출력결과 'zbc'
		// String 클래스는 문자열을 관리하는 클래스이지, 그 자체를 조작하지 못함.
		// 어떠한 작업 후에는 그 값을 다시 대입해야줘 함.
		
	}
}
