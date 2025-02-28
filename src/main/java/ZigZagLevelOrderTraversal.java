import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ZigZagLevelOrderTraversal {
  static class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
      this.val=val;
      this.left=null;
      this.right=null;
    }
  }
    static public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> result=new ArrayList<>();
      if(root==null){
        return result;
      }
      Queue<TreeNode> queue=new LinkedList<>();
      Stack<Integer> stack=new Stack<>();
      boolean flag=false;
      queue.add(root);
      while(!queue.isEmpty()){
        int size=queue.size();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<size;i++){
          TreeNode removedNode=queue.poll();
          if(flag){
            stack.push(removedNode.val);
          }else{
            list.add(removedNode.val);
          }
          if(removedNode.left!=null){
            queue.add(removedNode.left);
          }
          if(removedNode.right!=null){
            queue.add(removedNode.right);
          }
        }
        while(!stack.isEmpty()){
          list.add(stack.pop());
        }
        flag=!flag;
        result.add(list);
      }
      return result;
    }

  public static void main(String[] args) {
    TreeNode root=new TreeNode(3);
    root.left=new TreeNode(9);
    root.right=new TreeNode(20);
    root.left.left=new TreeNode(15);
    root.left.right=new TreeNode(7);

    System.out.println(zigzagLevelOrder(root));

  }


}
