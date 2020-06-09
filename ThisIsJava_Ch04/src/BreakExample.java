
public class BreakExample {
	public static void main(String[] ar) {
		while(true) {
			int num = (int)(Math.random() * 6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;		//if문과 break는 관계 없음. 무한반복을 막기 위한 if문 생성.
							//break를 만나면 가장 가까운 반복문인 while문을 빠져나감.
			}
		}
		System.out.println("프로그램 종료");
	}
}
