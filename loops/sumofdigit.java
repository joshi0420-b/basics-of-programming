// print the sum of digit any number :-

import java.util.Scanner;
public class sumofdigit {
    public static void main(String[] args) {
        Scanner Su = new Scanner (System.in);

        System.out.print(" Enter the number :- ");
        int num = Su.nextInt();

        int num_sum = 0;
        while(num>0){
            num_sum += num%10;
              num /=10;
        }
        System.out.println(num_sum);
    }
}
