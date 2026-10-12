import java.util.*;

public class pattern_5 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scr.nextInt();
        System.out.println("|=====Pattern=====|");
        
        int mid = n / 2 + 1;
        
        for (int i = 1; i <= n; i++) {
            int rowDist = (i <= mid) ? i : (n - i + 1);
            for (int j = 0; j < mid - rowDist; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 2 * rowDist - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("|=================|");
    }
}