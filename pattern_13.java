import java.util.*;

public class pattern_13 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scr.nextInt();
        scr.close();
        System.out.println("|==========Pattern==========|");
        for(int i = 0; i < n; i++){
            int icj = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(icj + "\t");
                int value = ( icj * (i-j))/(j+1);
                icj = value;
            }
            System.out.println("");
        }
        System.out.println("|===========================|");
    }
}