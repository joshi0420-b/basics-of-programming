// Count the number of digit :- ;

import java.util.Scanner;
public class countnumofdigit {
    public static void main(String[] args) {
        Scanner Co = new Scanner (System.in);

        System.out.print(" Enter the number :- ");
        int num = Co.nextInt();

        int ans = 0;
        while(num>0){
            num /=10;
            ans++;
        }
        System.out.println(ans);
    }
}
