import java.util.Scanner;

public class Task5 {

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
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int minSum = digitSum(a[0]);
        int result = a[0];

        for (int i = 1; i < n; i++) {
            int s = digitSum(a[i]);
            if (s <= minSum) {
                minSum = s;
                result = a[i];
            }
        }

        System.out.println(result);
    }
}
