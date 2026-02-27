import java.util.Scanner;

public class Task4 {

    static long findMax(long n) {
        long max = n;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int id = sc.nextInt();
            long n = sc.nextLong();
            System.out.println(id + " " + findMax(n));
        }
    }
}
