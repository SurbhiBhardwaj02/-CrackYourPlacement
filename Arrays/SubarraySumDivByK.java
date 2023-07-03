package Arrayss;

import java.util.HashMap;

public class SubarraySumDivByK {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0;
        int rem=0;
        HashMap<Integer, Integer> map= new HashMap<>();
        // this map will store rem der and its frequency

        map.put(0,1);// initialize rem is 0, and its frequency is zero

        int ans=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            rem = sum%k;

            if(rem<0) rem+=k; // to make remainder positive

            if(map.containsKey(rem)){
                ans += map.get(rem);
                map.put(rem, map.get(rem)+1);
            }
            else{
                map.put(rem,1);
            }
        }
        return ans;

    }
}
