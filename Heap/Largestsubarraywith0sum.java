package Heap;

import java.util.HashMap;

public class Largestsubarraywith0sum {
    public int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map= new HashMap<>();
        int sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            sum+= arr[i];
            if(sum==0){
                max= i+1;
            }else{
                if(map.get(sum)!=null){
                    max= Math.max(max, i- map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }
        }
        return max;
    }
}
