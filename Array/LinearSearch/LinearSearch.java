public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = { 10, 50, 60, 70, 80, 90, 40, 50, 30, 602, 8 };
        int target=;
        int result=seaRch(arr, target);
        System.out.println(result);
    }

    static int seaRch(int[] arr, int target) {
        // check element linearly each element till get targeted emement...
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
