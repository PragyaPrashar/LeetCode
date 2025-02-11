public class MaximumSubarray {
  static public int maxSubArray(int[] nums) {
    int currSum=nums[0];
    int overrSum=nums[0];
    for(int i=1;i<nums.length;i++){
      currSum=Math.max(nums[i],currSum+nums[i]);
      overrSum=Math.max(overrSum, currSum);
    }
    return overrSum;

  }

  public static void main(String[] args) {
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    System.out.println(maxSubArray(nums));
  }
}
