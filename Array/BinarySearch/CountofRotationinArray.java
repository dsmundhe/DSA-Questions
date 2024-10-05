public class CountofRotationinArray {
    public static void main(String[] args) {

        int[] arr = { 11, 12, 13, 14, 15, 8, 9, 10 };
        int result = findRotation(arr);
        System.out.println("Rotation of Array is : " + result);
    }

    static int findRotation(int[] arr) { 
        int rotation = findPivot(arr);
        return rotation + 1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] < arr[end]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1] && mid < end) {
                return mid;
            } else if (arr[mid] < arr[mid - 1] && mid > start) {
                return mid - 1;
            } else if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
