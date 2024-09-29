import java.util.Arrays;

public class FirstandLastPostion {
    public static void main(String[] args) {
        int[] arr = { 10, 10, 20, 30, 40, 40, 40, 50, 50, 60, 60, 70, 70, 70, 80, 80, 80, 90, 90 };
        int target = 50;
        int[] result = firstLastP(arr, target);
        System.out.println(Arrays.toString(result));

    }

    static int[] firstLastP(int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = search(arr, target, true);
        ans[1] = search(arr, target, false);
        return ans;
    }
    static int search(int[] arr, int target, boolean findIndex) {
        int ans = -1;
        int start = 0;
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
