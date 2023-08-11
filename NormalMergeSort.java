package MergeSort;
import java.util.Arrays;
public class NormalMergeSort {
    public static int[] mergeSort(int[] arr)
    {
        if(arr.length==1)
            return arr;

        int mid=arr.length/2;
        int[] left= mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return sortMerge(left,right);
    }
    public static int[] sortMerge(int[] left,int[] right)
    {
        int[] join= new int[left.length+right.length];
        int i=0,k=0,j=0;
        while(left.length>i&&right.length>j) {
            if (left[i] < right[j]) {
                join[k++] = left[i++];
            } else {
                join[k++] = right[j++];
            }
        }
        while(left.length>i)
        {
            join[k++]=left[i++];
        }
        while(right.length>j)
        {
            join[k++]=right[j++];
        }
        return join;
    }



}
