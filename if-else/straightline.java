// Checking Entered points are making a Straight line or not :- 

import java.util.Scanner ;
public class straightline {
    public static void main(String[] args) {
        Scanner St = new Scanner (System.in);

        System.out.println("Enter x1, y1 :- ");
        double x1 = St.nextDouble();
        double y1 = St.nextDouble();

        System.out.println("Enter x2, y2 :- ");
        double x2 = St.nextDouble();
        double y2 = St.nextDouble();

        System.out.println("Enter x3, y3 :- ");
        double x3 = St.nextDouble();
        double y3 = St.nextDouble();

        double m1 = (y2-y1) / (x2-x1);
        double m2 = (y3-y2) / (x3-x2);

        if (m1 == m2){
            System.out.println("Entered points make a Straight line");
        }
        else {
            System.out.println("Entered points does not make a Straight line");
        }
    }
}

