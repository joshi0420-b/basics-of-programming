// Check the number is odd or even :- 

import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.print("Enter the number :-");
        int num = Sc.nextInt();
        if(num%2==0){
            System.out.println(" Entered number  is even ");
        }
        else {
            System.out.println(" Entered number  is odd ");
        }
    }
}

