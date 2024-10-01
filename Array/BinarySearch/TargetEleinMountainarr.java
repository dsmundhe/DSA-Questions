public class TargetEleinMountainarr {

    public static void main(String[] args) {
        // we have an array
        // in that one element is duplicate
        // array is mountain array
        // so we to return minimum index of that element

        int[] arr = { 10, 12, 13, 14, 15, 16, 15, 14, 13, 12, 10 };
        int target = 13;
        int result = fintIndexofElement(arr, target);
        System.out.println("Minimum Index : " + result);
    }

    static int fintIndexofElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return binSearch(arr, target, end);
    }

    static int binSearch(int[] arr, int target, int end) {
        int start = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}