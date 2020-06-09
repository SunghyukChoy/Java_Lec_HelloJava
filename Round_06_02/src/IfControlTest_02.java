import java.util.Scanner;

public class IfControlTest_02 {
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
		
		int firstValue = 24, secondValue = 32, thirdValue = 11;
		int mostLargestValue, secondLargeValue, minimumValue;
		int temporary; // 임시로 사용할 저장 공간

//		System.out.print("첫번째 수 = ");
//		firstValue = in.nextInt();
//
//		System.out.print("두번째 수 = ");
//		secondValue = in.nextInt();
//
//		System.out.print("세번째 수 = ");
//		thirdValue = in.nextInt();
 
		// and
//		if (secondValue >= firstValue && secondValue >= thirdValue) {
//			temporary = firstValue;
//			firstValue = secondValue;
//			secondValue = temporary;
//		} else if (thirdValue >= firstValue && thirdValue >= secondValue) {
//			temporary = firstValue;
//			firstValue = thirdValue;
//			thirdValue = temporary;
//		}
//
//		if (thirdValue >= secondValue) {
//			temporary = secondValue;
//			secondValue = thirdValue;
//			thirdValue = temporary;
//		}
		
		if (secondValue >= firstValue && secondValue >= thirdValue) {
			mostLargestValue = secondValue;
		} 

		System.out.println();
		System.out.println(firstValue + " >= " + secondValue + " >= " + thirdValue);

//		in.close();
	}
}
