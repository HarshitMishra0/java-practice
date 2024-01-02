import java.util.Arrays;

public class Search_2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {2 ,5,3},
            {7,9,2},
            {8,7,9,0,3}
        };

        int target = 0;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
                
                
            }
        }
         return new int[]{-1,1};
    }
    
    
}
