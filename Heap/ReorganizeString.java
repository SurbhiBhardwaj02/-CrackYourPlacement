package Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.
//
//Return any possible rearrangement of s or return "" if not possible.
class pair{
    char ch;
    int f;
    public pair(char ch,int f){
        this.ch=ch;
        this.f=f;
    }
}
public class ReorganizeString {

    public static void main(String[] args) {
        System.out.println(reorganize("aab"));
    }

    private static String reorganize(String s) {
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<pair> pq= new PriorityQueue<>((a,b)->b.f-a.f);
        for ( Map.Entry<Character,Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            pq.add(new pair(key,value));
        }

        StringBuilder ans= new StringBuilder();
        pair block= pq.poll();
        ans.append(block.ch);
        block.f--;
        while(pq.size()>0){
            pair temp=pq.poll();
            ans.append(temp.ch);
            temp.f--;
            if(block.f>0){
                pq.add(block);
            }
            block=temp;
        }
        if(block.f>0){
            return "";
        }
        else{
            return ans.toString();
        }
    }

}
