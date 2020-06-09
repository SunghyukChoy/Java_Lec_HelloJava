/* 아래의 등급 기준을 참고하여, 출력 예와 같은 결과를 얻으시오.

A - 모든 요소가 4.0 이상
B - 총점 10점 이상이면서, 적어도 하나가 4.0 이상
C - 그 외

출력 예
X -> A등급
Y -> B등급
Z -> C등급

*/
public class DatingApp {
  public static void main(String[] args) {
    // 평가
    String x = rating(4.2, 4.7, 4.3);
    String y = rating(3.8, 4.1, 3.5);
    String z = rating(3.6, 3.0, 3.4);
    
    // 출력
    System.out.printf("X -> %s등급\n", x);
    System.out.printf("Y -> %s등급\n", y);
    System.out.printf("Z -> %s등급\n", z);
  }
  
  public static String rating(double personality, double look, double ability) {
    String result = "";
    double sum = personality + look + ability;
    if (personality > 4.0 && look > 4.0 && ability > 4.0) {
      result = "A";
    } else if ((sum >= 10.0) && (personality > 4.0 || look > 4.0 || ability > 4.0)
    		) {
      result = "B";
    } else {
      result = "C";
    }
    return result;
  }
}