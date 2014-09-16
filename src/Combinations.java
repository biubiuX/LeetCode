import java.util.LinkedList;
import java.util.List;


public class Combinations {
    public List<LinkedList<Integer>> combine(int n, int k) {
        LinkedList<LinkedList<Integer>> res = new LinkedList<LinkedList<Integer>>();
        LinkedList<Integer> sample = new LinkedList<Integer>();
        combineHelper(k,n,1,sample,res);
        return res;
        
    }
    public void combineHelper(int k, int n, int level, LinkedList<Integer> list, LinkedList<LinkedList<Integer>> res){
        if(list.size()==k){
            res.add(new LinkedList<Integer>(list));
            return;
        }
        for(int i=level;i<=n;i++){
            list.add(i);
            combineHelper(k,n,i+1,list,res);
            list.remove(list.size()-1);
        }

    }
}
