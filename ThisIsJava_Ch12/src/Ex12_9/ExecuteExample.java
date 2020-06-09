package Ex12_9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {

	public static void main(String[] args) throws Exception {
		// 최대 스레드 개수가 2인 스레드를 생성
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		// 작업 정의
		for (int i = 0; i < 10; i++) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					// 스레드 총 개수 및 작업 스레드 이름 출력
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[총 스레ㅔ드 개수: " + poolSize + "] 작업 스레드 이름: " + threadName);
					// 예외 발생 시킴
					int value = Integer.parseInt("삼");
				}
			};

			// 작업 처리 요청
			executorService.execute(runnable);
			// executorService.submit(runnable);
			// 위의 라인과 주석 처리 바꿔서 실행해보기

			Thread.sleep(10); // 콘솔에 출력 시간을 주기 위해 0.01초 일시 정지시킴
		}

		executorService.shutdown();
	}

}
