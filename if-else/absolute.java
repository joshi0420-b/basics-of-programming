
import java.util.Scanner;
public class absolute {
    public static void main(String[] args) {
        Scanner Ab = new Scanner (System.in);

        System.out.print("Enter the number :- ");
        int num =Ab.nextInt();

        if(num>0){
            num = (num*1);
            System.out.println("the absolute number is "+num);
        }
        else if (num<0){
            num = (num*-1);
            System.out.println("the absolute number is "+num);
        }
    }
}
