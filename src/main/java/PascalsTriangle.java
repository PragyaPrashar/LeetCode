import java.util.*;
public class PascalsTriangle {
  static public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> triangle=new ArrayList<>();
    triangle.add(new ArrayList<>());
    triangle.get(0).add(1);
    for(int i=1;i<numRows;i++){
      List<Integer> prev=triangle.get(i-1);
      List<Integer> current=new ArrayList<>();
      current.add(1);
      for(int col=1;col<prev.size();col++){
        current.add(prev.get(col-1)+prev.get(col));
      }
      current.add(1);
      triangle.add(current);
    }
    return triangle;
  }

  public static void main(String[] args) {
    System.out.println(generate(5));
  }
}
