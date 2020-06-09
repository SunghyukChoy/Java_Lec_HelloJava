package sec02.sub05;

public interface RemoteControl {
	// 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

	// 추상 메소드 
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디플트 메소드		//실행 내용까지 작성
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해체합니다.");
		}
	}
	
	//정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
