import java.util.Scanner;
public class power {
    public static void main(String[] args){

        //ENTER TWO NUMBERS FIRST NUMBER POWER OF SECOND NUMBER

        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers :: ");
       
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = 1;

        for(int i=1; i<=num2; i++){
            sum=sum*num1;
        }

        System.out.println(sum);


    }
}
