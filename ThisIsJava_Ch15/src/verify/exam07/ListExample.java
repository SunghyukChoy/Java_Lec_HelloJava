package verify.exam07;

import java.util.List;

/*
 * BoardDao 객체의 getBoardList() 메소드를 호출하면 List<Board> 타입의 컬렉션을 리턴합니다. ListExample 클래스를 실행시켰을 때
다음과 같이 출력될 수 있도록 BoardDao의 getBoardList() 메소드를 작성해 보세요.
출력결과 : 
	제목1-내용1
	제목2-내용2
	제목3-내용3
*/
public class ListExample {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		// getBoardList()의 리턴 타입 : List<Board>
		// 컬렉션 안에는 3개의 Board 객체가 있음.
		for (Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}