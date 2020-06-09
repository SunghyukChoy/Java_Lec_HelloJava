import java.util.ArrayList;
import java.util.List;

// class MySuper{}
class C{	// extends MySuper {}
	public void ccc() {
		
	}
}	
class D{	// extends MySuper {}
	public void ddd() {
		
	}
}	

public class GenericTest2 {
	public static void main(String[] ar) {
		List list = new ArrayList();
			//List에는 원하는 것을 무한하게 담을 수 있음.
		C ap = new C();
		D bp = new D();
		C cp = new C();
		D dp = new D();
			// 이것들을 모아서 관리하고 싶다면? 배열에 담으려면?
		
//		MySuper[] ms = new MySuper[4];
//		ms[0] = ap;
//		ms[1] = bp;
//		ms[2] = cp;
//		ms[3] = dp;	
			//이러한 과정 필요없음.
		
		list.add(ap);
		list.add(bp);
		list.add(cp);
		list.add(dp);
			// 컬렉션 프레임워크	
			// 꺼내서 사용하고자 한다면?
		
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			if(obj instanceof C) {
				((C) obj).ccc();
			} else if(obj instanceof D) {
				((D) obj).ddd();				
			}		// 타입에 대해 항상 조사를 해야한다는 문제점이 있음. 	
		}		
	}
}
