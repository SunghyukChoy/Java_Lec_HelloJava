//반지름이 7, 높이가 5인 원기둥의 부피: 769.7

public class CylinderVolume {
	public static void main(String[] ar) {
		int r = 7;
		int h = 5;
		double v = volume(r, h);
		System.out.printf("반지름이 %d 높이가 %d인 원기둥의 부피: %.1f", r, h, v);
	}
	public static double volume(double r, double h) {
		return  Math.PI * r * r * h;
	}
}
