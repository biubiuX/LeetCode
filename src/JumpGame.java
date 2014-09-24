
public class JumpGame {
    public boolean canJump1(int[] A) {
        int[] jump = new int[A.length];
        jump[0] = 0;
        for(int i =1;i<A.length;i++){
            jump[i] = Math.max(jump[i-1],A[i-1])-1;
            if(jump[i]<0){
                return false;
            }
        }
        return jump[A.length-1]>=0;
    }
    
    public boolean canJump2(int[] A) {
        int maxDst = 0;
        for(int start = 0; start<=maxDst&&start<A.length;start++){
            if(start+A[start]>maxDst){
                maxDst = start + A[start];
            }
            if(maxDst>=A.length-1){
                return true;
            }
        }
        return false;
    }
}
