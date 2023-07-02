package Arrayss;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int temp=i;
            while(nums[temp]==0 && temp< nums.length-1){
                temp++;
            }
            if(temp!=i){
                nums[i]= nums[temp];
                nums[temp]=0;
            }

        }
    }
}
