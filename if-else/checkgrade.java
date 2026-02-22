// Program check the Grad :-

import java.util.Scanner;
public class checkgrade {
    public static void main(String[] args) {
        Scanner Ch = new Scanner (System.in);

        System.out.print("Enter the grade :- ");
        int num = Ch.nextInt();

        if (num>=91 && num<100){
            System.out.println("Your grade is A and performance is excellent ");
        }

        else if (num>=81 && num<=90){
            System.out.println("Your grade is B and performance is very good ");
        }

        else if (num>=71 && num<=80){
            System.out.println("Your grade is C and performance is good");
        }
        else if (num>=61 && num<=70){
            System.out.println("Your grade is D and you can do better ");
        }
        else if (num>=51 && num<60){
            System.out.println("Your grade is E and you are very average");
        }
        else {
            System.out.println("very low performance ");
        }
    }
}


