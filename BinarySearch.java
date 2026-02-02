public class BinarySearch {
    public static void main(String[] args){


        int[] arr = {1,2,5,7,9,10,22,34,88,99};
        int target = 100;
        System.out.println("index number :: " + binarySearch(arr,target));
    }

    static int binarySearch(int[]arr,int target){

        int start = 0; 
        int end = arr.length-1;
        
        while(start<=end){
            int mid = (start+end) /2;

            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else if(target < arr[mid]){
                    end = mid-1;
            }
        }
        return start;
    }
    
}
