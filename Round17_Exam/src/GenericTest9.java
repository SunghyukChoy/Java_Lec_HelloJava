 
class MyTpye<T> {
	T data;
	public MyTpye(T data) {
		this.data = data;
	}
	public void display() {
		System.out.println("data = " + data);
	}
}
public class GenericTest9 {
	public static void view1(MyTpye<? extends Number> mt) {	//Number를 상속받는 모든 것.
											//와일드카드('?')를 썼을 땐 & Serializable 쓸 수 없다.
											// 클래스나 인터페이스 하나만 쓸 수 있다.			
		mt.display();
	}
	public static void view2(MyTpye<? super Number> mt) {	//Number보다 큰 모든 것.
		mt.display();
	}
	public static void view3(MyTpye<?> mt) {	//무엇이든
		mt.display();
	}
	public static void main(String[] ar) {
		MyTpye<Integer> aa = new MyTpye(100);
		MyTpye<Number> bb = new MyTpye(12.34);
		MyTpye<String> cc = new MyTpye("예린");
		
		view1(aa);
		view1(bb);
//		view1(cc);	// String은 Number를 상속받지 않음.
		
// 		view2(aa);	// Integer < Number. Integer는 Number보다 작은 계열
		view2(bb);
//		view2(cc);	
		
		view3(aa);
		view3(bb);
		view3(cc);
	}
}
