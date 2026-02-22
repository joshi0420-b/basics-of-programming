// check the number is divisable by 3 & 5 :- 

import java.util.Scanner ;
public class divisibleby {
    public static void main(String[] args) {
        Scanner Di = new Scanner (System.in);

        System.out.print("Enter the number :- ");
        int num  = Di. nextInt();

        if(num%3==0 && num%5==0){
            System.out.println("Entered number is divisible by 3 and 5");
        }
        else {
            System.out.println("Entered number is not divisible by 3 and 5");
        }
    }
}

