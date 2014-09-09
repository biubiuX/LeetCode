
public class SortColors {
    public void sortColors(int[] A) {
        int k = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i]==0){
                int tmp = A[k];
                A[k] = A[i];
                A[i] = tmp; 
                k++;
            }
        }
        k = A.length-1;
        for(int i = A.length-1; i>=0;i--){
            if(A[i]==2){
                int tmp = A[k];
                A[k] = A[i];
                A[i] = tmp;
                k--;
            }
        }
        
    }
    
    public void sortColorsII(int[] A) {
        int k = -1, j = -1, i = -1;
        for(int p = 0; p < A.length; p++){
            if(A[p] == 0){
                A[++k] = 2;
                A[++j] = 1;
                A[++i] = 0;
            }else if(A[p] == 1){
                A[++k] = 2;
                A[++j] = 1;
            }else if(A[p] == 2){
                A[++k] = 2;
            }
        }
        
    }
}
