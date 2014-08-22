import java.util.HashMap;


public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (int i = 0; i < numbers.length; i++){
            if(hm.containsKey(target-numbers[i])){
                res[0] = i+1;
                res[1] = hm.get(target-numbers[i])+1;
                if(res[1]<res[0]){
                    int t = res[1];
                    res[1] = res[0];
                    res[0] = t;
                }
                return res;
            }else{
                hm.put(numbers[i],i);
            }
        }
        return res;
    }
}
