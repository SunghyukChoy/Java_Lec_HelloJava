	
public class ArrayTest2 {
	public static void main(String[] arg) {
//		char[] arr1; //runtime stack영역에 arr1라는 이름의 4byte 공간 할당
//		long arr2[]; // 배열 참조는 [] 뒤에 적어도 되고 앞에 적어도 됨.
					//runtime stack영역에 arr2라는 이름의 4byte 공간 할당
					// 자료형이 뭐든 배열 객체라고 한다면 heap 영역의 특정 위치를 저장하고 있어야 될 공간. 무조건 4bte.
// 		int[] arr3; //runtime stack영역에 arr3라는 이름의 4byte 공간 할당
		// 아직 초기화 되지 않음.
		
		
		// 배열 생성 방법 세 가지
		char[] arr1 = {'A', 'B', 'C'};
					// heap 영역에 2byte[0]...2byte[1]...2byte[2]
		long arr2[];
				
		arr2 = new long[5]; // 값을 지정해주지 않았으므로 default로 초기화. long 형태의 default 값 = 0L
				// heap 영역에 8byte[0]...8byte[1]...8byte[2]...3.....4.....
		int[] arr3;
		arr3= new int[] {100, 200, 300, 400};
				// heap 영역에 4byte[0]...4byte[1]...4byte[2].....3.......4
		
		System.out.println(arr1[0]);
		System.out.println(arr2[1]);
		System.out.println(arr3[2]);
	}
}
