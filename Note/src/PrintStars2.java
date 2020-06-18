import java.util.ArrayList;
import java.util.List;

public class PrintStars2 {

	public static void main(String[] args) {
		
		int val = 5;
//		char stars = '*';
//		char space = ' ';
		
		for (int i = 0; i < val; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < val; i++) {
			for (int j = val; j > i; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < val; i++) {
			for (int j = val - 1; j > i; j--) {
				System.out.print(' ');				
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < val; i++) {
			for (int j = 0; j < val; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println();
		
		List<StarDrawer> arr = new ArrayList<StarDrawer>();
		arr.add(new StarDrawer(1));
		arr.add(new StarDrawer(2));
		arr.add(new StarDrawer(3));
		arr.add(new StarDrawer(4));
		arr.add(new StarDrawer(5));
		
		for (StarDrawer drawer : arr) {
			drawer.print();
		}
		
		
		List<BoardVO> boards = new ArrayList<BoardVO>();
		boards.add(new BoardVO(1, "하하하", "선현민"));
		boards.add(new BoardVO(2, "하하하222", "선현민"));
		boards.add(new BoardVO(3, "하하하444", "선현민"));
		
		BoardVO reply = new ReplyBoardVO(4, "댓글", "최성혁");
		
		boards.add(reply);
		
		for (BoardVO boardVO : boards) {
			System.out.println(boardVO);
			
			if (boardVO instanceof ReplyBoardVO) {
				((ReplyBoardVO)boardVO).whatCallMethod();
			}
		}
	}
	
	public static class ReplyBoardVO extends BoardVO {

		public ReplyBoardVO(int no, String title, String writer) {
			super(no, title, writer);
		}
		
		@Override
		public void test() {
			System.out.println("자식의 test");
		}
		
		public void whatCallMethod() {
			super.test();
		}
		
	}
	
	public static class BoardVO {
		private int boardNo;
		private String title;
		private String writer;
		
		public BoardVO(int no, String title, String writer) {
			this.boardNo = no;
			this.title = title;
			this.writer = writer;
		}
		
		public void test() {
			System.out.println("부모의 test");
		}

		@Override
		public String toString() {
			return String.format("NO: %d / TITLE: %s / WRITER: %s", boardNo, title, writer);
		}
		
	}
	
	public static class StarDrawer {
		private int len;
		public StarDrawer(int len) {
			this.len = len;
		}
		
		public void print() {
			for (int i = 0; i < len; i++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}