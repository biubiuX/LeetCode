
public class MergeSortedArray {
    public void merge(int A[], int m, int B[], int n) {
        if(n==0){
            return;
        }
        int i = m -1, j = n -1;
        int k = m + n - 1;
        while(k>-1){
            if(i!=-1&&j!=-1){
                if(A[i] <= B[j]){
                    A[k] = B[j];
                    j--;
                    k--;
                }else{
                    A[k] = A[i];
                    i--;
                    k--;
                }
            }else{
                if(i==-1&&j!=-1){
                    A[k] = B[j];
                    j--;
                    k--;
                }else{
                    A[k] = A[i];
                    i--;
                    k--;
                }
            }
        }
    }
}
