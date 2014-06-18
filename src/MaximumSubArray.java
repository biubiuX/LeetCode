// Find the contiguous subarray within an array (containing at least one number)
// which has the largest sum
// This problem could be solved by dynamic programming.
// We maintain an array max, max[i] denotes the max sum when a contiguous subarray
// ends at i. We start from max[0] which equals A[0]
// When we move to max[1], we have two choices, A[1] or A[1] + max[0]
// For each max[i], if we get a higher sum when A[i] combines previous max subarray,
// we update max[i] as A[i] + max[i-1]. If A[i] itself is higher than max[i-1]+A[i],
// we can say A[i] is the maximum sub if the contiguous array ends at i.
public class MaximumSubArray {
	public int maxSubArray(int[] A) {
        if( A == null || A.length == 0){
            return 0;
        }
        int[] max = new int[A.length];
        max[0] = A[0];
        int res = max[0];
        
        for (int i = 1; i < A.length; i++){
            if(A[i]>max[i-1]+A[i]){
                max[i] = A[i];
            }else{
                max[i] = max[i-1]+A[i];
            }
            if(max[i] > res){
                res = max[i];
            }
        }
        return res;
        
    }
}
