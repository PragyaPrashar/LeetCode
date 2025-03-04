import java.util.*;
public class BinaryTreeLevelOrderTraversal {
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
  static List<List<Integer>> result;
  static Queue<TreeNode> queue;
  static public List<List<Integer>> levelOrder(TreeNode root) {
    result=new ArrayList<>();
    queue=new LinkedList<>();
    if(root==null){
      return result;
    }
    queue.add(root);
    while(!queue.isEmpty()){
      List<Integer> list=new ArrayList<>();
      int size=queue.size();
      for(int i=0;i<size;i++){
        TreeNode node=queue.poll();
        list.add(node.val);
        if(node.left!=null){
          queue.add(node.left);
        }
        if(node.right!=null){
          queue.add(node.right);
        }
      }
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

    System.out.println(levelOrder(root));

  }
}
