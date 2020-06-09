class MyThread4 extends Thread {
	private String name;
	public MyThread4(String string) {
		this.name = string;
	}	
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println(name + " : " + i);
		}
	}
}
public class ThreadTest3 {
	public static void main(String[] ar) {
		MyThread4 first = new MyThread4("First");
		MyThread4 second = new MyThread4("Second");
		
		first.setPriority(Thread.MIN_PRIORITY);
		second.setPriority(Thread.MAX_PRIORITY);
		//(Thread.MIN_PRIORITY) : 가장 낮은 순위
		//(Thread.MAX_PRIORITY) : 가장 높은 순위
		//(Thread.NORM_PRIORITY) : 중간 순위
		//second.setPriority(5); : 숫자로도 설정 가능. 1 ~ 10 사이. 10이 가장 높은 순위.
		// 우선순위 설정은 쓰레드가 시작하기 전에만 설정 가능.
		
		first.start();
		second.start();	
	}
}
