package sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;		// ?? ?? 蹂?
		parent.method1();
		parent.method2(); 			// ?ъ?? 硫??媛 ?몄???
//		parent.method3();			// ?몄? 遺媛??

	}

}
