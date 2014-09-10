import java.util.LinkedList;
import java.util.List;


public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        int left = 0;
        int right = 0;
        LinkedList<String> res = new LinkedList<String>();
        String str = new String();
        placeP(0,0,str,res,n);
        return res;
    }
    
    public void placeP(int left, int right, String str, LinkedList res,int n){
        if(left>n||right>n||left<right){
            return;
        }
        if(left+right==2*n){
            res.add(str);
        }else{
            String str1 = str+"(";
            placeP(left+1,right,str1,res,n);
            String str2 = str+")";
            placeP(left,right+1,str2,res,n);
            
        }
    }
}
