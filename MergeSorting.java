package MergeSort;
import Demo.Merge;

import java.util.*;
public class MergeSorting {
    public static void main(String[] args)
    {
        int[] arr={5,10,34,57247,8,48,99,5,4,1,6,9,2,8};
        Merge.merge(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
