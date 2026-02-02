import java.util.Arrays;

public class LinearSearch2D {
    public static void main(String[] args){

        int[][] arr = {
            {5,7,15,11,0},
            {1,4},
            {8,7,9,2,1},

        };

        int target = 4;
        int[] ans = Search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int Search(int [][]arr, int target){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] ==target){
                    return   int[]{i,j};
                };
            }
        }

        return  int[]{-1,-1};
    };
}
