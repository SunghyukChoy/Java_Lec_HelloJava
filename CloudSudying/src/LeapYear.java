////////내가 만들긴 했지만 이해 안 됨.



import java.util.Scanner;
public class LeapYear {
  public static void main(String[] args) {
    // 입력값 받기
    int year = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("입력 년도 = ");
    year = in.nextInt();
    boolean isLeapYear = test(year);
    
    

    // 결과 출력
    System.out.printf("%d년은 윤년입니까? %s\n", year, isLeapYear);
  }
  
  public static boolean test(int year) {
    boolean result = false;
    
    if (year % 4 == 0) {
      result = true;
      if (year % 100 == 0) {
        result = false;
        if (year % 1000 == 0) {
          result = true;
        }
      }
    }
    return result;
  }
}