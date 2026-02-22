//print the sum of the series :- 1+2+3+4+.... up to n;

import java.util.Scanner;
public class Sumofseries {
    public static void main(String[] args) {
        Scanner Su = new Scanner (System.in);

        System.out.print("Enter the number :- ");
        int num = Su.nextInt();

        int ans = 0;
        for(int i = 1; i <= num; i++){
            ans += i;
        }
        System.out.println(ans);
    }
}
