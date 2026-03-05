import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // F(0) = 1, F(1) = 1
        if (n == 0 || n == 1) {
            System.out.println(1);
            return;
        }

        long prev = 1;
        long curr = 1;
        for (int i = 2; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }

        System.out.println(curr);
    }
}