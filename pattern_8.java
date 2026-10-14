import java.util.*;

public class pattern_8 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scr.nextInt();
        System.out.println("|==========Pattern==========|");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--) {
                if (j == i) {
                    System.out.print("*___ ");
                } else {
                    System.out.print("___ ");
                }
            }
            System.out.println("");
        }
        System.out.println("|===========================|");
        /**
         * Pattern 8: Diagonal Asterisk with Underscore Spacing
         * 
         * Note: '_' characters are used to visually represent spacing.
         * Triple underscores ('___ ') simulate tab or space offsets for grid alignment.
         */
    }
}