package Arrayss;

public class MaxPointYouCanObtainfromCards {
    public int maxScore(int[] cardPoints, int k) {
        int n= cardPoints.length;
        int left=0;
        int right= n-k;
        int sum=0;
        for(int i=right;i<n;i++){
            sum+=cardPoints[i];
        }
        int total=sum;
        while(right<cardPoints.length){
            total+= (cardPoints[left++]-cardPoints[right++]);

            sum= Math.max(total,sum);
        }
        return sum;
    }

}
