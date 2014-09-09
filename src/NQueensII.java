
public class NQueensII {
    int res;
    public int totalNQueens(int n) {
        int[] loc = new int[n];
        res = 0;
        placeQ(loc,0,n);
        return res;
    }
    
    public void placeQ(int[] loc, int cur, int n){
        if(cur == n){
            res++;
        }else{
            for(int i = 0; i < n; i++){
                loc[cur] = i;
                if(isValid(loc,cur)){
                    placeQ(loc,cur+1,n);
                }
            }
        }
    }
    
    
    public boolean isValid(int[] loc, int cur){
        for(int i =0 ;i < cur; i++){
            if(loc[i] == loc[cur]||Math.abs(loc[cur]-loc[i])==cur-i){
                return false;
            }
        }
        return true;
    }
}
