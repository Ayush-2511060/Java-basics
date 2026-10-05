import java.util.*;

public class Take_input {
    public static void main(String[] args) {
        System.out.println("Enter your name then the number:");
        Scanner scr = new Scanner(System.in);
        String name = scr.nextLine();
        int n = Integer.parseInt(scr.nextLine());
        System.out.println("|===============================|");
        System.out.println("Hello! " + name);
        System.out.println("|-----Here is the counting-----|");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        scr.close();
    }
}
