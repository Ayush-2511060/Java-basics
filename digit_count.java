import java.util.*;

public class digit_count {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scr.nextInt();
        int number = num;
        int count = 0;
        if (num == 0) {
            count++;
        }
        while(number >  0){
            number = number / 10;
            count++;
        }
        System.out.println("Total digits in "+ num + " are: " + count);
    }
}
