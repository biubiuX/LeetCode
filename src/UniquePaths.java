
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[] count = new int[n];
        for(int i=0; i < n; i++){
            count[i] = 1;
        }
        for(int i = 1; i < m; i++){
            for(int j=1; j<n; j++){
                    count[j]=count[j-1]+count[j];
            }
        }
        return count[n-1];
    }	
}
