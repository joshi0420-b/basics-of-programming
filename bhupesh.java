package basics;
import java .util.Scanner;

public class bhupesh {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the number :- ");
        int num = Sc.nextInt();

        if(num%2==0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
