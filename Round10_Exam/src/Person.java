// 생성자 메소드, getter,setter,toString 메소드 자동으로 생성하는 방법
// DTO 패턴.

public class Person {
	private String name;
	private String jumin;
	private String tel;
	private String adress;
	// 여기까지는 직접 생성
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
		// 마우스 우클릭 - source - generate ~~~~~ superclass 클릭 - generate
			// 단축키 alt + shift + S
	}
	
	public Person(String name, String jumin, String tel, String adress) {
		super();
		this.name = name;
		this.jumin = jumin;
		this.tel = tel;
		this.adress = adress;
	}	// 위 과정과 동일 - generate ~~~~~ feild - 원하는 객체 선택 가능.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	} // 위 과정과 동일 - generate getter and setter - 원하는 객체 선택 가능(getter,setter 각각 선택 가능)

	@Override // 상속받은 OBject 클래스에 있는 것을 재정의했다는 의미.
	public String toString() {
		return "Person [name=" + name + ", jumin=" + jumin + ", tel=" + tel + ", adress=" + adress + "]";
	} // 위 과정과 동일 - generate toString - 원하는 객체 선택 가능.
	
}
