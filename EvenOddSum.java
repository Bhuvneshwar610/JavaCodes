import java.util.*;
public class EvenOddSum {
    
    
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        System.out.print("Enter the number :: ");
        int n = in.nextInt();
       System.out.println("EVen number " + Even(n));
       System.out.println("odd number " + odd(n));




    }


    static int Even(int n){
        int sum = 0;
        for(int i=2; i<=n; i+=2){
            sum=sum+i;
        }
        return sum;
    }


    static int odd(int n){
        int sum =0;
        for(int i=1; i<=n; i+=2){
            sum=sum+i;
        }
        return sum;
    }
}
