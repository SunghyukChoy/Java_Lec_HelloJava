class AAA {
	int x;
	int y;
	//생성자를 직접 입력하지 않아도 없으면 클래스명과 같은 디폴드 생성자(매개변수 없음)를 있다고 가정한다. 
	AAA() {
		
	}
	AAA(int a) {
		x = a; //  AAA 클래스에 있는 멤버 필드를 초기화 시킬 수 있다. 
		
	}
	AAA(int a,int b) {
		this(a); //this는 자기자신. this가 포함되어 있는 AAA 클래스들 중에 하나. 
				// 매개변수를 아무것도 적지 않으면 AAA()를 의미. 하나를 적으면 AAA(int a)를 의미.
		
	}
}

 
public class ClazzTest {
	public static void main(String[] ar) {
		int[] su = new int[2]; //su[0], su[1]
		su[0] = 100;
		su[1] = 200;
		
		System.out.println("su[0] = " + su[0] + ", su[1] = " + su[1]);
		
		AAA su2 = new AAA();  //su2.x su.y
		su2.x = 100;
		su2.y = 200;
		
		System.out.println("su2.x = " + su2.x + ", su2.y = " + su2.y);
		  
	}
}
