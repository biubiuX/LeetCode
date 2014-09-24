
public class CountAndSay {
    public String countAndSay(int n) {
        String last = "1";
        for(int i =0;i<n-1;i++){
            last = countAndS(last);
        }
        return last;
    }
    
    public String countAndS(String last){
        int count = 1;
        String s = new String();
        for(int i=1;i<last.length();i++){
            if(last.charAt(i)!=last.charAt(i-1)){
                s = s+Integer.toString(count)+last.charAt(i-1);
                count = 1;
            }else{
                count++;
            }
        }
        s = s+Integer.toString(count)+last.charAt(last.length()-1);
        return s;
    }
}
