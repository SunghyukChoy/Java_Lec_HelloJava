class JBank {
	/* static 멤버 필드들 */
	private static float iyul;
	static {	// static 초기화 블록
		JBank.iyul = 0.0f;
	}
	
	/* 멤버 필드들 */
	private String name;
	private double money;
	/* 생성자들 */
	public JBank() {
		name = "손님";
		money = 0.0;
	}
	public JBank(String name, double money) {
		this.name = name;
		this.money = money;
	}
	/* 멤버 메서드들 */
	public boolean depositMoney(double money) {
		this.money += money;
		return true;
	}
	public boolean withdrawalMoney(double money) {
		this.money -= money;
		return true;
	}
	public void showStatus() {
		System.out.printf("%s님의 잔금은 %.0f원입니다. \n", name, money);
		System.out.printf("현재 이율은 %.2f%%입니다. \n", JBank.getIyul());
	}
	/* static 멤버 메서드들 */
	public static boolean setIyul(float iyul) {
		if(iyul < 0 || iyul > 1) return false;
		JBank.iyul = iyul;
		return true;
	}
	public static float getIyul() {
		return JBank.iyul;
	}
}
public class JBankTest {
	public static void main(String[] ar) {
		// 은행 이율 설정
		JBank.setIyul(0.02f);
		System.out.printf("이율이 %.2f로 변경되었습니다. \n", JBank.getIyul());
		System.out.println();
	
		// 홍길동, 12500원으로 통장 개설
		JBank hong = new JBank("홍길동", 12500.0);
		// 이순신, 59450원으로 통장 개설
		JBank lee = new JBank("이순신", 59450.0);
		
		hong.showStatus();
		lee.showStatus();
		System.out.println();
		
		// 홍길동, 4650원 인출
		hong.withdrawalMoney(4650.0);
		
		hong.showStatus();
		lee.showStatus();
		System.out.println();
		
		// 이율 변경 0.02 -> 0.035
		JBank.setIyul(0.035f);
		
		hong.showStatus();
		lee.showStatus();
	}
}
