package RecursionWithArray;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchWithRecursion {


    static List<Integer> list =new ArrayList<>();
    static void search(int[] arr,int k,int i)
    {
        if(i==arr.length)
        {
            return ;
        }
        if(arr[i]==k)
        {
            list.add(i);
        }
        search(arr,k,i+1);

    }

    public static void main(String[] args) {
        int[] arr={3,2,1,2,2,2,2,2,2,18,9,2,2,2,2,1};
        int k=2;
        search(arr,k,0);
        System.out.println(list);
    }




}
