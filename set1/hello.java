import java.util.Scanner;
public class hello {
    public static void main(String []args){
        
        // Question 2 : Write a program to calculate the sum of first n natural number

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :: ");

        long  num = input.nextLong();
        long  sum = num*(num+1)/2;
        // for(long i=1; i<=num; i++){
        //     sum = sum+i;
        // }

        System.out.println(sum);
    }
}
