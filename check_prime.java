import java.util.*;

public class check_prime {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter Numbers count: ");
        int count = Integer.parseInt(scr.nextLine());
        while (count > 0) {
            System.out.println("--------------------------");
            int number = Integer.parseInt(scr.nextLine());
            boolean isPrime = true;
            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(number + " is a prime number.      ");
            } else {

                System.out.println(number + " is not a prime number. ");
            }
            count--;
        }
    }
}