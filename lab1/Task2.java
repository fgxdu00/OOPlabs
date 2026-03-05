import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        if (n < 0) {
            n = -n;
        }

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int sum = 0;
        while (n > 0) {
            int digit = (int)(n % 10);
            sum = sum + digit;
            n = n / 10;
        }

        System.out.println(sum);
    }
}