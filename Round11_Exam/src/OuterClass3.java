
public class OuterClass3 {
	public void display() {
		System.out.println("Start..");
		
		class InnerClass {  // 지역중첩클래스. 메소드 내부에서만 사용할 목적으로 선언된 클래스
			private int su1;
			private int su2;
			private int tot;
			public InnerClass(int x, int y) {
				this.su1 = x;
				this.su2 = y;
			}
			public void calc() {
				tot = su1 + su2;
			}
			public void display() {
				System.out.println(su1 + " + " + su2 + " = " + tot);
			}
		}
		InnerClass in = new InnerClass(100, 200);
		in.calc();
		in.display();
	}
	public static void main(String[] ar) {
		OuterClass3 out = new OuterClass3();
		out.display();
		
	}
	
} 
