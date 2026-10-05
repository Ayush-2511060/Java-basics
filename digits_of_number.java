import java.util.*;

public class digits_of_number {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scr.nextInt();
        if (num == 0) {
            System.out.println(num);
            return;
        }
        int temp = num;
        int divisor = 1;
        while (temp > 10) {
            divisor *= 10;
            temp /= 10;
        }
        System.out.print("Digits are: ");

        while (divisor > 0) {
            int digit = num/divisor;
            System.out.print(digit + ", ");
            num = num%divisor;
            divisor /= 10;
        }
    }
}
