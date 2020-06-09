package array;

public class SumArray {
	 public static void main(String[] args) {
	    // 변수 생성
	    int[] runningMinutes = { 42, 66, 57, 54, 88 };
	    int sum = 0;

	    // 총합 계산
	    sum += runningMinutes[0]; // 42
	    sum += runningMinutes[1]; // 42 + 66
	    sum += runningMinutes[2]; // 42 + 66 + 57
	    sum += runningMinutes[3]; // 42 + 66 + 57 + 54
	    sum += runningMinutes[4]; // 42 + 66 + 57 + 54 + 88

	    // 결과 출력
	    System.out.printf("달리기 시간 총합: %d분\n", sum);
	    System.out.printf("달리기 시간 평균: %.0f분\n", sum / 5.0);
	  }
	}