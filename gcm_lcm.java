import java.util.*;

public  class gcm_lcm {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int number1 = scr.nextInt();
        System.out.print("Enter Second Number: ");
        int number2 = scr.nextInt();
        scr.close();
        int num1 = number1;
        int num2 = number2;
        while (num2 != 0) {
            int remainder = num1%num2;
            num1 = num2;
            num2 = remainder;
        }
        int gcd = num1;
        int multiply = number1 * number2;
        int lcm = multiply/gcd;
        System.out.println("GCD of "+ number1 + " and " + number2 + " is: " + gcd);
        System.out.println("LCM of "+ number1 + " and " + number2 + " is: " + lcm);
    }
}