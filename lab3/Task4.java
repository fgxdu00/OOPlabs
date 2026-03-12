import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        for (int i = a; i <= b; i++) {
            System.out.print((i * i) + " ");
        }

        System.out.println();

        for (int i = b; i >= a; i--) {
            System.out.print((i * i * i) + " ");
        }
    }
}