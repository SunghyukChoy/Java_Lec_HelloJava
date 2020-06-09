package sec10.exam02_static_block;

public class TelevisionExample {

	public static void main(String[] args) {
		System.out.println(Television.info);
			// Television이라는 클래스를 사용하기 위해 입력하는 순간
			// jvm이 Television이라는 클래스를 메모리에 로딩 시킴
			// 로딩 시 Television이 갖고 있는 정적 필드들이 초기화 되고
			// static 블록이 자동으로 실행되고 초기화 되지 않은 정적 필드들을 초기화함.
		
		
		System.out.println(Television.from1to10Sum);
	}

}
