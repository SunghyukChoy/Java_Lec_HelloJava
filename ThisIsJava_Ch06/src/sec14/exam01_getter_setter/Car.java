package sec14.exam01_getter_setter;

public class Car {
	//필드
	private int speed;
	private boolean stop;	//할당하지 않은 boolean 자료형 필드 초기값은 false.
	
	//생성자
	
	//메소드
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
//			return;		// 여기서의 return은 메소드 종료의 의미. 반복문에서의 break와 같음.
		} else {
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) {
			this.speed = 0;
		}

		//setter 메소드는 리턴값이 void. 값만 설정하고 리턴하지는 않으므로.
	}
}