package MergeSort;
import java.util.*;
public class NormalMerge {
    public static void main(String[] args)
    {
        int[] arr={34,325,6,2,62,68,317,884,9,2};
        int [] arrr=NormalMergeSort.mergeSort(arr);
        System.out.println(Arrays.toString(arrr));
    }

}
