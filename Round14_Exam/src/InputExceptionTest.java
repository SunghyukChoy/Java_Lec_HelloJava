import java.util.Scanner;

public class InputExceptionTest {
	public static void input() throws Exception {	// 예외전가
		Scanner in = new Scanner(System.in);
		System.out.println("국어 점수 입력(0 ~ 100) = ");
		int kor = in.nextInt();
		if(kor < 0 || kor > 100) {
			Exception ex = new Exception("정수 범위를 벗어난 오류");
			in.close();
			throw ex;	// 예외가 발생하리라 예상이 되는 코드 작성을 함. -> 예외 전가 or 예외 처리 해줌.
			// 예외가 발생하면 여기서 프로그램 종료
		}
		System.out.println("입력한 국어 점수는 " + kor + "점입니다.");
		in.close();
		// 1. 만약 국어 점수의 점뷔를 벗어난 점수를 넣는다면?
		// 2. 이럴 떄 예외 발생, 프로그램 종료하기
	}
	public static void input2() {	// 코드만 봐선 예외가 발생할 거라고 예상하기 힘든 코드. 
		Scanner in = new Scanner(System.in);
		System.out.println("나눌 수 입력 = ");
		int num = in.nextInt();
		int result = 0;
		try {
			result = 100 / num;	// 예외가 예상되는 영역
		} catch(ArithmeticException ex) {
					// ArithmeticException 예외가 발생하면 객체 ex에 담는다는 뜻.
			System.err.println("0으로 나눌 수 없습니다.");
			ex.printStackTrace();	// jvm이 출력하는 예외 메세지를 그대로 출력하는 구문.
			System.err.println(ex.getLocalizedMessage());
			result = -1;			
		}	// 여기서 예외처리 끝.
		catch(Exception ex) {	// 다른 예외처리. catch는 여러 번 사용 가능
			System.err.println("다른 오류");
		}
		finally {	// 예외가 발생 하든 안 하든 무조건 실행하는 구문
			System.out.println("이건 무조건 실행");
		}
		
		System.out.println("결과값 = " + result);
		in.close();
	}	
	
	
	public static void main(String[] ar) throws Exception { // 예외전가를 하는 메소드를 호출하므로 여기서도 예외전가 해줌.
//		input();
		input2();
	}
}

/* 복잡한 프로그램에서..예외 처리는 프로그램의 가장 마지막(main() 메서드 정도)에 하는 것이 좋다..예외는 밖으로 뿜어내야 에러의 위치를 찾아낼 수 있따....try catch는 예외를 먹어버린다... 알아서 없애 버린다..
	catch 구문에서 메세지 출력을 안 하게 되면 예외 인지를 하기 힘들다..아니면 예외를 계속 전가하여 주든지..
	정보 보고를 꼭 해라... 중요...*/