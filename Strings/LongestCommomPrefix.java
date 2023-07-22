package Strings;

public class LongestCommomPrefix {
    public static void main(String[] args) {
        String str[]= {"flower","flow","flight"};
        System.out.println(longestCommomPrefix(str));
        //System.out.println(str[2].indexOf("fl"));

    }
    public static String longestCommomPrefix(String[] str){
        if(str.length==0) return "";
        String prefix= str[0];
        for(int i=1;i< str.length;i++){
            while(str[i].indexOf(prefix)!=0){
                prefix= prefix.substring(0,prefix.length()-1);
            }

        }
        return prefix;
    }
}
