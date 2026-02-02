import java.util.Scanner;

public class table {
   public static void main(String[] args){
     //write program that print a table enter any number 

    Scanner in = new Scanner(System.in);

    System.out.print(" Enter a number :: ");

    int num = in.nextInt();

    for(int i=1; i<=10; i++){
        System.out.println(num + "  *  " + i +" = " + num*i);
    }
   }
    
}
