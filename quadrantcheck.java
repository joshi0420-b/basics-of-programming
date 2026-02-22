package basics;
import java.util.Scanner;

public class quadrantcheck {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the x :- ");
        int x = Sc.nextInt();
        System.out.print("Enter the y :- ");
        int y = Sc.nextInt();

        if(x>0 && y>0){
            System.out.println("Entered points are laying in First quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("Entered points are laying in Second quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("Entered points are laying in Third quadrant");
        }
        else if(x>0 && y<0){
            System.out.println("Entered points are laying in Fourth quadrant");
        }
        else {
            System.out.println("Entered points are in origin");
        }

    }
}
