import java.io.PrintStream;
import java.io.PrintWriter;
class MyException extends Exception {
	private String message;
	private Throwable cause;
	
	public MyException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyException(String message, Throwable cause) {
		super(message, cause);
		this.message = message;
		this.cause = cause;
		// TODO Auto-generated constructor stub
	}
	public MyException(String message) {
		super(message);
		this.message = message;
		// TODO Auto-generated constructor stub
	}
	public MyException(Throwable cause) {
		super(cause);
		this.cause = cause;
		// TODO Auto-generated constructor stub
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Throwable getCause() {
		return cause;
	}
	public void setCause(Throwable cause) {
		this.cause = cause;
	}
	public void printStackTrace() {
		System.out.println("에러 발생");
		System.out.println("에러 사유 = " + message);
		System.out.println("에러 클래스 = " + cause);
		System.out.println("Stack Trace 출력");
		super.printStackTrace(System.out);
	}
	public void printStackTrace(PrintStream out) {
		super.printStackTrace(out);
	}
	public void printStackTrace(PrintWriter out) {
		super.printStackTrace(out);
	}
}
public class UserExceptionTest {
	public static void main(String[] ar) {
		int x = 100, y = 0, tot = 0;
		try {
			tot = x / y;
		} catch(ArithmeticException ex) {
			MyException me = new MyException("나눗셈 오류", ex);
			me.printStackTrace();
		} finally {
			System.out.printf("%d / %d = %d", x, y, tot);
		}
	}
}
