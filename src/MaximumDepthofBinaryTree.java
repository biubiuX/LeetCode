//Given a binary tree, find its maximum depth
// The maximum depth is the number of nodes along the longest path from the root
// down to the farthest leaf node

public class MaximumDepthofBinaryTree {
	public int maxDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
	}
}
