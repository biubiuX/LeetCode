
public class FirstMissingPositive {
	public static int firstMissingPositive(int[] A){
		int n = A.length;
		
		for (int i=0; i < n; i++){
			if(A[i]>=1&&A[i]<=n){
				while(A[i] != (i+1)){
					if((A[i]>n)||(A[i]<=0)|| (A[A[i]-1]==A[i])){
						break;
					}
					int tmp = A[i];
					A[i] = A[tmp-1];
					A[tmp-1] = tmp;
				}
			}
		}
		for (int i=0; i<n; i++){
			if(A[i]!=i+1){
				return i+1;
			}
		}
		return n+1;
	}
	
	public static void main(String[] args){
		int[] array = {2,1};
		System.out.print(firstMissingPositive(array));
	}
}
