import java.io.IOException;

public class WriteTest {
	public static void main(String[] ar) throws IOException {
		System.out.write((byte)'A');
		System.out.flush(); //buffer를 비워줌
		byte[] data = new byte[] {(byte)'H', (byte)'e', (byte)'l'};
		System.out.write(data);
				
		
	}
}
