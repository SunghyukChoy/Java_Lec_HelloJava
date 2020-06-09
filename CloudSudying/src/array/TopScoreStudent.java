package array;

public class TopScoreStudent {
	  public static void main(String[] args) {
	    // 배열 생성
	    String[] names = {"신비","엄지","은하","유주","예린","소원","성혁"};
	    int[] scores = {89, 91, 35, 52, 79, 95, 99};
	    
	    // 1등 인덱스 검색
	    int i = topIndex(scores); // topIndex의 리턴값을 받아 i 에 대입
	    
	    // 결과 출력
	    System.out.printf("1등: %s(%d점)\n", names[i], scores[i]);
	  }

	  // 정수형 배열을 입력받아 가장 큰 값의 인덱스를 반환
	  // scores[6] 위치를 출력하기 위해 반복문으로 각 값을 비교해줌.
	  // 비교 후 더 큰 수를 출력값으로 지정.
	  public static int topIndex(int[] arr) { // []arr = []scores
		int top = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[top] < arr[i]) { 
				top = i; 
				// 첫 실행 시 top = 0;으로 초기화 했으므로 
                // arr[top]의 값은 scores[] 의 0번째 값인 89, 
                // arr[i]는 scores[] 의 0번째 값부터 시작해서 6번째 값까지 증가.  
			}
		} return top;
	  }
	}