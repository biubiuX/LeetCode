// Given an array and a value, remove all instances of that value in place and return the new length
// The order of elements can be changed. It doesn't matter what you leave beyond the new length

// We can solve this problem by setting up two pointers.
// One pointer i is used to find the element not equal to ELEMENT, only not equal element will be passed to pointer J.

public class RemoveElement {
	public int removeElement(int[] A, int elem){
		int i = 0;
		int j = 0;
		while (i < A.length){
			if (A[i]!= elem){
				A[j] = A[i];
				j++;
			}
			i++;
		}
		return j;
		
	}
}
