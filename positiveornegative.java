package basics;
import java.util.Scanner ;

public class positiveornegative {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the number :- ");
        int num = Sc.nextInt();

        if(num>0){
            System.out.println(num+" Number is positive");
        }
        else if(num<0){
            System.out.println(num+" Number is negative");
        }
        else{
            System.out.println("Number is zero");
        }
    }
}
