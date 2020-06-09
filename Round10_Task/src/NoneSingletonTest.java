class Master {
	private String name = "관리자";
	public String getName() {
		return name;
	}
}
class Worker_A {
	private Master master;
	private String name = "A그룹의 작업자";
	public Worker_A (Master master) {
		this.master = master;
	}
	public void display() {
		System.out.println(master.getName() + "가(이) " + name + "에게 일을 시킨다. ");
	}
}
class Worker_B {
	private Master master;
	private String name = "B그룹의 작업자";
	public Worker_B (Master master) {
		this.master = master;
	}
	public void display() {
		System.out.println(master.getName() + "가(이) " + name + "에게 일을 시킨다. ");
	}
}
public class NoneSingletonTest {
	public static void main(String[] ar) {
		Master master = new Master();
		Worker_A wa = new Worker_A(master);
		Worker_B wb = new Worker_B(master);
		wa.display();
		wb.display();
	}
}
