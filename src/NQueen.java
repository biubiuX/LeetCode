import java.util.LinkedList;
import java.util.List;


public class NQueen {
	    public List<String[]> solveNQueens(int n) {
	        List<String[]> list = new LinkedList<String[]>();
	        int[] loc = new int[n];
	        placeQ(list, loc, 0, n);
	        return list;
	    }
	    
	    public void placeQ(List<String[]> list, int[] loc, int cur, int n){
	        if(cur == n){
	            printQ(list, loc, n);
	        }else{
	            for(int i = 0; i < n; i++){
	                loc[cur] = i;
	                if(isValid(loc,cur)){
	                    placeQ(list, loc, cur+1, n);
	                }
	            }
	        }
	    }
	    
	    public boolean isValid(int[] loc, int cur){
	        for(int i = 0; i < cur; i++){
	            if(loc[i]==loc[cur]||Math.abs(loc[cur] - loc[i])==(cur - i)){
	                return false;
	            }    
	        }
	        return true;
	    }
	    
	    public void printQ(List<String[]> list, int[] loc, int n){
	        String[] str = new String[n];
	        for(int i = 0; i < n; i++){
	            String s = new String();
	            for(int j = 0; j < n; j++){
	                if(j==loc[i]){
	                    s = s + "Q";
	                }else{
	                    s = s + ".";
	                }    
	            }
	            str[i] = s;
	        }
	        list.add(str);
	    }
}
