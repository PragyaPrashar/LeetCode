public class JumpGame2 {

    static public int jump(int[] nums) {
      int jump=0;
      int fartherest=0;
      int end=0;
      for(int i=0;i<nums.length-1;i++){
        fartherest=Math.max(fartherest, nums[i]+i);
        if(end==i){
          jump+=1;
          end=fartherest;
        }
      }
      return jump;
    }

  public static void main(String[] args) {
      int [] nums = {2,3,1,1,4};
      System.out.println(jump(nums));
  }


}
