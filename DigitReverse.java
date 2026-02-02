import java.util.Scanner;
public class DigitReverse {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number :: ");
        int num = input.nextInt();
        int rev = 0;

        while(num != 0){
            rev= num%10;

            num = num/10;
        }
        System.out.print(rev);
    }
}
