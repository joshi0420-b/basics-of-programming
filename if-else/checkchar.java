
import java.util.Scanner ;
public class checkchar {
    public static void main(String[] args) {
        Scanner Ch = new Scanner(System.in);

        System.out.print(" Enter the character which you want check :- ");
        char x = Ch.next().charAt(0);

        if(x>'a' && x<='z'){
            System.out.println(" Entered character is Small case ");
        }
        else if (x>='A' && x<='Z'){
            System.out.println(" Entered character is Capital case ");
        }
        else if (x>='0' && x<='9'){
            System.out.println(" Entered character is Digit ");
        }
        else {
            System.out.println(" Entered character is Speical character ");
        }
    }
}
