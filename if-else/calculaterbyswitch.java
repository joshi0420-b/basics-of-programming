
import java.util.*;
public class calculaterbyswitch {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);

        System.out.print("Enter the number first :- ");
        int num1 = Sc.nextInt();
        System.out.print("Enter the operator :- ");
        char operator = Sc.next().charAt(0);
        System.out.print("Enter the Second number :- ");
        int num2 = Sc.nextInt();

        switch(operator){
            case '+':
                System.out.println("output :- "+(num1+num2));
                break;
            case '-':
                System.out.println("output :- "+(num1-num2));
                break;
            case '*':
                System.out.println("output :- "+(num1*num2));
                break;
            case '/':
                System.out.println("output :- "+(num1/num2));
                break;
            case '%':
                System.out.println("output :- "+(num1%num2));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
