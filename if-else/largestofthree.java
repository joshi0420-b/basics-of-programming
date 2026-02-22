// Print the largest of three number :- 

import java.util.Scanner;
public class largestofthree {
    public static void main(String[] args) {
        Scanner La = new Scanner (System.in);

        System.out.print("Enter the first number :- ");
        int num_1 = La.nextInt();

        System.out.print("Enter the second number :- ");
        int num_2 = La.nextInt();

        System.out.print("Enter the third number :- ");
        int num_3 = La.nextInt();

        if (num_1 >= num_2 && num_1>= num_3){
            System.out.println(" Number first is largest :- "+num_1);
        }

        else if (num_2 >= num_1 && num_2>= num_3){
            System.out.println("Number second is largest :- "+num_2);
        }

        else {
            System.out.println("Number third is largest :- "+num_3);
        }
    }
}

