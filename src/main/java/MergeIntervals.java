import java.util.Arrays;
import java.util.*;


public class MergeIntervals {
  static public int[][] merge(int[][] intervals){
    Arrays.sort(intervals,(a, b)->(a[0]-b[0]));
    LinkedList<int []> list=new LinkedList<>();
    for(int i=0;i<intervals.length;i++){
      if(list.isEmpty() || list.getLast()[1]<intervals[i][0]){
        list.add(intervals[i]);
      }else{
        list.getLast()[1]=Math.max(list.getLast()[1],intervals[i][1]);
      }
    }
    int [][] res=new int[list.size()][2];
    for(int i=0;i<res.length;i++){
      res[i]=list.get(i);
    }
    return res;
  }

  public static void main(String[] args) {
    int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
    int [][] result=merge(intervals);
    System.out.print("[");
    for(int i=0;i<result.length;i++){
      System.out.print("[");
      for(int j=0;j<result[0].length;j++){
        if(j==0) {
          System.out.print(result[i][j] + ",");
        }else{
          System.out.print(result[i][j]);
        }
      }
      System.out.print("]");
    }
    System.out.println("]");
  }
}
