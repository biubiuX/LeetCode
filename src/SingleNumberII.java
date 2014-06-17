
public class SingleNumberII {
	public int singleNumber(int[] A){
		int result = 0;
		int x,sum;
		for (int i = 0; i < 32; i++){
			x = 1<<i;
			sum = 0;
			for (int j = 0; j < A.length; j++){
				if((A[j]&x) != 0){
					sum++;
				}
			}
			if((sum%3)!=0){
				result = x | result;
			}
			
		}
		return result;
	}
}
