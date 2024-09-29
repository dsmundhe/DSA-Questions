import java.util.Arrays;

<<<<<<< HEAD
// find first and last position of an given target in array if presetns then return positinons  else return [-1,-1]
=======
// find first and last position of an give target in array if presetns that num in array else return [-1,-1]
>>>>>>> fd88f3bd2ffa6de6c6e636d77605e4b26e6ec413

public class FirastandLastPosition {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 40, 40, 50, 50, 60, 60, 80, 80, 80 };
        int[] result = fisrstLastP(arr, 50);
        System.out.println(Arrays.toString(result));

    }

    static int[] fisrstLastP(int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = search(arr, target, true);
        ans[1] = search(arr, target, false);
        return ans;

    }

    static int search(int[] arr, int target, boolean findIndex) {
        int start = 0;
        int ans = -1;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (findIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return ans;
    }
}
