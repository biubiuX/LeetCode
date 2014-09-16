
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int div = 1;
        if(x<0){
            return false;
        }
        while(x/div>=10){
            div = div*10;
        }
        while(x>0){
            int l = x/div;
            int r = x%10;

            if(l!=r){
                return false;
            }
            x = x%div/10;
            div = div/100;
        }
        return true;
    }
}
