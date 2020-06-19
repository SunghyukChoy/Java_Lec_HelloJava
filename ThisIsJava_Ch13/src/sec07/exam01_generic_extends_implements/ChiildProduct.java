package sec07.exam01_generic_extends_implements;

public class ChiildProduct<T, M, C> extends Product<T, M> {
	// 부모 클래스의 타입이 제네릭이면 자식 클래스의 타입도 제네릭이어야 한다.
	// 자식 클래스는 부모 클래스가 가진 제네릭 타입 외에 추가로 더 가질 수 있다.
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}

}
