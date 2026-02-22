// print  the n number ;

import java.util.Scanner;
public class printnnum {
    public static void main(String[] args) {
        Scanner Pr = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = Pr.nextInt();

        for (int i = 0; i <= num; i++) {
                System.out.println( i );
            }
        }
    }
