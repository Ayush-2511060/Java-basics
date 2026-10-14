import java.util.*;

public class pattern_9 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scr.nextInt();
        System.out.println("|==========Pattern==========|");
        for(int i = 0; i <n; i++){
            for(int j = 0; j <n; j++){
                if (j == (n-i-1) || j == i) {
                    System.out.print("*   ");
                } else{
                    System.out.print("    ");
                }
            }
            System.out.println("");
        }
        System.out.println("|===========================|");
    }
}