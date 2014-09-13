
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        if(sum==root.val&&root.right==null&&root.left==null){
            return true;
        }
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
