public class Piovt {
    public static void main(String[] args) {

        int[] arr = { 15, 16, 17, 18, 19, 11, 12, 13, 14 };
        int result = findPivot(arr);
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
}
