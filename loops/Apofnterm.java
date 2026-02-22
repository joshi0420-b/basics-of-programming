// print the Ap of n Number :-

import java.util.Scanner;
public class Apofnterm {
    public static void main(String[] args) {
        Scanner Ap = new Scanner(System.in);

        System.out.print("Enter the number :- ");
        int num = Ap.nextInt();

        for (int i= 1; i<=(2*num-1); i=i+2) {
            System.out.println(i);
        }
    }
}


