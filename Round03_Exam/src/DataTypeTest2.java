/* 자료형의 입출력 범위
 * boolean : 1byte (true, false)
 * byte : 1byte (-128 ~ 127) // 총 256개의 경우의 수 -2^7 ~ 2^7개. 첫번째 bit가 0이고 나머지 7bit가 움직이면 양의 수, 반대의 경우는 음의 수. signed 자료형의 경우 첫번째 bit를 부호로 씀
 *                           // ~ 128이 아닌 127까지인 이유는 0을 양수로 인식.
 * char : 2byte ( 0 ~ 65535)
 * short: 2byte (-32768 ~ 32767)
 * int, long, float, double 교재 참조
 * char는 0부터 시작에 65535까지 양수로만 존재. 따라서 첫번째 bit가 부호 bit 로 쓰일 필요가 없으므로 32767까지가 아님. 문자를 나타내는데 사용하므로 음의 부호가 필요없다.
 */
public class DataTypeTest2 {
	public static void main(String[] ar) {
		// 1bit = 0 or 1 2^1개의 경우의 수
		// 2bit = 00 or 01 or 10 or 11 2^2개
		// 3bit = 2^3개 = 8개
		// 4bit = 16개
		// 5bit = 32
		// 6bit = 64
		// 7bit = 128
		// 8bit = 256 => 1byte
		// 1byte는 8bit로 나타낼 수 있는 경우의 수. bit라는 8개의 공간이 있고 그 공간 안에 1 or 0 을 넣을 수 있다.
		byte aa = 120;
		// byte bb = 128; //byte의 범위는 -128 에서 127까지
		char cc = 'A'; //문자
		char dd = '\u0041'; //유니코드 표현식
		char ee = 65; //아스키 코드
		byte gg = 65;
		System.out.println(aa);
		System.out.println(cc);
		System.out.println(dd);
		System.out.println(ee);
		System.out.println(gg);
		
		byte ff = 127; // -128...-127...0..1..2..127...-128..-127순으로 돈다
		// ++(증가),--(감소)
		ff++; // 1 증가 위해
		System.out.println(ff); // 출력값은 128이 아닌 -128
		ff++;
		System.out.println(ff);  // 출력값 -127
		
	} 
}

// 가장 큰 자료형을 쓰지 않는 이유는 메모리 낭비 방지. 탁구공은 탁구공을 넣는 상자에. 축구공은 축구공을 넣는 상자에.
// 
