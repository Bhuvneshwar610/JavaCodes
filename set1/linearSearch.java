public class linearSearch {
    
    public static void main(String [] args){

        //creating a array

        int[] arr = {2,5,4,7,8,20};
        int target = 20;

        System.out.println("this is index number:: "+Search(arr,target));
    }
    static int Search(int [] arr, int target){

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }
}
