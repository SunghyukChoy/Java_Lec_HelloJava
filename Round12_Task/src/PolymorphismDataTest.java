class DataSuper {
	private int x = 100;
	private int y = 200;
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setZ(int z) {
		// 니용부 없음. 다형성으로 표현해서 사용하기 위해 기재
	}
	public void display() {
		System.out.println("Super x = " + x + ", Super y = " + y);
	}
}
class DataSub extends DataSuper {
	private int y = 300;
	private int z = 400;
	public void setY(int y) {
		this.y = y;   //y= 2
	}
	public void setZ(int z)	{
		this.z = z;
	}
	public void display() {
		super.display();
		System.out.println("Sub y = " + y + ", Sub z = " + z);
	}
}
public class PolymorphismDataTest {
	public static void main(String[] ar) {
		DataSuper sup = new DataSub();
		
		sup.display();
		System.out.println();
		
		sup.setX(1);
		sup.display();
		System.out.println();
		
		sup.setY(2);
		sup.display();
		
		sup.setZ(3);
		sup.display();
		
	} // 중괄호가 닫힐 때까지 변경된 값은 날아가지 않음.
}



// 콘솔창 좀 찾아주셈