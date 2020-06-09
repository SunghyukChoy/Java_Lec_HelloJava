/*메로리 상의 구조 call by value
 *  힙 영역에 클래스 Data에 대한 인스턴스가 있다
 *  스택 영역에 main 메소드의 공간이 있고 레버런스형 변수 d가 있다.
 *  d는 이 인스턴스를 가리키고 있고 이 인스턴스에는 x = 10이라는 정보가 있다.
 *  스택 영역에 main 메소드와는 다른 change 메소드의 공간이 있다.
 *  change 메소드의 매개변수로 main 메소드의 d.x의 *값(10)을 복사하여* 던져준다.
 *  따라서 힙 형역의 인스턴스에는 x의 값(10)에는 영향을 주지 않는다.
 *  change 메소드의 수행이 끝나면( {}괄호가 닫히는 순간 ) 스택 영역에 change 메소드의 공간은 사라진다.
 *  change 메소드의 수행이 끝나더라도 d.x의 값(10)은 변하지 않으므로 
 *  main 메소드의 d.x의 값은 10이 된다. 
 * */


package CallByReference;


// call by value.
public class PrimitiveParamEx {
	public static void main(String[] ar) {
		Data d = new Data();
		d.x = 10;
		
		System.out.println("main() x : = " + d.x);
		change(d.x);
			// "몇시니?"라고 묻는 형태
			// change(d.x); 와 PrimitiveParamEx.change(d.x); 는 같은 코드
			// 같은 클래스 내에서 생략 가능.	
			// 매개변수에 d.x의 값인 10을 던졌지만 change 메소드에서 x = 1000으로 다시 초기화
			// 따라서 change() x의 값은 1000.
		System.out.println("change(d.x)메소드 호출 후");
		System.out.println("main() x : = " + d.x);
	}	
	public static void change(int x) {
			// main 메소드에서 호출하기 위해 static 선언.
		x = 1000;
		System.out.println("change() x : " + 1000);
	} // 이 메소드의 대괄호가 닫히면 x = 1000이라는 값은 사라짐.
}
