import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4, 5 };
        System.out.println("The current array is : " + Arrays.toString(nums));
        System.out.println("The reversed array is : " + Arrays.toString(reverseArray_02(nums)));
    }

    public static int[] reverseArray(int nums[]) {
        int[] ans = new int[nums.length];
        for (int i = nums.length - 1, j = 0; i >= 0; i--) {
            ans[j++] = nums[i];
        }
        return ans;
    }

    public static int[] reverseArray_02(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return nums;
    }
}