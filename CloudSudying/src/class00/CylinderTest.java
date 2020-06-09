package class00;

public class CylinderTest {
	  public static void main(String[] args) {
	    // 객체 생성
	    Cylinder c = new Cylinder();
	    // 속성 값 입력
	    c.radius = 4;
	    c.height = 5;
	    // 출력
	    System.out.printf("원기둥의 부피: %.2f\n", c.getVolume());
	    System.out.printf("원기둥의 겉넓이: %.2f\n", c.getArea());
	  }
	}
	class Cylinder {
	  /* 필드와 메소드를 구현하시오. */
		int radius, height;
	
		double getVolume() {
			return Math.pow(radius, 2) * Math.PI * height;
			
		}
		double getArea() {
			double circleArea = 2 * Math.PI * radius;   // 변수 선언과 동시에 초기화
			double rectAngleArea = circleArea * height;
			return (circleArea * 2) + (rectAngleArea);
		}
	}