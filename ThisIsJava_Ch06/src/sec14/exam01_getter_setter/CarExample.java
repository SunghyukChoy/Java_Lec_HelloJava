package sec14.exam01_getter_setter;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재 속도 : " + myCar.getSpeed() + "km/h");
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		
		if(myCar.isStop()) {	//할당하지 않은 boolean 자료형 필드 초기값은 false.
			myCar.setStop(true);
				//조건식에 isStop()의 리턴값인 false 값을 넣어 줬으므로 
				//위의 조건문은 실행되지 않음.
		//if 조건문에서 조건식 앞에 !를 붙이면 값의 반대를 의미
			//if(!false)는 조건식이 true라면이라는 뜻.
			
		}
	
		System.out.println("현재 속도 : " + myCar.getSpeed() + "km/h");
	}

}
