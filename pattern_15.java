import java.util.*;

public class pattern_15 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scr.nextInt();
        scr.close();
        System.out.println("|==========Pattern==========|");
        int mid = (n / 2);
        int st = 1;
        int value = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= mid; j++) {
                System.out.print("\t");
            }
            int cvalue = value;
            for (int j = 1; j <= st; j++) {
                System.out.print(cvalue + "\t");
                if (j <= st / 2) {
                    cvalue++;
                } else {
                    cvalue--;
                }
            }
            if (i <= n / 2) {
                mid--;
                st += 2;
                value++;
            } else {
                mid++;
                st -= 2;
                value--;
            }
            System.out.println("");
        }
        System.out.println("|===========================|");
    }
}