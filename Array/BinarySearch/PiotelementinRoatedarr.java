public class PiotelementinRoatedarr {
    public static void main(String[] args) {
        int[] arr = { 13, 14, 15, 19, 20, 12 };
        int result = finPivot(arr);
        System.out.println(result);

    }

    static int finPivot(int[] arr) {
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

}
