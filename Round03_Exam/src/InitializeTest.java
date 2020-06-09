
class A {
	int x; //heap 영역에 메모리 생성. 초기화 안 시켜도 자동으로 0 값으로 할당.

}

public class InitializeTest {
	public static void main(String[] ar) {
		int x = 100;        // main에서 사용하는 변수들은 runtime stack에 메모리 할당
					// 실행시점에 변수를 할당하고 사용하는 것을은 runtime stack에 할당
		            // 자동으로 초기화 되는 값 없음. 해서 반드시 초기값을 넣어줌 1이든 0이든 100이든...
		System.out.println(x);
	}
}
