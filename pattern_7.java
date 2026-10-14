import java.util.*;

public class pattern_7 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scr.nextInt();
        System.out.println("|==========Pattern==========|");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("    ");
            }
            System.out.println("*");
        }
        System.out.println("|===========================|");
    }
}