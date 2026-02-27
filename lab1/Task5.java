import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long n = sc.nextLong();

        long result = 1;
        for (long i = 0; i < n; i++) {
            result = result * x;
        }

        System.out.println(result);
    }
}
