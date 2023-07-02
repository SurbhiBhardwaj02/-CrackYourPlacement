package Arrayss;
//Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have
// a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:
//
//Each student gets one packet.
//The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum
// chocolates given to the students is minimum.
//Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5
//Output: Minimum Difference is 6

import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int arr[]={12, 4,  7,  9,  2,  23, 25, 41, 30,
                40, 28, 42, 30, 44, 48, 43, 50};
        int m=7;
        Arrays.sort(arr);
        int min_diff= Integer.MAX_VALUE;
        for(int i=0;i+m-1<arr.length;i++){
            int diff= arr[i+m-1]- arr[i];
            if(diff<min_diff){
                min_diff=diff;
            }

        }
        System.out.println(min_diff);

    }
}
