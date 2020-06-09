package exercise.no19;

public class Account {
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	private int balance;
	
	Account() {
		
	}
	
	void setBalance(int balance) {
		if(balance < MIN_BALANCE || balance > MAX_BALANCE) {
			return;				
		} else {
			this.balance = balance;
		}
	}
	int getBalance() {
		return balance;
	}
}
