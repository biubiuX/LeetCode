import java.util.LinkedList;
import java.util.List;


public class CombinationSum {
    public List<LinkedList<Integer>> combinationSum(int[] candidates, int target) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList<LinkedList<Integer>> res = new LinkedList<LinkedList<Integer>>();
        sumHelper(candidates,target,0,list,res);
        return res;
    }
    
    public void sumHelper(int[] candidates, int target,int sum,LinkedList<Integer> list, LinkedList<LinkedList<Integer>> res){
        if(sum == target){
            res.add(new LinkedList<Integer>(list));
        }else{
            for(int i=0;i<candidates.length;i++){
                if(sum+candidates[i]<=target){
                    if(!list.isEmpty()){
                        if(candidates[i]>=list.peekLast()){
                            list.add(candidates[i]);
                            sumHelper(candidates,target,sum+candidates[i],list,res);
                            list.removeLast();
                        }
                    }else{
                        list.add(candidates[i]);
                        sumHelper(candidates,target,sum+candidates[i],list,res);
                        list.removeLast();
                    }
                }            
            }
        }
    }
}
