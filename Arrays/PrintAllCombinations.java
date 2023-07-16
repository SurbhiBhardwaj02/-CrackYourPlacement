package Arrayss;

import java.util.ArrayList;
import java.util.List;

public class PrintAllCombinations {

    public static void main(String[] args) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> temp= new ArrayList<>();
        int arr[]= {2,3,4,9,6};
        int k=3;
        generate(0,ans, temp,arr,k);
        System.out.println(ans);

    }
    private static void generate(int start,List<List<Integer>> ans,List<Integer> temp, int arr[],int k){
        if(temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            temp.add(arr[i]);
            generate(i+1,ans,temp,arr,k);
            temp.remove(temp.size()-1);
        }
    }
}
