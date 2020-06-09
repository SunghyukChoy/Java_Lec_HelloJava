
public class Random {
	public static void main(String[] args) {
			int n = randomNum();
			System.out.printf("주사위의 눈 : %d", n);
	}
	public static int randomNum() {
		  double rand = Math.random(); // 0.0 <= x < 1.0
		  int num = (int) (rand * 6) + 1;
		  return num; 
}
}