import  java.util.*;

public class Pythagorean_triplets {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scr.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scr.nextInt();
        System.out.print("Enter third number: ");
        int number3 = scr.nextInt();
        boolean flag = false;
        int max = number1;
        if (max <= number2) {
            max = number2;
        }
        if (max <= number3) {
            max = number3;
        }
        if (max == number1) {
            flag = ((number2 * number2 + number3 * number3) == (number1*number1));
        } else if (max == number2) {
            flag = ((number1 * number1 + number3 * number3) == (number2*number2));
        } else {
            flag = ((number1 * number1 + number2 * number2) == (number3*number3));
        }
        
        System.out.println("|========================|");
        if (flag) {
            System.out.println("|          " + flag + "          |");
            System.out.println("|========================|");
        } else {
            System.out.println("|          " + flag + "         |");
            System.out.println("|========================|");
        }
    }
}