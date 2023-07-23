package Strings;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring {
    class Solution
    {
        //Function to find the smallest window in the string s consisting
        //of all the characters of string p.
        public static String smallestWindow(String s, String p)
        {
            // Your code here
            String ans="";
            Map<Character, Integer> mapp= new HashMap<>();
            for(int i=0;i<p.length();i++){
                char ch= p.charAt(i);
                mapp.put(ch, mapp.getOrDefault(ch,0)+1);
            }
            int matchCount=0;
            int desiredMC= p.length();
            Map<Character, Integer> maps= new HashMap<>();
            int i=0;
            int j=0;

            while(true){
                boolean flag1=false;
                boolean flag2=false;
                //acquire
                while(i<s.length() && matchCount< desiredMC){
                    char ch= s.charAt(i);
                    maps.put(ch, maps.getOrDefault(ch,0)+1);
                    i++;

                    if(mapp.getOrDefault(ch,0)>= maps.getOrDefault(ch,0)){
                        matchCount++;
                    }
                    flag1=true;
                }

                //collect and release ans
                while(j<i && matchCount==desiredMC){
                    String potentialAns= s.substring(j,i);
                    if(ans.length()==0 || potentialAns.length()< ans.length() ){
                        ans= potentialAns;
                    }
                    char ch= s.charAt(j);
                    if(maps.get(ch)==1){
                        maps.remove(ch);
                    }
                    else{
                        maps.put(ch, maps.get(ch)-1);
                    }
                    if(maps.getOrDefault(ch,0) < mapp.getOrDefault(ch,0)){
                        matchCount--;
                    }
                    flag2=true;
                    j++;
                }
                if(flag1==false && flag2==false) break;
            }
            return ans.length()==0 ? "-1" : ans;
        }
    }
}
