//print the factorial of a given number is inputed by user :-;

import java.util.Scanner;
public class factorialofnum {
    public static void main(String[] args) {
        Scanner Fa = new Scanner(System.in);

        System.out.print(" Enter the number :- ");
        int num = Fa.nextInt();

        int i=1;
        int ans = 1;
        for(i=1;i<=num; i++){
            ans *=i;
        }
        System.out.println(ans);
    }
}
