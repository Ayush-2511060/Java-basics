import java.util.*;

public class pattern_11 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scr.nextInt();
        scr.close();
        System.out.println("|==========Pattern==========|");
        int value = 1;
        for(int i =1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(value + "\t");
                value++;
            }
            System.out.println();
        }
        System.out.println("|===========================|");
    }
}
