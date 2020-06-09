public class WhatIsWrong {
  public static void main(String[] args) {
    int a = square(3);
    int b = cube(2);
    System.out.printf("a = %d, b = %d\n", a, b);
  }

  public static int square(int n) {
    return n * n;
  }

  public static int cube(int n) {
    return n * n * n;
  }
}