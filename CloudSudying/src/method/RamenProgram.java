package method;


public class RamenProgram {
	public static void main(String[] ar) {
		Ramen ramen = new Ramen();
		ramen.makeRamen();		
	}
}

class Ramen {

	public void makeRamen() {
		buy();
		boil();
		put();
		eat();
	}
	
	private void buy() {
		System.out.println("라면을 산다");
	}

	private void boil() {
		System.out.println("물을 끓인다");
	}

	private void put() {
		System.out.println("라면을 넣는다");
	}

	private void eat() {
		System.out.println("라면을 먹는다");
	}
}
