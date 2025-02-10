public class TrappingRainWater {


    static public int trap(int[] height) {
      int maxi=0;
      int maxIndex=0;
      int left=0;
      int water=0;
      for(int i=0;i<height.length;i++){
        if(maxi<height[i]){
          maxi=height[i];
          maxIndex=i;
        }
      }
      for(int i=0;i<maxIndex;i++){
        left=Math.max(left,height[i]);
        water+=Math.min(left,maxi)-height[i];
      }
      left=0;
      for(int i=height.length-1;i>maxIndex;i--){
        left=Math.max(left,height[i]);
        water+=Math.min(left,maxi)-height[i];
      }
      return water;
    }

  public static void main(String[] args) {
    int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println(trap(height));
  }

}
