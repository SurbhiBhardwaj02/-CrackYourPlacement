package Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4};
        int k=2;

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i: arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        PriorityQueue<HashMap.Entry<Integer,Integer>> pq= new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());

        for(HashMap.Entry entry: map.entrySet()){
            pq.add(entry);
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]= pq.poll().getKey();
        }
        for(int i=0;i<k;i++){
            System.out.println(ans[i]);
        }
    }
}
