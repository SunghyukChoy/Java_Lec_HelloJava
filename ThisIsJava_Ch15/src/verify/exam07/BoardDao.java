package verify.exam07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<Board>();
		// Board 타입의 객체를 List 컬렉션에 저장

		list.add(new Board("제목1", "내용1")); // Board 객체 생성 후 저장.
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));

		return list;
	}
}
