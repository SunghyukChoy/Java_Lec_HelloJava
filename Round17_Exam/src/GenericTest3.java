import java.util.ArrayList;
import java.util.List;

class E {
	public void eee() {
		
	}
}
public class GenericTest3 {
	public static void main(String[] ar) {
		List<E> list = new ArrayList<E>();
		// List에 E 클래스 타입만 담겠다.
		E ap = new E();
		E bp = new E();
		E cp = new E();
		list.add(ap);
		list.add(bp);
		list.add(cp);
		
		for(int i = 0; i < list.size(); i++) {
			E temp = list.get(i);
				// Object 타입으로 받을 필요 없이 E 클래스 타입으로 받을 수 있음. 
				// list 안에는 E밖에 존재할 수 없어라고 제네릭으로 선언했기 때문.
			temp.eee();
				// 바로 호출해서 사용 가능.
		}
	}
}
 