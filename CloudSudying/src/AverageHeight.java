/* public class AverageHeight {
	public static void main(String[] ar) {
		test(true, 189.2);
		test(false, 166.2);
		test(false, 158.1);
		test(true, 170.1);
	}

	public static void test(boolean isMale, double height) {
		String gender = "";
		String result = "";
		if (isMale = true) {           // isMale 값을 넣어줄 필요 없이 "isMale"만 입려.
			gender = "남성";
			if (height >= 173.5) {
				result = "이상";
			} else {
				result = "이하";
			}
		} else {
			gender = "여성";
			if (height >= 160.8) {
				result = "이상";
			} else {
				result = "이하";
			}
		}
		System.out.printf("%.1f -> %s 평균키 %s입니다\n", height, gender, result);
	}

} */

public class AverageHeight {
  public static void main(String[] args) {
    test(true, 176.3);  // 남성 176.3cm
    test(false, 162.7); // 여성 162.7cm
    test(true, 171.8);  // 남성 171.8cm
    test(false, 158.4); // 여성 158.4cm
  }
  
  public static void test(boolean isMale, double height) {
    String gender = "";
    String result = "";
    
    if (isMale) {
      gender = "남성";
      if (height >= 173.2) {
        result = "이상";
      } else {
        result = "이하";
      }
    } else {
      gender = "여성";
      if (height >= 160.8) {
        result = "이상";
      } else {
        result = "이하";
      }
    }
    System.out.printf("%.1f -> %s 평균키 %s입니다.\n", height, gender, result);
  }
}