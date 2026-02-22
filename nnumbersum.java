package basics;
import java.util.Scanner;

public class nnumbersum {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = Sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is: " + sum);
    }
}
