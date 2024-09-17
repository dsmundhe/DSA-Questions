public class FindUnique {
    public static void main(String[] args) {
        // find unique value in rapeated elements array

        int[] arr = { 10, 10, 20, 20, 30, 100, 30, 40, 40 };
        int result = findOne(arr);
        System.out.println(result);
    }

    static int findOne(int[] arr) {
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
