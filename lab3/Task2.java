import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long h = sc.nextLong();
        long w = sc.nextLong();
        long l = sc.nextLong();
        long k = sc.nextLong();

        sc.close();

        long volume = h * w * l;
        long batteries = (volume + k - 1) / k;

        System.out.println(batteries);
    }
}