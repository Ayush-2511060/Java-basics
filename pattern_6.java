import java.util.*;


public class pattern_6 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("|==========NOTE==========|");
        System.out.println("This program works better for odd Value of N.");
        System.out.println("|========================|");
        System.out.print("Enter the value of N: ");
        int n = scr.nextInt();
        System.out.println("|=====Pattern=====|");
        int mid = n / 2 + 1;
        int sp = 1;
        int j;
        for(int i = 1; i <= n; i++){
            for(j = 1; j <= mid; j++){
                System.out.print("*  ");
            }
            for(j = 1; j <= sp; j++){
                System.out.print("   ");
            }
            for(j = 1; j<=mid; j++){
                System.out.print("*  ");
            }
            if(i <= n/2){
                mid--;
                sp += 2;
            } else {
                mid++;
                sp -= 2;
            }
            System.out.println("");

        }
        System.out.println("|=================|");
    }
}