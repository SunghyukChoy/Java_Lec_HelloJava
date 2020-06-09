import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("구입할 게임의 수를 입력하시오.");
		int games = sc.nextInt();

		for(int i = 1; i <= games; i++) {
			if(games > 100) {
				System.out.println("최대 100장까지 구매 가능합니다.");
				break;
			} else {
				System.out.println("번호를 생성합니다.");
			}
			
			System.out.println(i + "번쨰");
			
			for(int j = 1; j <= 6; j++) {
				int num = (int)(Math.random()*45) + 1;				
				
				for(int k = 1; k <= 6;) {
					int[] search = new int[6];
					search[k] = num;
					if(num != search[k-1]) {
						k++;
					}					
				}				
			}
		}
	}
}
