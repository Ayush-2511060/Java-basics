import java.util.*;

public class pattern_4 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scr.nextInt();
        System.out.println("|=====Pattern=====|");
        for(int i = n; i>0; i--){
            for(int j = n-i; j >0; j--){
                System.out.print("  ");
            }
            for(int k = i; k > 0; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("|=================|");
    }
}