package sec11.exam02_static_final;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
		// 상수 선언 시 초기화 방법 
			// 선언 시 바로 초기화
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
			// 상수도 static 필드이므로 static 블록에서 초기화 가능
			// 계산식 등의 복잡한 과정 시 사용.
	}
}
// 상수(static final)
// 상수 = 정적 final 필드
//  *final 필드 : 객체마다 가지는 불변의 인스턴스 필드
//  *상수(static final) : 
//	  객체마다 가지고 있지 않고 메소드 영역에 클래스별로 관리되는 불변의 정적 필드
//	  공용 데이터로써 활용