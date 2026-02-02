// import java.util.*;
public class largestNum {
    public static void main(String[] args){
        int[]arr={3,9,1,0,5,2,9,88};
        int large = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>large ){
                large=arr[i];
            }
        }

        System.out.println("larger number " + large);
    }
    
}
