import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
  public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result=new ArrayList<>();
    Arrays.sort(nums);
    for(int i=0;i<nums.length;i++){
      if(i==0 || nums[i]!=nums[i-1]){
          int target=0-nums[i];
          int left=i+1;
          int right=nums.length-1;
          while(left<right){
            if(nums[left]+nums[right]==target){
              result.add(Arrays.asList(nums[i], nums[left],nums[right]));

              while(left<right && nums[left]==nums[left+1]){
                left+=1;
              }
              while(left<right && nums[right]==nums[right-1]){
                right-=1;
              }
              left+=1;
              right-=1;
            }else if(nums[left]+nums[right]<target){
              left+=1;
            }else{
              right-=1;
            }
          }

        }

      }
      return result;
    }

  public static void main(String[] args) {
    int [] nums={-1,0,1,2,-1,-4};
    System.out.println(threeSum(nums));
  }
  }



