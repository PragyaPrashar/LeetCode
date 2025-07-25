import java.util.*;
/*
The class is used to calculate TwoSum
 */
public class TwoSum {

  /*
  Function to calculate two sum
   */

  static public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map=new HashMap<>();
    int [] result=new int[2];
    for(int i=0;i<nums.length;i++){
      int n=target-nums[i];
      if(map.containsKey(n)){
        result[0]=i;
        result[1]=map.get(n);
        return result;
      }
      map.put(nums[i],i);
    }
    return result;
  }
/*
This is the main function
 */
  public static void main(String[] args) {
    int [] nums={2,7,11,15};
    int target=9;
    int [] res=twoSum(nums, target);
    for(int i=0;i<res.length;i++){
      if(i==res.length-1){
        System.out.print(res[i] );
      }else{
        System.out.print(res[i]+",");
      }

    }

  }
}

