package sec03.exam01_multi_type_parameter;

// 제네릭 클래스 
public class Product<T, M> {

	private T kind;
	private M model;

	public T getKind() {
		return kind;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}
}