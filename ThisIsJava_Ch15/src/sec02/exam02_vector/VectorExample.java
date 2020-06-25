package sec02.exam02_vector;

import java.util.List;
import java.util.Vector;

// Board 객체를 저장하는 Vector
public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>(); // Board : 저장되는 객체의 타입.
		// Vector는 멀티 스레드 환경에서 안전하게 사용할 수 있다.
		// Vector는 스레드 동기화(synchronization)가 되어 있기 때문에 복수의 스레드가 동시에
		// Vector에 접근해서 객체를 추가, 삭제하더라도 스레드에 안전(thread safe)하다.

		// ArrayList는 멀티 스레드 환경에서 안전하게 사용할 수 없다. 싱글 스레드에서 사용함.

//		ArrayList
//			public boolean add(...) {...}
//		// 싱글  스레드 환경에서 더 빠름.		
//		Vector 
//			public synchronized boolean add(...) {...}
//		// 멀티 스레드 환경에서 하나의 스레드가 add 메소드를 실행하면 다른 스레드는 add를 실행할 수 없음
//		// synchronized가 붙어있기 때문에.		

		// Board 객체를 저장
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));

		list.remove(2); // 2번 인덱스 객체(제목3) 삭제(뒤의 인덱스는 1씩 앞으로 당겨짐)
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println("index = " + i + "\t" + board.subject + "\t" + board.content + "\t" + board.writer);
		}
		System.out.println();
		
		list.remove(3); // 3번 인덱스 객체(제목5) 삭제
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println("index = " + i + "\t" + board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}

}
