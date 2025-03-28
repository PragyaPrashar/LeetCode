public class MergeSortedArray {
  static public void merge(int[] nums1, int m, int[] nums2, int n) {
    m=m-1;
    n=n-1;
    for(int i=nums1.length-1;i>=0;i--){
      if(m>=0 && n>=0){
        if(nums1[m]<nums2[n]){
          nums1[i]=nums2[n--];
        }else{
          nums1[i]=nums1[m--];
        }
      }else if(m>=0){
        nums1[i]=nums1[m--];
      }else if(n>=0){
        nums1[i]=nums2[n--];
      }
    }
    for(int i=0;i<nums1.length;i++){
      System.out.print(nums1[i]);
    }

  }

  public static void main(String[] args) {
    int [] nums1 = {1,2,3,0,0,0};
    int m = 3;
    int [] nums2 = {2,5,6};
    int n = 3;
    merge(nums1, m, nums2, n);
  }
}
