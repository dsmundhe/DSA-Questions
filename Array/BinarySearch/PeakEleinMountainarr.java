public class PeakEleinMountainarr {

    public static void main(String[] args) {

        // find peak element in mountain array
        // order like increasing and then decreasing
        // also call biognostic array

        int[] arr = { 10, 12, 13, 14, 15, 25, 17, 14, 13, 12, 10 };
        int result = findPeakElementinMountainArray(arr);
        System.out.println("Peak element : " + arr[result]);

    }
    // function for find peack element index

    static int findPeakElementinMountainArray(int[] arr) {
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
        // we can return end or start
        // because both will poing same index

        return end;
    }

}