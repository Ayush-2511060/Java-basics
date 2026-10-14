import java.util.*;

public class pattern_10 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("|=============NOTE=============|");
        System.out.println(" Only Valid For odd value of N.");
        System.out.println("|==============================|");
        System.out.print("Enter the value of N: ");
        int n = scr.nextInt();
        System.out.println("|==========Pattern==========|");
        int mid = (n/2) + 1;
        for(int i = 1; i <= n; i++){
            int place = (mid >= i) ? (i-1) : (n-i) ;
            for(int j = 1; j <= n; j++){
                if (j == (mid-place) || j == (mid+place) ) {
                    System.out.print("*   ");
                }
                else{
                    System.out.print("    ");
                }
            }
            System.out.println("");
        }
        System.out.println("|===========================|");
    }
}