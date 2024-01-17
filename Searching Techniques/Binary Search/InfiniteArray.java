public class InfiniteArray {
    public static void main(String[] args) {
        

    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(arr[end]<target){
            end = end + (end - start)*2;
            start = end +1;
        }

        return binarySearch(int[] arr, int target, int start, int end);

    }

    static int binarySearch(int[] arr, int target, int start, int end){

        int mid = start + (end - start)/2;

        while(start<end){
            if(arr[mid]>target){
            end = mid - 1; 
        }
    }

        }

        
    
}
