import java.util.ArrayList;
import java.util.List;


public class Subsets {
    public List<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        res.add(list);
        boolean[] visited = new boolean[S.length];
        for(int i=1;i<=S.length;i++){
            findSubsets(res,list,i,S,Integer.MIN_VALUE,visited);
        }
        return res;
    }
    public void findSubsets(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list, int n,int[] S,int cur,boolean[] visited){
        if(list.size()==n){
            res.add(new ArrayList<Integer>(list));
        }else{
            for(int i=0;i<S.length;i++){
                if(visited[i]!=true&&cur<S[i]){
                    list.add(S[i]);
                    visited[i]=true;
                    int tmp = cur;
                    cur = S[i];
                    findSubsets(res,list,n,S,cur,visited);
                    cur = tmp;
                    list.remove(list.size()-1);
                    visited[i]=false;
                }
            }
        }
    }
}
