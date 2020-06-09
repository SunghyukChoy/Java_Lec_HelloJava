class Master_01 {
	private static Master_01 master = new Master_01();
	private String name = "관리자";
	private Master_01() {}
	public static Master_01 getInstance() {
		return master;	
	}
	public String getName() {
		return name;
	}
}
class Worker_A_01 {
	private String name = "A그룹의 작업자";
	public void display() {
		System.out.println(Master_01.getInstance().getName() + "(이)가 " + name + "에게 일을 시킨다. ");
	}
}
class Worker_B_01 {  
	private String name = "B그룹의 작업자";
	public void display() {
		System.out.println(Master_01.getInstance().getName() + "(이)가 " + name + "에게 일을 시킨다. ");
	}
}
public class SingletonTest {
	public static void main(String[] ar) {
		Worker_A_01 wa = new Worker_A_01();
		Worker_B_01 wb = new Worker_B_01();
		wa.display();
		wb.display();
	}
}
