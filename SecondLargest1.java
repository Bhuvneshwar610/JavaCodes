import java.util.*;
public class SecondLargest1 {

    //frist solution brute force two aur remain 
public static void main(String[] args){
    int arr[] = {4,7,19,4,2,1,9};
    Arrays.sort(arr);
    int largest = arr.length;
    int slargest = -1;

    for(int i=arr.length-2; i>=0; i--){

        if(arr[i] != largest && arr[i]>slargest){
            slargest = arr[i];
        }
    }

    System.out.println("Slargest :: "+slargest);

}    
}
