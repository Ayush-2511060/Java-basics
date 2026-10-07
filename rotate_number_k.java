import java.util.*;

public class rotate_number_k {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scr.nextInt();
        System.out.print("Enter the number of rotation: ");
        int k = scr.nextInt();
        scr.close();
        if (number == 0) {
            System.out.println("Rotated number is: 0");
            return;
        }
        int num = number;
        int digit_count = 0;
        while (num > 0) {
            num /= 10;
            digit_count++;
        }
        k = k % digit_count;
        if (k < 0) {
            k = k + digit_count;
        }
        int divide = 1;
        int multiply = 1;
        for (int i = 1; i <= digit_count; i++) {
            if (i <= k) {
                divide *= 10;
            } else {
                multiply *= 10;
            }
        }
        int q = number / divide;
        int r = number % divide;
        int rotated_number = r * multiply + q;
        System.out.println("Rotated number is: " + rotated_number);
    }
}