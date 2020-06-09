class BBB {
	int x;
	double y;
	public BBB () {
		
	}
} 

public class GarbageTest {
	public static void main(String[] ar) {
		BBB b1 = new BBB(); // heap영역에. 10억번지 주소에 메모리 할당. b1.x = 0, b1.y = 0.0;으로 초기화
		BBB b2 = b1; // b2에도 10억번지 주소값이 들어가 있음. 
		b1 = null; // 이 순간 b1에 있던 10억번지 주소값은 없어짐.그러나 b2에 의해 참조됨.
		b2 = null; // 이 순간이 되면 10억번지 주소값을 참조하고 있는 대상체가 없어지므로 x와 y는 가비지 컬렉터의 대상이 됨.
					//이후 아래 쓰레드의 상황에 따라 필요 시 해당 메모리를 없애버림.
	}
}
