package Ex12_8;

import java.util.Map;
import java.util.Set;

import Ex12_7.AutoSaveThread;

public class ThreadInfoExampel {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();

		/* 프로세스에서 실행하는 모든 Thread를 가져오는 코드 */
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		
		/* Thread를 하나씩 가져와 루핑시킴 */
		for (Thread thread : threads) {
			System.out.println("Name: " + thread.getName() + ((thread.isDaemon()) ? "(데몬)" : "(주)"));
			System.out.println("\t" + "소속그룹: " + thread.getThreadGroup().getName());
			System.out.println();
		}
	}
}
