
import java.util.Scanner ;
public class checksideoftrangle {
    public static void main(String[] args) {
        Scanner Ti= new Scanner (System.in);

        System.out.print("Enter the first side :- ");
        int side_1  = Ti.nextInt ();
        System.out.print("Enter the second side :- ");
        int side_2 = Ti.nextInt();
        System.out.print("Enter the third side :-");
        int side_3 = Ti.nextInt();

        if((side_1+side_2)>side_3 && (side_2+side_3)>side_1 && (side_3+side_1)>side_2){
            System.out.println(" The triangle is valid ");
        }
        else {
            System.out.println(" The triangle is not valid ");
        }
    }
}
