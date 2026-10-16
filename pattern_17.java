// Pattern When the Value of N is 5

// |==========Pattern==========|
//           *
//           *    *
// *    *    *    *    *
//           *    *
//           *
// |===========================|

import java.util.*;
public class pattern_17 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the Value of N: ");
        int n = scr.nextInt();
        scr.close();
        System.out.println("|==========Pattern==========|");
        int sp = n/2;
        int st = 1;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j <= sp; j++){
                if(i == n/2+1){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            for(int j = 1; j <= st; j++){
                System.out.print("*\t");
            }
            if(i <= n/2){
                st++;
            } else {
                st--;
            }
            System.out.println("");
        }
        System.out.println("|===========================|");
    }
}