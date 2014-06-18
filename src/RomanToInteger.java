
public class RomanToInteger {
    public int romanToInt(String s) {
        char[] roman = s.toCharArray();
        int[] num = new int[roman.length];
        for (int i = 0; i < num.length; i++){
            switch(roman[i]){
                case 'I':
                    num[i] = 1;
                    break;
                case 'V':
                    num[i] = 5;
                    break;
                case 'X':
                    num[i] = 10;
                    break;
                case 'L':
                    num[i] = 50;
                    break;
                case 'C':
                    num[i] = 100;
                    break;
                case 'D':
                    num[i] = 500;
                    break;
                case 'M':
                    num[i] = 1000;
                    break;
                default:
                    num[i] = 0;
            }
        }
        int res = num[0];
        for (int i = 1; i < num.length; i++){
            if(num[i]>num[i-1]){
                res = res - 2*num[i-1] + num[i];
            }else{
                res = num[i] + res;
            }
        }
        return res;
    }
}
