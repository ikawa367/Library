import java.util.Scanner;

public class ok {

    public static int recFib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return (recFib(n - 1) + recFib(n - 2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        long fib = recFib(input);
        System.out.print(fib);
    }
}