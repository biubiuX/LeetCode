
public class ConvertSortedArrayToBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] num){
		return createBST(num, 0, num.length-1);
	}
	public TreeNode createBST(int[] num, int start, int end){
		if (start > end){
			return null;
		}
		int mid = (start+end)/2;
		TreeNode root = new TreeNode(num[mid]);
		root.left = createBST(num,start,end-1);
		root.right=  createBST(num, mid+1, end);
		return root;
	}
}
