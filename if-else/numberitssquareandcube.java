package basics;
import java.util.Scanner;

public class numberitssquareandcube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number :- ");
        int num = input.nextInt();

        int square = num*num;
        int cube = num*num*num;

        System.out.println("Square of number is :- "+square);
        System.out.println("Cube of number is :- "+cube);
    }
}
