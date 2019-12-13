package LeetCode;

/**
 * @CreateTime: 2019-11-26-10:43
 * @Author :杨阳
 * @ClassName :LeetCode.验证回文
 **/
public class 验证回文 {
    public static void main(String[] args) {
        String s = "1A man, a plan, a canal: Panama1";
        isPalindrome(s);
    }
    public static boolean isPalindrome(String s) {
        boolean end = true;
        if(s.length()<=0)
            return end;
        int i=0;
        int j=s.length();
        while(i<j){
            while(i<j && Character.isLetterOrDigit(s.charAt(i))) i++;
            while(i<j && Character.isLetterOrDigit(s.charAt(i))) j--;
            if(i!=j){
                end = false;
                return end;

            }

        }
        return end;
    }
}
