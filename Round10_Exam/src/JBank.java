
public class JBank {
	static float interest;
	static {
		interest = 0.02f;
		// static인 멤버들의 초기화는 보통 이 영역 안에서 초기화를 시켜준다. 
		// 위의 영역에서 초기화 해도 상관 없음.
		// static이란 예약어는 남발하지 않도록 주의한다. 
	}
	private String name = "";
	private double money = 0;
	
	public JBank(String name, double money) {
		this.name = name;
		this.money = money;
	}
	
	public void display() { 
		System.out.println("name = " + name + " money = " + money + " interest = " + interest);
	}
	
	
	
	public static void setInterest(float interest) { 
		JBank.interest = interest; // interest 값을 변경하기 위해 메소드를 만들어 사용.
	}
	public static float getInterest() {
		return interest; // interest 값을 불러오기 위해 메소드를 만들어 사용.
	}
}
