
public class SearchInRotatedSortedArray {
    public int search(int[] A, int target) {
        if(A.length==0){
            return -1;
        }
        
        if(target<A[0]&&target>A[A.length-1]){
            return -1;
        }
        return searchHelper(A,target,0,A.length-1);
    }
    
    public int searchHelper(int[] A, int target, int start, int end){
        if(end<start){
            return -1;
        }
        int mid = (start+end)/2;
        if(A[mid] == target){
            return mid;
        }
      
        if(A[mid]>=A[start]){
            if(target<A[mid]&&target>=A[start]){
                return searchHelper(A,target,start,mid-1);
            }else{
                return searchHelper(A,target,mid+1,end);
            }
        }else{
            if(target>A[mid]&&target<=A[end]){
                return searchHelper(A,target,mid+1,end);
            }else{
                return searchHelper(A,target,start,mid-1);
            }
        }
    }
}
