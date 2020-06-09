
public class CastingTest {
	public static void main(String[] ar) {
		byte data1 = 120;
		short data2 = data1;
		//byte의 입출력 범위가 short의 입출력 범위보다 작다
		// byte 자료형의 변수가 short 범위 내에 포함되므로 변환 작업이 필요 없다
		// 이러한 형 변화를 promotion이라 한다
		
		byte data3 = 100;
		
		//char data4 = data3;
		// 실제 컴파일러는 100을 보는 것이 아니라 형이 무엇으로 선언되었느냐, 결론적으로 변수가 어떠한 값을 가질수 있느냐를 보는 것.
		// data3의 값이 100이었다가 -100이 될 수도 있으므로 char는 data3의 값을 담을 수 없다 
		// 이러한 경우 강제 형변환 (casting)을 해준다.
		// 캐스팅 방법은 입력하고자 하는 데이터 앞에 담고자 하는 자료형을 넣는다 
		byte data5 = -1;
		// 0111 1111 = 127
		// 1000 0000 = -128
		// ....
		// 1111 1111 = -1 
		
		// 0000 0000 1111 1111 = 65535 
		char data4 = (char)data5;
		
		System.out.println(data5);
		System.out.println(data4 + 0); // + 0을 한 이유는 data4를 숫자로 출력하겠다. char는 문자 위주로 우선 출력하는데 문자로 출력되는 속성을 막기 위해.
									 // 덧셈 연산을 사용하면 자동으로 int로 변환. 자바는 4byte 시스템인 int가 기본값.
	

	}
}


 

