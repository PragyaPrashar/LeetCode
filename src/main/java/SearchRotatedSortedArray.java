public class SearchRotatedSortedArray {
  static public int search(int[] nums, int target) {
    int left=0;
    int right=nums.length-1;
    while(left<right){
      int mid=(left+right)/2;
      if(nums[mid]>nums[right]){
        left=mid+1;
      }else{
        right=mid;
      }
    }
    int min=left;
    left=0;
    right=nums.length-1;
    if(nums[min]<=target && target<=nums[right]){
      left=min;
    }else{
      right=min-1;
    }
    while(left<=right){
      int mid=(left+right)/2;
      if(nums[mid]==target){
        return mid;
      }else if(nums[mid]<target){
        left=mid+1;
      }else{
        right=mid-1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int [] nums = {4,5,6,7,0,1,2};
    int target = 0;
    System.out.print(search(nums, target));
  }
}
