
import java.util.Scanner;
public class liyinginbetween {
    public static void main(String[] args) {
        Scanner Li = new Scanner (System.in);

        System.out.print("Enter the number which you want check :- ");
        int num = Li.nextInt();

        if( num>99 && num<=999){
            System.out.println("Entered number is laying between 3 digit ");
        }
        else {
            System.out.println("Entered number is not laying between 3 digit ");
        }
    }
}
