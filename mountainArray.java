public class mountainArray {

    public static void main(String[] args){
        int [] arr = {1,2,3,5,9,4,6,0};
        int start = 0;
        int end = arr.length;

        while(start<end){
            int mid = (start+end)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println("maountain ele:: "+start);
    }
}
