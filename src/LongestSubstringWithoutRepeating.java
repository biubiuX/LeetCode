import java.util.HashMap;


public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
       	int len = 0;
		int i = 0;
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(i = 0; i < s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                if(len < hm.size()){
                    len = hm.size();
                }
                i = hm.get(s.charAt(i));
                hm.clear();
            }else{
                hm.put(s.charAt(i),i);
            }
        }
        if(len < hm.size()){
            len = hm.size();
        }
        return len;
    }
}
