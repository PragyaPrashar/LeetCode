public class SearchMatrix {
  static public boolean searchMatrix(int[][] matrix, int target) {
    int row=findRow(matrix, target);
    if(row==-1){
      return false;
    }
    return findTarget(matrix, row, target);
  }
  static int findRow(int [][] matrix, int target){
    int left=0;
    int right=matrix.length-1;
    while(left<=right){
      int mid=(left+right)/2;
      if(matrix[mid][0]<=target && target<=matrix[mid][matrix[0].length-1]){
        return mid;
      }else if(matrix[mid][0]<target){
        left=mid+1;
      }else{
        right=mid-1;
      }

    }
    return -1;
  }
  static boolean findTarget(int [][] matrix, int row, int target){
    int left=0;
    int right=matrix[0].length-1;
    while(left<=right){
      int mid=(left+right)/2;
      if(matrix[row][mid]==target){
        return true;
      }else if(matrix[row][mid]<target){
        left=mid+1;
      }else{
        right=mid-1;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    int target = 3;
    System.out.println(searchMatrix(matrix,target));
  }
}
