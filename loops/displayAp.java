//print Ap = 4,7,10,13,.....n;

import java.util.Scanner;
public class displayAp {
    public static void main(String[] args) {
        Scanner Ap = new Scanner(System.in);

        System.out.print("Enter the number :- ");
        int num = Ap.nextInt();

//        for(int i = 4; i<=(2*num-1);i+=3)
//        {
//            System.out.println(i);
//        }

        int a= 4;
        for(int i=1;i<=num;i++){
            a = a +3 ;
            System.out.println(a);
        }
    }
}
