import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        // two sum from the array

        int[] arr = { 10, 50, 30, 60, 70, 80, 90 };
        int target = 70;
        int[] result = arr(arr, target);
        System.out.println(Arrays.toString(result));

    }

    static int[] arr(int[] arr, int target) {
        int[] newarr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                // in this it will checke all the values for arr with sum its element and
                // copmare with target values
                if (arr[i] + arr[j] == target) {
                    newarr[0] = i;
                    newarr[1] = j;
                }
            }
        }
        if (arr[newarr[0]] + arr[newarr[1]] != target) {
            // if target not get perform that time it will return [-1,-1]
            newarr[0] = -1;
            newarr[1] = -1;
        }
        return newarr;
    }
}