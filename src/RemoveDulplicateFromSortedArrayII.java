import java.util.HashMap;

	
public class RemoveDulplicateFromSortedArrayII {
    public int removeDuplicates(int[] A) {
        if(A.length==0){
            return 0;
        }
        int j = 1;
        int count =1;
        for(int i = 1; i <A.length; i++){
            if(A[i]==A[i-1]&&count==1){
                A[j]=A[i];
                count++;
                j++;
            }
            if(A[i]>A[i-1]){
                count = 1;
                A[j]=A[i];
                j++;
            }
        }
       
        HashMap<Integer,Boolean> hm = new HashMap<Integer,Boolean>();
        return j;
    }
}
