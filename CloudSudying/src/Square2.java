

public class Square2 {
    public static void printSquare(double x) {
        System.out.println(x * x);
    }
    public static void main(String[] args) {
        System.out.println("hello"); // Compile Error
        printSquare(5.5); // Compile Error
    }
}
