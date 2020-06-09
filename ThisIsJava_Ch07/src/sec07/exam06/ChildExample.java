package sec07.exam06;

public class ChildExample {
	public static void main(String[] ar) {
		Parent parent = new Child();	//?? ?? 蹂?.
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";	//遺媛??
//		parent.method3(); 			//遺媛??
		
		Child child = (Child) parent;	//媛? ?? 蹂?
		child.field2 = "yyy";		//媛??
		child.method3(); 			//媛??
		
		
	}
}
