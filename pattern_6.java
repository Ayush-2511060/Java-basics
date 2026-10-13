import java.util.*;


public class pattern_6 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scr.nextInt();
        System.out.println("|=====Pattern=====|");
        int mid = n / 2 + 1;
        int sp = 1;
        for(int i = 1; i <= n; i++){
            System.out.println(mid + ", " + sp + ", " + mid);
            if(i <= n/2){
                mid--;
                sp += 2;
            } else {
                mid++;
                sp -= 2;
            }

        }
        System.out.println("|=================|");
    }
}