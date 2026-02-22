//print Gp = 5,10,20,40,80....;n;

import java.util.Scanner;
public class printGp2 {
    public static void main(String[] args) {
        Scanner Gp = new Scanner (System.in);

        System.out.print("Enter the number :- ");
        int num = Gp.nextInt();

        int a = 5;
        for(int i = 1; i <= num; i++){
            System.out.println( a );
            a = a*2;
        }
    }
}
