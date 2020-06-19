package sec07.exam01_generic_extends_implements;

public class StorageImpl<T> implements Storage<T> {
	// 인터페이스가 제네릭 타입이면 구현 클래스도 같은 제네릭 타입을 가짐.

	private T[] array;

	public StorageImpl(int capacity) {
		array = (T[]) (new Object[capacity]);
	}

	@Override
	public void add(T item, int index) {
		array[index] = item;
	}

	@Override
	public T get(int index) {

		return array[index];
	}

}
