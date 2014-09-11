import java.util.LinkedList;
import java.util.List;


public class Permutation {
    public List<LinkedList<Integer>> permute(int[] num) {
        int[] visited = new int[num.length];
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList<LinkedList<Integer>> res = new LinkedList<LinkedList<Integer>>();
        findN(list,num,0,visited,res);
        return res;
    }
    
    public void findN(LinkedList<Integer> list,int[] num, int step, int[] visited, LinkedList<LinkedList<Integer>> res){
        if(step==num.length){
            res.add(new LinkedList<Integer>(list));
            return;
        }
        
            for(int i=0; i<num.length;i++){
                if(visited[i]!=1){
                    visited[i]=1;
                    list.add(num[i]);
                    findN(list,num,step+1,visited,res);
                    list.pollLast();
                    visited[i]=0;
                }
            }
        
    }
}
