package Strings;

public class ValidPalindrome {
    public boolean validPalindrome(String s) {
        int low=0;
        int high= s.length()-1;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                String s1= s.substring(low,high);
                String s2= s.substring(low+1, high+1);
                return (checkPalin(s1)|| checkPalin(s2));
            }
            low++;
            high--;
        }
        return true;
    }
    public static boolean checkPalin(String s1){
        int high=s1.length()-1;
        int low=0;
        while(low<high){
            if(s1.charAt(low++)!=s1.charAt(high--)){
                return false;
            }
        }
        return true;
    }
}
