/*//서울: 599 명
부산: 51 명
인천: 46 명
대전: 43 명
대구: 27 명*/

package array;

public class Local {
	public static void main(String[] ar) {

		String[] area = { "서울", "부산", "인천", "대전", "대구" };
		int[] user = { 599, 51, 46, 43, 27 };

		for (int i = 0; i < area.length; i++) {
			System.out.printf("%s : %d\n", area[i], user[i]);

		}

	}

}
