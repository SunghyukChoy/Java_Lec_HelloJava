/*메모리 상의 구조 call by reference
 *  힙 영역에 클래스 Data에 대한 인스턴스가 있다
 *  스택 영역에 main 메소드의 공간이 있고 레퍼런스형 변수 d가 있다.
 *  d는 이 인스턴스를 가리키고 있거 이 인스턴스에는 x = 10이라는 정보가 있다.
 *  스택 영역에 main 메소드와는 다른 change 메소드의 공간이 있다.
 *  change 메소드의 매개변수로 d가 가리키는 *주소값을 복사하여 * 던져준다. 
 *  change의 매개변수와 main 메소드의 변수 d는 같은 주소값을 갖는다.*(같은 인스턴스를 가리키게 된다.)*
 *  change 메소드는 이 인스턴스에 접근하고 change 메소드에서 x값을 다시 초기화 해주면 이 인스턴스의 x 값이 바뀌어 저장된다.
 *  change 메소드의 수행이 끝나고 스택 영역에 change 메소드의 공간이 없어지더라도 
 *  힙 영역에서 이 인스턴스 내 x의 값이 바뀐 것이므로  main 메소드에서 x값 호출 시 바뀐 값을 가지게 된다.
 *  이게 내용이 맞고 내가 알려준게 몇몇가지 틀렸음
 *  heap 에만 인스턴스 데이터들이 저장되고 그 최초 메모리 주소를 stack 영역 변수에 넘기는거네
 *  내가 확인하고 싶은건 change 메소드도 heap 에 저장되는지 stack에 저장되는지 헷갈려서 그랬음   
 * */

package CallByReference;


// call by reference.
public class ReferenceParamEx {
	public static void main(String[] ar) {
		Data d = new Data(); // 인스턴스가 힙 영역에 생성되어 참조 주소를 변수 d에 대입.
		d.x = 10; 
		System.out.println("main() x : = " + d.x);
		change(d);
			// 주소를 넘겨줌. "시계가 어딨니?"라는 형태
		System.out.println("change(d)메소드 호출 후");
		System.out.println("main() x : = " + d.x);
		
		System.out.println();		
		int[] arr = new int[] {1,2}; // new 키워드로 인스턴스 생성
		System.out.println(arr[1]);
		arr_change(arr); // 주소값을 던져줌
		System.out.println("arr_change(arr)메소드 호출 후");
		System.out.println(arr[1]);
		// 배열도 레퍼런스형 변수.
	}
	
	static void change(Data ar) {
	
		 ar.x = 1000; 
		System.out.println("change() x : " + ar.x);
	}
	
	static void arr_change(int[] ar) {
		ar[1] = 4;
		System.out.println(ar[1]);
		
	}
}


