import java.util.HashMap;


public class LongestConsecutiveSequence {
	  public int longestConsecutive(int[] num) {
	        HashMap<Integer,Boolean> hm = new HashMap<Integer,Boolean>();
	        if(num.length==0){
	            return 0;
	        }
	        for(int i =0; i < num.length; i++){
	            if(!hm.containsKey(num[i])){
	                hm.put(num[i],false);
	            }
	        }
	        int res = 0;
	        for(int i=0;i<num.length;i++){
	            if(hm.get(num[i])!=true){
	                hm.put(num[i],true);
	                int count = 0;
	                int cur = num[i];
	                while(hm.containsKey(cur)){
	                    count++;
	                    hm.put(cur,true);
	                    cur++;
	                }
	                cur = num[i]-1;
	                while(hm.containsKey(cur)){
	                    count++;
	                    hm.put(cur,true);
	                    cur--;
	                }
	                if(res<count){
	                    res = count;
	                }
	            }
	            
	        }
	        return res;
	    }
}
