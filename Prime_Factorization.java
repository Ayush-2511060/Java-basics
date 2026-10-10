import java.util.*;

public class Prime_Factorization {
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scr.nextInt();
        
        for(int i = 2 ; i*i <= n ; i++){
            while (n%i == 0) {
                n /= i;
                System.out.println(i);
            }
        }
        if (n!=0) {
            System.out.println(n);
        }
    }
}
