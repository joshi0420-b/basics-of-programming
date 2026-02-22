// Checking the number is positive negative or zero :- 

import java.util.Scanner;
public class positivenegativeorzero {
    public static void main(String[] args) {
        Scanner Ab = new Scanner (System.in);

        System.out.print("Enter the number which you want to check :- ");
        int num =Ab.nextInt();

        if(num>0){
            System.out.println("Entered number is positive");
        }
        else if(num<0){
            System.out.println("Entered number is negative");
        }
        else{
            System.out.println("Entered number is zero");
        }
    }
}

