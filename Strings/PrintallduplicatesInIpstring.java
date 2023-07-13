package Strings;

import java.util.HashMap;
import java.util.Map;

public class PrintallduplicatesInIpstring {
    public static void main(String[] args) {
        count("geeksforgeeks");
    }

    private static void count(String s) {
        Map<Character,Integer> mp= new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> map_element:mp.entrySet()){
            if(map_element.getValue()>1){
                System.out.println(map_element);
            }
        }
    }
}
