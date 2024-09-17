public class MissingNum {
    public static void main(String[] args) {
        // find Missing num from the array
        // consider from 1 to array size

        int[] arr = { 1, 2, 3, 4, 0, 6, 7, 8 };
        int result = missNum(arr);
        System.out.println(result);
    }

    static int missNum(int[] arr) {
        int n = arr.length;
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return totalSum - sum;
    }

}
