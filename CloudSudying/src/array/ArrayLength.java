package array;

public class ArrayLength {
	public static void main(String[] ar) {
		String[] studentName = { "신비", "성혁", "은하" };
		int[] studentNum = { 1630, 1635, 1640 };
		double[] grade = { 4.2, 4.4, 3.9 };

		// System.out.printf("이름 : %s\n학번: %d\n학점 : %.1f\n\n", studentName[0],
		// studentNum[0], grade[0]);
		// System.out.printf("이름 : %s\n학번: %d\n학점 : %.1f\n\n", studentName[1],
		// studentNum[1], grade[1]);
		// System.out.printf("이름 : %s\n학번: %d\n학점 : %.1f\n\n", studentName[2],
		// studentNum[2], grade[2]);

		for (int i = 0; i < 3; i++) {
			System.out.printf("학번: %d\n", studentNum[i]);
			System.out.printf("이름: %s\n", studentName[i]);
			System.out.printf("학점: %.2f\n", grade[i]);
			System.out.println();
		}

	}
}
