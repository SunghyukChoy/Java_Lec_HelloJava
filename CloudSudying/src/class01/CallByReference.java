/* 
 * 기본형 변수 : 특정 값을 직접 지정
 * 레퍼런스 변수 : 객체의 주소를 저장
 * 워드 : cpu가 한 번에 읽을 수 있는 데이터의 크기. 기본형 변수와 레퍼런스 변수를 나누는 기준
 */
package class01;

public class CallByReference {
	public static void main(String[] ar) {
		// primitive 
		int money1 = 10000; //  money1이라는 변수에 10000 값 직접 입력.money1 : 10000
		System.out.print(money1 + " -> "); // 츨력결과 : 10000 ->
		zero(money1); // 아래에 zero 메소드가 2개 있는데 money1은 int 타입의 변수이므로 int 타입의 메소드가 수행됨.
		System.out.println(money1); //출력결과 : 10000
		
		// reference
		Money money2 = new Money(10000); // money2 -> {won : 10000}.money2가 {won : 10000}을 가리킴. 주소를 #2000이라고 했을 때.
										 //money2 != 10000. {won : 10000}이라는 주소를 갖고 있음.
		System.out.print(money2.getWon() + " -> "); // money2 변수 생성 시 매개변수에 10000을 전달해줌. 
													// 따라서 money2.getWon()의 결과값은 10000.
													// 출력결과 : 10000 ->
		zero(money2); // money2는 클래스 타입의 변수이므로 zero(Money m)메소드 수앻. 
					 // 여기까지 하면 zero(Money m)메소드 수행에 의해 {won : 10000} -> {won : 0}으로 변함.	
		System.out.println(money2.getWon()); // zero(money2)까지 수행 수 won : 0 으로 바뀜.
											// 따라서 출력결과 : 0
	}										// 위의 zero(money2) 메소드가 수행되지 않는다면 출력결과는 10000. 
	public static void zero(int d) { // int d = money1 : 값이 복사가 되어 전달.
		d = 0; // money1의 값인 10000이 대입되지만 다시 0으로 초기화. 따라서 d -> 0. 
			 // 여기서 d의 값이 0이 된 것이지 money1의 값이 0이 된 것이 아님. 
			// 값의 사본을 가져온 것이으모 money1의 값은 그대로 있고 d의 값만 변함.
	}
	public static void zero(Money m) { // Money m = money2의 주소가 복사. {won : 10000}의 주소값이 복사
										// money2 : #2000라는 주소값.
		m.won = 0;  // m(money2) : {won : 10000}의 won을 0으로 초기화. 
	}
}
class Money {
	int won;
	
	Money(int w) { // 17행에서 매개변수 전달. w : 10000
		won = w; // won에 w 값인 10000 대입.			
	}
	
	public int getWon() { // won을 리턴하는 메소드. 38행의 won 리턴
		return won;
	}
}

// 기본형 변수를 던져서 0으로 바꾼 것은 값이 변하지 않지만 
// 레퍼런스 변수로 던져서 0으로 바꾼 것은 앖이 변함

