public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {4,5,2,7,2,75,85,5,76};
        System.out.println(minimum(arr));

    }

    static int minimum(int[] arr){
        int min =arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        return min;
    }
    
}
