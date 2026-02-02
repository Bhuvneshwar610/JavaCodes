public class ArraySortOrNot {

    public static void main(String[] args){
        int [] arr = {1,34,4,5,6,8};
        boolean ans = true;

        for(int i=1; i<arr.length; i++){
            if(arr[i]>=arr[i-1]){
                ans = true;
                System.out.println(i);
                
            }
            else{
                ans=false;
                System.out.println(i);
                break;
            }
        }
        System.out.println("array sort or not :: "+ans);
    }
}
