import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        sc.close();

        int boysRooms = (n + k - 1) / k;
        int girlsRooms = (m + k - 1) / k;

        System.out.println(boysRooms + girlsRooms);
    }
}