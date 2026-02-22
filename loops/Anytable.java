//print the table of any number ;

import java. util.Scanner ;
public class Anytable {
    public static void main(String[] args) {
        Scanner An = new Scanner (System.in);

        System.out.print( "Enter the number which table you want :- ");
        int num = An.nextInt();

        for(int i = num; i<=num*10; i+=num ){
            System.out.println( i );

        }
    }
}
