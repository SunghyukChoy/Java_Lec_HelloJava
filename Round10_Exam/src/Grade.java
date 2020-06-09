// 아래의 클래스는 잘못된 점수가 입력되는 것을 방지하기 위해 짜여진 코드.
public class Grade {
	private String name;
	private int kor;
	private int eng;
	private int total;
	// 가급적 은닉화.
	// 모든 필드는 private으로 선언되어 있고 초기값을 주고 싶은 멤버는 생성자 메소드를 통해 지정.
	// set,get 메소드는 사용.
	
	public Grade(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		if (kor < 0 || kor > 100) {
			kor = 0;
			System.out.println("kor에 잘못된 점수를 입력하였습니다.");
		} // 만약 입력된 kor의 값이 0보다 작거나 100보다 크다면 0으로 처리하겠다는 뜻. 
		this.kor = kor; // if문의 조건에 해당하지 않으면 kor의 값은 전달받은 매개변수 값
	}
	public void setEng(int eng) {
		if (eng < 0 || eng > 100) {
			eng = 0;
			System.out.println("eng에 잘못된 점수를 입력하였습니다.");
		}
		this.eng = eng;
	}
	public void calc() {
		this.total = this.kor + this.eng;
	}
	public int getTotal() {
		return this.total;
	}
	public String toString() {
		return "name = " + this.name + ", kor = " + this.kor + ", eng = " + this.eng
				+ ", total = " + this.total;
	}
}
	

