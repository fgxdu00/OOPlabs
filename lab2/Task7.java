import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long n = sc.nextLong();
        long m = sc.nextLong();

        long result = 1;
        x = x % m;

        for (long i = 0; i < n; i++) {
            result = (result * x) % m;
        }

        System.out.println(result);
    }
}
