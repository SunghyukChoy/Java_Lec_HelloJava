/*이름: 
학번: 2018122104
신장: 1.78m
남자인가요? true
 * 
 */
public class Profile {
	public static void main(String[] ar) {
		String name = "최성혁";
		int num = 2006030035;
		double height = 1.87;
		boolean sex = true;
		
		System.out.printf("이름 : %s \n학번 : %d \n키 : %.2fm \n", name, num, height);
		System.out.println("남자입니까? " + sex);
	}
}
