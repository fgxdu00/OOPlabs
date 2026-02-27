import java.util.Scanner;

public class Task7 {

    static long combinations(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        long result = 1;
        for (int i = 0; i < k; i++) {
            result = result * (n - i);
            result = result / (i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(combinations(n, k));
    }
}
