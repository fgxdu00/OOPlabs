import java.util.Scanner;

public class Task8 {

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = lcm(result, i);
        }

        System.out.println(result);
    }
}