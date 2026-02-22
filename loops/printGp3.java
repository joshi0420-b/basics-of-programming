//print Gp = 100,50,25,12.5....n;

import java.util.Scanner ;
public class printGp3 {
    public static void main(String[] args) {
        Scanner Gp = new Scanner (System.in);

        System.out.print(" Enter the number :- ");
        int n = Gp.nextInt();

        double a = 100;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a = a * 0.5;
        }
    }
}
