package array;

import java.util.Arrays;

public class Bacteria2 {
	public static void main(String[] ar) {
		int[] bacteriaNum = new int[10];
		
		for (int i = 0; i < bacteriaNum.length; i++) {
			bacteriaNum[i] = (int)Math.pow(2, i);   // math.pow는 double 타입이므로 int 타입인 bacteriaNum과 타입이 맞지 않으므로 강제형변환을 하여 준다.
		}
		System.out.println(Arrays.toString(bacteriaNum));
		// 배열을 출력하는 구문 사용하기 위해 import 하여줌
		
		
	
	}
}
