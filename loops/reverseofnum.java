//print the reverse of any given number :-- ;

import java.util.Scanner ;
public class reverseofnum {
    public static void main(String[] args) {
        Scanner Re = new Scanner (System.in);

        System.out.print(" Enter the number :- ");
        int num = Re.nextInt();

        int ans = 0;
        while(num >0){
            ans = ans * 10 + num % 10;
            num /= 10;
        }
        System.out.println(ans);
    }
}
