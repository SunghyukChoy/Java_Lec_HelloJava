///이해 안 됨

package array;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		double[][] twoDimArray = { { 92, 86, 90, 95 }, { 76, 96, 91, 88 }, { 88, 72, 85, 89 } };
		double sum = 0;
		for (int person = 0; person < twoDimArray.length; person++) {
			for (int i = 0; i < twoDimArray[person].length; i++) {
				sum += twoDimArray[person][i];
			}
		}
		int row = twoDimArray.length;
		int col = twoDimArray[0].length;

		System.out.println(row);
		System.out.println(col);
		System.out.printf("평균: %.2f", sum / (row * col));
	}
}

