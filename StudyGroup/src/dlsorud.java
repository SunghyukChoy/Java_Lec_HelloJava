
import java.util.Scanner;

public class dlsorud {

	public static void main(String[] args) {

		int Lotto[][] = new int[100][6];
		int games = 0;
		int random = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("로또 몇 장을 구매하시겠습니까?");

		games = sc.nextInt();

		if (sc != null) {
			for (int i = 0; i < games; i++) {

				for (int j = 0; j < 6; j++) {
					random = (int) (Math.random() * 45) + 1;
					Lotto[i][j] = random;
					for (int x = 0; x < j; x++) {
						if (Lotto[i][j] == Lotto[i][x]) {
							j--;
							break;
						}

					}
				}
			}
			for (int i = 0; i < games; i++) {
				System.out.println(i + 1 + "번째");
				for (int j = 0; j < 6; j++) {
					System.out.println(Lotto[i][j]);
				}
			}
		}

	}
}
