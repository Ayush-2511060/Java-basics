import java.util.*;

public class pattern_14 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scr.nextInt();
        scr.close();
        System.out.println("|==========Table==========|");
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " X " + i + " = " + (n*i));
        }
        System.out.println("|=========================|");
    }
}
