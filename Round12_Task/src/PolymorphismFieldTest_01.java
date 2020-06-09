class FieldSuper_01 {
	int x = 100;
}
class FieldSub_01 extends FieldSuper_01 {
	int y = 200;
}

public class PolymorphismFieldTest_01 {
	public static void main(String[] ar) {
		FieldSuper_01 sup = new FieldSub_01();
		System.out.println("sup x = " + sup.x);
	}
}
