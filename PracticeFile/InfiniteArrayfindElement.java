public class InfiniteArrayfindElement {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 23, 25, 27, 28, 29, 36, 34, 39, 45, 46,
                48, 49, 50, 57, 58, 59, 90 };
        int target = 12;
        System.out.println(ans(arr, target));

    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) *2;
            start = newStart;
        }
        return binSearch(arr, target, start, end);
    }

    static int binSearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
