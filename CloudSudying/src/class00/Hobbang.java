package class00;

public class Hobbang {
	public static void main(String[] ar) {
		bbang H1 = new bbang();
		bbang H2 = new bbang();
		bbang H3 = new bbang();

		H1.contents = "야채";
		H1.price = 500;
		System.out.println(H1.info()); // H1.info()의 리턴값을 대입해줌.

		H2.contents = "피자";
		H2.price = 700;
		System.out.println(H2.info());

		H3.contents = "팥";
		H3.price = 1000;
		System.out.println(H3.info());

	}
}
class bbang {
	String contents;
	int price;

	String info() {
		return String.format("%s호빵 : %d원", contents, price);
	}
}
