import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        if (n == 0) {
            System.out.println(1);
            return;
        }

        int count = 0;
        while (n > 0) {
            n = n / 10;
            count = count + 1;
        }

        System.out.println(count);
    }
}