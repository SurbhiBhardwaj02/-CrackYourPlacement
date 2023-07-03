package Arrayss;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={3,2,4,8};
        int target = 6;
        HashMap<Integer,Integer> map= new HashMap<>();
        int ans[]=new int[2];
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                ans[0]= map.get(arr[i]);
                ans[1]= i;
                break;
            }
            else{
                map.put(target- arr[i],i);
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(ans[i]);
        }

    }
}
