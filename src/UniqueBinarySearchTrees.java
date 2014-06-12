// Given n, how many structurally unique BST's (binary search trees) that store values 1.. n?

// We can use dynamic programming method to solve this problem
// Create an array to maintain the unique BST number for each n
// count[0] = 1
// count[1] = 1
// count[2] = count[0]*count[1] + count[1]*count[0]
// count[3] = count[0]*count[2] + count[1]*count[1] + count[2]*count[0]

public class UniqueBinarySearchTrees {
	public int numTrees(int n){
		int[] count = new int[n+1];
		count[0] = 1;
		count[1] = 1;
		for(int i = 2; i <= n; i++){
			for (int j = 0; j < i; j++){
				count[i] += count[j]*count[i-j-1];
			}
		}
		return count[n];
	}
}
