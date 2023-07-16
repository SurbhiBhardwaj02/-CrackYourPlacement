package Arrayss;

import java.util.ArrayList;

public class reversePairs {
    public static void main(String[] args) {
        int arr[]={2,4,3,5,1};
        System.out.println(revPairs(arr));
    }

    private static int revPairs(int[] arr) {
        return mergeSort(arr,0,arr.length-1);
    }

    private static int mergeSort(int[] arr, int low, int high) {
        if(low>=high) return 0;
        int mid=(low+high)/2;
        int ans= mergeSort(arr,low,mid);
        ans+= mergeSort(arr, mid+1, high);
        ans+= merge(arr, low, mid, high);
        return ans;
    }

    private static int merge(int[] arr, int low, int mid, int high) {
        int count=0;
        int j= mid+1;
        for(int i=low;i<=mid;i++){
            while(j<=high && arr[i]> (2*(long)arr[j])){
                j++;
            }
            count+= (j-(mid+1));
        }
        ArrayList<Integer> temp= new ArrayList<>();
        int left= low; int right= mid+1;
        while(left<=mid && right<= high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left++]);
            }
            else {
                temp.add(arr[right++]);
            }
        }
        if(left<=mid){
            temp.add(arr[left++]);
        }
        if(right<=high){
            temp.add(arr[right++]);
        }
        for(int i=low;i<=high;i++){
            arr[i]= temp.get(i-low);
        }
        return count;
    }
}
