package class00;

class Jurio {
	String name;
	int hp;
	
	public void punch() {
		System.out.println(name + "의 펀치!!");
	}
}

public class JurioPunch {
	public static void main(String[] ar) {
		Jurio jr = new Jurio();
		jr.name = "쥬리오";
		
		jr.punch();
		
		
	}
}
