class Super {
	int x = 100;
	public void display() {
		System.out.println("x = " + this.x);
	}
}
class Sub extends Super {
	int y = 200;
	public void display() {
		System.out.println("x = " + super.x);
		System.out.println("y = " + this.y);		
	}
}
public class SuperKeywordTest {
	public static void main(String[] ar) {
		Super sup = new Super();
		Sub sub = new Sub();
		
		sup.display();
		System.out.println();
		sub.display();		
	}
}
