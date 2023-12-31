import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        
        int[] arr = {2,1,4,5,6};

        swap(arr, 1, 3);



    }

    static void swap(int[] arr, int index1, int index2){

       int temp = arr[index1];
       arr[index1] = arr[index2];
       arr[index2] = temp;

       System.out.println(Arrays.toString(arr));

    }
    
}
