public class FindElementinRoatedArray {
    public static void main(String[] args) {
        int[] arr = { 14, 15, 16, 17, 18, 10, 11, 12, 13 };
        int target = 16;
        int result = elementIndex(arr, target);
        System.out.println(result);

    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

    static int elementIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        int pivot = findPivot(arr);
        if (pivot == -1) {
            return -1;
        }
        if (arr[pivot] == target) {
            return pivot;
        } else if (target >= arr[start]) {
            return binSearch(arr, target, 0, pivot - 1);
        } else {
            return binSearch(arr, target, pivot + 1, end);
        }
    }

    static int binSearch(int[] arr, int target, int start, int end) {
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
