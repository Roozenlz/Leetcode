package offer.offer67;

/**
 * 把字符串转换成整数
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public int strToInt(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        char[] s = str.trim().toCharArray();
        if(s.length==0){
            return 0;
        }

        int i = 1;
        int sign = 1;
        if (s[0] == '-') {
            sign = -1;
        } else if (s[0] != '+') {
            i = 0;
        }

        int res = 0;
        int b = Integer.MAX_VALUE / 10;//214748364
        for (int j = i; j < s.length; j++) {
            if (s[j] < '0' || s[j] > '9') {
                break;
            }

            //以下情况会越界
            //res>b时,res*10>Integer.MAX_VALUE
            //s[j]>'7'时,res * 10 +s[j] > Integer.MAX_VALUE
            //当s[j]='8'且sign = -1时,虽然没有越界但是可以当做越界处理，返回Integer.MIN_VALUE
            if (res > b || res == b && s[j] > '7') {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + (s[j] - '0');
        }

        return sign * res;
    }
}
