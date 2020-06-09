class CommonData<T> {
	private T data;
	public void set(T data) {
		this.data = data;
	}
	public T get() {
		return data;
	}
}
public class GenericTypeTest {
	public static void main(String[] ar) {
		CommonData<String> str_data = new CommonData<String>();
		CommonData<StringBuilder> str_builder_data = new CommonData<StringBuilder>();
		System.out.println("str_data = " + str_data.get());
		System.out.println("str_builder_data = " + str_builder_data.get());
		
	}
}
