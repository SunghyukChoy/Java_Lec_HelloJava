
public class RareItem {
	public static void main(String[] ar) {
		wearItem (1800, 2000);
		wearItem ( 2200, 2100);
	}
	public static void wearItem(int hp, int mp) {
		if(hp > 2000 && mp > 2000) {
			System.out.println("아이템이 착용되었습니다.");
		}
		else {
		System.out.println("아이템을 착용할 수 없습니다.");
		}
}
}