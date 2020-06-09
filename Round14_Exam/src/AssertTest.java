/* assert Spring에서 실행 방법 :
 *  run as - run configuration - arguements - vm arguements - '-ea' 입력.
 *  명령 프롬프트 창에서 실행 방법: java -ea AssertTest 입력 */
public class AssertTest {
	public static void main(String[] ar) {
		int x = 10;
		int y = 8;
							
		
		
		//.....많은 코드....
//		x = 9;		// 많은 코드 사이에 x를 9바꾼다면?
		//....많은 코드...
		
				
//		System.out.println("x = " + x + ", y = " + y);	
		// 예전의 x,y 검증 로직..매번 하기 힘듦. 그래서 assert 예약어 나타남.
		assert x - y == 2 : "x = " + x + ", y = " + y;
			// x - y는 2와 같고 2가 아니라면 "x = " + x + ", y = " + y 출력
		int result = x - y;
		if(result == 2) {	// x가 9로 바뀌면 출력 구문 출력 안 됨.
			System.out.println("프로그램 종료");
		}
			
	}
}
