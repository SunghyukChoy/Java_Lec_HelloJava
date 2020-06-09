
public class Gasoline {
	public static void main(String[] ar) {
		double distance = 182.736;
		double fuel = 8.86;
		double efficiency = caleffi(distance, fuel);
		System.out.printf("연비 : %.2fkm/L", efficiency);
			
		}
	public static double caleffi(double x, double y) {
		return x / y;
	}
	}
	

