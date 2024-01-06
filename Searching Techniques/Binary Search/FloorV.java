public class FloorV {

    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9,24,25,30};
        int target = 3;
        System.out.println(floor(arr,target));
        System.out.println("hello");
    }

    static int floor(int[] arr, int target){

        int start = 0;
        int end = arr.length -1;
        int mid = start + (end - start)/2;
        

        while(start<=end){
            if(arr[mid]>= target){
                end = mid -1;
            }else if(arr[mid]<= target){
                start = mid + 1;
            }else if(arr[mid] == target){
                
                return arr[mid];
            }
        }
        return end;
    }
    
}
