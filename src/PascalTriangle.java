import java.util.LinkedList;
import java.util.List;


public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if(numRows>=1){
            List<Integer> list = new LinkedList<Integer>();
            list.add(1);
            res.add(list);
        }
        for(int i = 1; i < numRows; i++){
            
            List<Integer> list = new LinkedList<Integer>();
            for(int j = 0; j <= i; j++){
                if(j==0){
                    list.add(res.get(i-1).get(0));
                }else if(j==i){
                    list.add(res.get(i-1).get(i-1));
                }else{
                    list.add(res.get(i-1).get(j)+res.get(i-1).get(j-1));    
                }
                
            }
            res.add(list);
        }
        return res;
    }

}
