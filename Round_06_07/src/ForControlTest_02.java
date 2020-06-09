import java.util.Scanner;
public class ForControlTest_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int begin = 0, end = 0, multiple = 0, total = 0;
		int imsi = 0;  
		
		System.out.print("시작 수 = ");
		begin = in.nextInt();
		
		System.out.print("마지막 수 = ");
		end = in.nextInt();
		
		System.out.print("배수 = ");
		multiple = in.nextInt();
		
		if(begin > end) {
			imsi = begin;
			begin = end;
			end = imsi;
		}
		
		for(int n = begin; n <= end; ++n) {
			if(n % multiple == 0) {
			total += n; 
			}
		}
		
		System.out.println();
		System.out.println(begin + " ~ " + end + " 사이 수 중 " + multiple + "의 배수의 합은 " + total);
		
		in.close();
		
	}
}
