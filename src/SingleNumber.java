
// Given an array of integers, every element appears twice except for one. Find that single one.
// Your algorithm should have a linear runtime complexity. 
// Could you implement it without using extra memory?

// Quick Sort method is okay but the complexity is not linear, so we could XOR method
//  0  XOR   0   =    0
//  0  XOR   1   =    1
//  1  XOR   0   =    1
//  1  XOR   1   =    0


public class SingleNumber {
	public int singleNumber(int[] A){
		int checker = 0;
		for (int i = 0; i < A.length; i++){
			checker = checker ^ A[i];
		}
		return checker;
	}
}
