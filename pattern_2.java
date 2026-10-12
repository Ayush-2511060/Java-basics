import java.util.*;

public class pattern_2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scr.nextInt();
        System.out.println("|=====Pattern=====|");
        for(int i = n; i>0; i--){
            for(int j = i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("|=================|");
    }
}