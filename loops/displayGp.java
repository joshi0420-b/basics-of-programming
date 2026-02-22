// print Gp = 1,2,4,8,16,.....n;

import  java.util.Scanner;
public class displayGp {
    public static void main(String[] args) {
        Scanner Gp = new Scanner (System.in);

        System.out.print("Enter the number :- ");
        int num = Gp.nextInt();

        int a = 1;
        for(int i=1;i<=num;i++){
            a = 2*a;
            System.out.println(a);
        }
    }
}
