import java.util.Arrays;

public class RememberArray {
    public static void main(String[] args) {

        int[][] arr = new int[][] {
                { 2, 5, 3, 6 },
                { 1, 4 },
                { 8, 7, 9 }
        };
        int target = 10;

        System.out.println(Arrays.toString(search(arr, target)));

    }

    static int[] search(int arr[][], int target) {
        if (arr.length == 0) {
            return new int[] { -1, -1 };
        }

        int a = -1, b = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    a = i;
                    b = j;
                }
            }
        }
        return new int[] { a, b };
    }

}
