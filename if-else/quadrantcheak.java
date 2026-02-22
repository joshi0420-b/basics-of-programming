// Checking the point is laying in which quadrant :- 

import java.util.Scanner ;
public class quadrantcheak {
    public static void main(String[] args) {
        Scanner Qu = new Scanner (System.in);

        System.out.println("Enter x ,y :- ");
        int x = Qu.nextInt();
        int y = Qu.nextInt();

        if(x==0 && y==0){
            System.out.println(" Entered points are laying in origin ");
        }
        else if (x>0 && y>0){
            System.out.println(" Entered points are laying in first quadrant ");
        }
        else if (x<0 && y>0){
            System.out.println(" Entered points are laying in second quadrant ");
        }
        else if (x<0 && y<0){
            System.out.println(" Entered points are laying in third quadrant ");
        }
        else {
            System.out.println("Entered points are laying in fourth quadrant ");
        }
    }
}

