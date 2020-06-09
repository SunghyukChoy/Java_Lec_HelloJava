package sec10.exam02_static_block;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	static int from1to10Sum;
	
//	static int getSum() {
//		int sum = 0;
//		for(int i = 1; i <= 10; ++i) {
//			sum += i;
//		}
//		return sum;
//	}
	
	static {
		info = company + "-" + model;
		
		// 정직 필드의 초기화 값을 계산식이나 반복문을 통해 얻어야 하는 경우 
		// 블록 안에서 작업하여 초기화 하여 줌.
		// 클래스가 메모리에 로딩되는 순간 자동으로 실행되어 필드 값을 초기화 하여 줌.
		// 블록 안에는 정적 필드와 정적 메소드만이 위치할 수 있음.
		// 인스턴스 필드와 인스턴스 메소드는 위치할 수 없음.
		// 인스턴스 멤버(필드와 메소드)는 객체에 속해있기 때문에 
		// 메소드 영역에 속한 정적 멤버와는 다름. 따라서 static 블록에서 사용할 수 없다.
		// 객체 생성 없이 사용하는 static 멤버는 객체 자신의 주소를 참조하는 this 키워드를 사용할 수 없다.
	}
	
	static {
		// static 블록이 여러개 선언되어도 상관 없음.
		// 선언된 순서대로 실행됨
		// 그러나 보통 하나만 있으면 되므로 블록을 여러개 만들 필요는 없음.
		
		int sum = 0;
		for(int i = 1; i <= 10; ++i) {
			sum += i;		
		}
		from1to10Sum = sum;		
		
		// from1to10Sum = getSum();
			// 위와 같이 정적 메소드를 사용하여 값을 구하여도 됨. 내가 한 거.
	}
}
