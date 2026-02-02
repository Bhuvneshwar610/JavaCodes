public class SecondLargestOptimal {

    public static void main(String [] args){
        //optimal approch 
        int[] arr = {3,9,6,2,1,0,10};
        int largest = arr[0];
        int slargest = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
        }
        System.out.println("Slargest ele :: "+ slargest);
        System.out.println("largest ele :: "+ largest);


    }
}
