package Strings;

public class FirstOccurrenceinString {
    public int strStr(String haystack, String needle) {
        int h= haystack.length();
        int n= needle.length();
        int nIdx= 0;
        for(int i=0;i<h;i++){
            if(haystack.charAt(i)==needle.charAt(nIdx)){
                nIdx++;
            }
            else{
                i=i-nIdx;
                nIdx=0;
            }
            if(nIdx==n) return (i+1)-n;
        }
        return -1;
    }
}
