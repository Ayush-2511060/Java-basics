import java.util.*;

public class pattern_12 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scr.nextInt();
        scr.close();
        System.out.println("|==========Pattern==========|");
        int a = 0;
        int b = 1;
        int next = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }

        System.out.println("|===========================|");
    }
}
