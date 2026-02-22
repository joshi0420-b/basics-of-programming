// print Gp = 3,12,48,....n;

import java.util.Scanner;
public class printGp1 {
    public static void main(String[] args) {
        Scanner Gp =new Scanner  (System.in);

        System.out.print(" Enter the number :- ");
        int  num = Gp.nextInt();

        int a = 3;
        for(int i=1;i<=num;i++){
            System.out.println(a);
            a = a*4;
        }
    }
}
