import java.util.Scanner;

public class Task6 {

    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int minSum = 100;
        int count = 0;

        for (int i = m; i <= n; i++) {
            int s = digitSum(i);
            if (s < minSum) {
                minSum = s;
                count = 1;
            } else if (s == minSum) {
                count = count + 1;
            }
        }

        System.out.println(count);
    }
}
