package Heap;

import java.util.PriorityQueue;

public class SmallestPositivemissingnumber {
    //O(nlogn)| O(n)
    static void missingNumber1(int arr[], int size){
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<size;i++){
            if(arr[i]>0){
                pq.add(arr[i]);
            }
        }
        boolean flag= true;
        for(int i=0;i<size;i++){
            if(pq.poll()!=i+1) {
                flag=false;
                System.out.println(i + 1);
                break;
            }
        }
        if(flag)  System.out.println(size+1);
    }


    //OPTIMAL APPROACH O(n)/O(1)
    static int missingNumber(int arr[], int size)
    {
        int len = arr.length;

        //For each element, it checks if the element is within the valid range (greater than 0 and less than the
        // length of the array) and also checks if the element is not already in its correct position.

        for(int i = 0; i < len; i++) {
            while(arr[i] > 0 && arr[i] < len && arr[i] != arr[arr[i]-1]) {
                swap(i, arr[i]-1, arr);
            }
        }

        //Inside this loop, it checks if the value at each index is equal to the index plus one. If they are not
        // equal, it means that the number is missing.
        for(int i = 0; i < len; i++) {
            if(i+1 != arr[i]) return i+1;
        }
        return len+1;
    }

    static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        System.out.println(missingNumber(new int[]{-1,4,2,1,9,10},5));
        missingNumber1(new int[]{-1,4,2,1,9,10},5);
    }
}
