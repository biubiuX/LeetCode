import java.util.Stack;


public class EvaluateReversePolishNotation {
	 public static int evalRPN(String[] tokens) {
	        if(tokens.length == 0){
	            return 0;
	        }
	        
	        int res = Integer.parseInt(tokens[0]);
	        Stack<String> stack = new Stack<String>();
	        for(int i = 0; i < tokens.length; i++){
	            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
	                int y = Integer.parseInt(stack.pop());
	                int x = Integer.parseInt(stack.pop());
	                if(tokens[i].equals("+")){
	                    res = x + y;
	                }else if(tokens[i].equals("*")){
	                    res = x * y;
	                }else if(tokens[i].equals("-")){
	                    res = x - y;
	                }else if(tokens[i].equals("/")){
	                    res = x / y;
	                }
	                stack.push(String.valueOf(res));
	            }else{
	            	stack.push(tokens[i]);
	            }
	        }
	        return res;
	    }
	 
	 public static void main(String[] args){
		 String a = "-1";
		 String[] tokens = {"3","-4","+"};
		 int x = evalRPN(tokens);
		 System.out.print(x);
	 }
}
