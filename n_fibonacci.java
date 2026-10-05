import java.util.*;

public class n_fibonacci {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the Number(n): ");
        int n = scr.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("The first " + n + " Fabonacci Numbers are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        scr.close();
    }
}