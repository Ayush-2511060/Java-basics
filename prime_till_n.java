import java.util.*;

public class prime_till_n {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the Range(N): ");
        int range = scr.nextInt();
        int number = 2;
        System.out.println("|--------------------------------------|");
        while (number <= range) {
            boolean isPrime = true;
            if (number <= 1) {
                isPrime = false;
            } else{
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            
            if(isPrime){
                System.out.print(number + " ");
            }
            number++;
        }
    }
}
