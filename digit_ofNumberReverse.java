import java.util.Scanner;
import java.util.*;

public class digit_ofNumberReverse {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = scr.nextInt();
        int number = num;
        if (number == 0) {
            System.out.println(number);
        }
        while (number > 0) {
            int digit = number%10;
            System.out.print(digit + ", ");
            number = number/10;
        }
    }
}
