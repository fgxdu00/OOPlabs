import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        boolean hasEven = (a % 2 == 0) || (b % 2 == 0) || (c % 2 == 0);
        boolean hasOdd = (a % 2 != 0) || (b % 2 != 0) || (c % 2 != 0);

        if (hasEven && hasOdd) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}