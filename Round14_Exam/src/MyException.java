
public class MyException extends Exception { // Exception 클래스 상속
	private final String msg = "0~100점 사이만 입력 가능";

	@Override
	public String getLocalizedMessage() { // Exception 클래스의 getLocalizedMessage() 재정의.
		// TODO Auto-generated method stub
		return msg;
	}
	
}
