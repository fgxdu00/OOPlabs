import java.util.Scanner;

public class Task4 {

    static long f(int m, int n) {
        if (m == 0) {
            return 1;
        }
        if (m == n) {
            return 1;
        }
        return f(m - 1, n - 1) + f(m, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(f(m, n));
    }
}
