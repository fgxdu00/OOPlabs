import java.util.Scanner;

public class Task2 {

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long result = sc.nextLong();
        for (int i = 1; i < n; i++) {
            long x = sc.nextLong();
            result = gcd(result, x);
        }

        System.out.println(result);
    }
}
