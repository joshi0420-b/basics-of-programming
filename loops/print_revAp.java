//print Ap = 100,97,94,.... to 0;

import java.util.Scanner;
public class printAp1 {
    public static void main(String[] args) {
        Scanner Ap = new Scanner (System.in);

        System.out.print( "Enter the number :- ");
        int num  = Ap.nextInt();

        int a = 100;
        for( int i = 1; a >= num; i++ ){
            System.out.println(a);
            a = a-3;
        }
    }
}
