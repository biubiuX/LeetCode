
public class SearchInsertPosition {
    public int searchInsert(int[] A, int target) {
        if(A==null){
            return 0;
        }
        int i;
        for(i = 0; i < A.length; i++){
            if(A[i] >= target){
                return i;
            }
        }
        return i;
        
    }
}
