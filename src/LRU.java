
public class LRU {
    private int capacity;
    java.util.LinkedHashMap<Integer,Integer> cache;
    public LRU(int capacity){
        this.capacity = capacity;
        cache = new java.util.LinkedHashMap<Integer,Integer>();
    }
    
    public int get(int key){
        if(cache.containsKey(key)){
            int val = cache.get(key);
            cache.remove(key);
            cache.put(key,val);
            return val;
        }else{
            return -1;
        }
    }
    
    public void set(int key, int value){
        if(cache.containsKey(key)){
            cache.remove(key);
        }else if(cache.size()==this.capacity){
            for(int firstSet:cache.keySet()){
                cache.remove(firstSet);
                break;
            }
        }
        cache.put(key,value);
    }
 
}
