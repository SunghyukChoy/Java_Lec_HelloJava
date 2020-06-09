
public class Diet {
	public static void main(String[] ar) {
		
		double weight = 80.0;
		double height = 1.83;
		
		double bmi = calculate(weight, height);
		System.out.printf("BMI = %.2f(%.1fkg, %.2fm)\n", bmi, weight, height);
		System.out.printf("결과 = %s", result(bmi));
	}
	public static double calculate (double weight, double height) {
		return weight / (height * height);
	}
	public static String result (double bmi) {
		String result = "";
		if (bmi >= 30) {
			result = "비만입니다";
		}
		else if (bmi >= 25) {
			result = "과체중입니다.";
		}
		else if (bmi >= 18.5) {
			result = "정상입니다";
		}
		else {
			result = "저체중입니다.";
		}
		return result;
	}
}
