import java.util.Stack;


public class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length()==0){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                if(s.charAt(i)==')'&&stack.peek()!='('){
                    return false;
                }
                if(s.charAt(i)==']'&&stack.peek()!='['){
                    return false;
                }
                if(s.charAt(i)=='}'&&stack.peek()!='{'){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}	
