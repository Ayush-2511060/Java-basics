import java.util.*;

public class Benjamin_bulbs {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int number = scr.nextInt();
        System.out.println("|========================|");
        System.out.println("Number of ON bulbs: ");
        for(int i = 1; i * i<= number; i++){
            System.out.print(i*i + " ");
        }
        System.out.println("");
        System.out.println("|========================|");
    }
    
}