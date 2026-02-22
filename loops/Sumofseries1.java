//print the sum of the series 1-2+3-4+5-......n, n is given by user

import java.util.Scanner;
public class Sumofseries1 {
    public static void main(String[] args) {
        Scanner  Su = new Scanner (System.in);

        System.out.print(" Enter the number :- ");
        int num= Su.nextInt();

        int ans = 0;
        for(int i=0; i<=num; i++){
            if(i%2!=0){
                ans += i;
            }
            else{
                ans -= i;
            }
        }
        System.out.println(ans);
    }
}
