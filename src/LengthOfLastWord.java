
public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
        char[] array = s.toCharArray();
        if(array.length==0){
            return 0;
        }
        int i = array.length-1;
        int count=0;
        while(i>=0){
            if(array[i]==' '){
                if(count==0){
                    i--;
                    continue;
                }else{
                    break;
                }
            }
            i--;
            count++;
        }
        return count;
    }
}
