interface OuterInterface {
	int x = 100;

	interface Innerinterface {	
		int y = 200;
		void display();
	}
	class InnerClass implements Innerinterface {
		private int z;
		public InnerClass() {
			this.z = 300;
		}
		public void display() {
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			System.out.println("z = " + z);
		}
	}
}
public class InterfaceInnerClassTest {
	public static void main(String[] ar) {
		OuterInterface.Innerinterface oi1 = new OuterInterface.Innerinterface() {
			public void display() {
				System.out.println("y = " + y);
			}
		};
		OuterInterface.InnerClass oi2 = new OuterInterface.InnerClass();
		
		oi1.display();
		oi2.display();
	}
}
