package basics;
import java.util.Scanner;

public class reverseofnumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the number :- ");
        int num = Sc.nextInt();

        int orignal = num;

        int ans = 0;
        while(num>0){
            ans = ans*10+num%10;
            num/=10;
        }
        System.out.println("The reversed number is : "+ans);

        if(orignal==ans){
            System.out.println("Also number is palindrome");
        }
        else{
            System.out.println(" number is not palindrome");
        }
    }
}
