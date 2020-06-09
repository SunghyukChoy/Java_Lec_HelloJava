import java.io.IOException;

public class IOExceptionTest {
	public static void main(String[] args) {
		byte[] data = { 'J', 'A', 'V', 'A' };
		
		try {
			System.out.write(data);	
		} catch (IOException e ) {
			System.out.println("잘못된 시도입니다");
		}
	}

}
