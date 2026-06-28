public class MinMaxArray {
    public static void main(String[] args) {
        int arr[] = new int[] { 4, 5, 3, 14, 9, 15 };
        System.out.println("Min in array : " + minInArray(arr));
        System.out.println("Max in array : " + maxInArray(arr));
    }

    public static int minInArray(int[] nums) {
        int ans = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < ans) {
                ans = nums[i];
            }
        }
        return ans;
    }

    public static int maxInArray(int[] nums) {
        int ans = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > ans) {
                ans = nums[i];
            }
        }
        return ans;
    }
}