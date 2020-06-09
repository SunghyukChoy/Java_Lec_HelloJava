
public class ArrayCopyExample {
	public static void main(String[] ar) {
		
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		for(int i = 0; i < oldStrArray.length; ++i)	{
			newStrArray[i] = oldStrArray[i];
		}
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i = 0; i < newStrArray.length; ++i) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}
