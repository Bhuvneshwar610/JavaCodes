import java.util.Scanner;
public class factorial {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // Question 4 : Write a program to find the factorial value of any number entered by the user as an input. 

        System.out.print("Enter a number :: ");

        int num = in.nextInt();
        int sum = 1;
        for(int i=1; i<=num; i++){
            sum = sum*i;
        }

        System.out.print(sum);

    }
    
}
