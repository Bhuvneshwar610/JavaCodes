import java.util.Scanner;
public class minimumNum {
    public static void main(String[] args){

        // this code when return exect answer if arrays all numbers positive
        Scanner input = new Scanner(System.in);
        int[] arr = new int[8];
        System.out.print("Enter 8 numbsrs :: ");
         
        for(int i =0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        int min = Integer.MAX_VALUE; 
        for(int i=0; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Smallest number in array " + min);
    }
    
}
