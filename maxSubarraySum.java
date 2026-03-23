public class maxSubarraySum {
    public int maxSubArraySum(int[] nums) {
    int maxSum = nums[0];
    int curr = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            maxSum = Math.max(maxSum, curr);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int nums[]={1,2,4,5,6};
        maxSubarraySum obj=new maxSubarraySum();
        System.out.println(obj.maxSubArraySum(nums));
    }
}
