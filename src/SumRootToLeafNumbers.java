import java.util.ArrayList;


public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        getNum(root,0,res);
        int ans = 0;
        for(int i =0; i < res.size();i++){
            ans = res.get(i)+ans;
        }
        return ans;
    }
    
    public void getNum(TreeNode root, int num, ArrayList<Integer> res){
        if(root.left==null&&root.right==null){
            num = root.val+num*10;
            res.add(num);
            return;
        }
        num = root.val+num*10;
        if(root.left!=null){
            getNum(root.left,num,res);    
        }
        if(root.right!=null){
            getNum(root.right,num,res);    
        }
        return;
    }
}
