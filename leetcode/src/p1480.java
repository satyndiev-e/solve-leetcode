public class p1480 {
    public int[] runningSum(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp1 = nums[i];
            nums[i] = nums[i] + temp;
            temp += temp1;
        }
        return nums;
    }
}
