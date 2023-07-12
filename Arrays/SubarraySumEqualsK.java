package Arrayss;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int prevsum=0;
        int count =0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prevsum+= nums[i];
            int remove=prevsum-k;
            count+= map.getOrDefault(remove,0);
            map.put(prevsum, map.getOrDefault(prevsum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,2,3,4,5,2,1},3));
    }
}
