package Ex12_8;

public class WorkThread extends Thread {
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		// 스레드 그룹과 스레드 이름을 설정
		super(threadGroup, threadName);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			}
			// InterruptedException이 발생할 떄 while문을 빠져나와 스레드를 종료시킴
			catch(InterruptedException e) {
				System.out.println(getName() + " interrupted");
				break;
			}
		}
		
		System.out.println(getName() + " 종료됨");
	}
}
