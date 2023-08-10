package MergeSort;

import java.util.Arrays;
public class Merge {
    public static void merge(int[] arr,int s,int e)
    {
        if(e-s ==1)
            return;

        int mid=(e+s)/2;

        merge(arr,s,mid);
        merge(arr,mid,e);

        mergeff(arr,s,mid,e);
    }
    public  static void mergeff(int[] arr,int start,int mid, int end)
    {
        int[] join= new int[end-start];
        int i=start,j=mid,k=0;
        while(i<mid && j<end){
            if (arr[i] < arr[j]) {
                join[k++] = arr[i++];
            }
            else
            {
                join[k++]=arr[j++];
            }
        }
        while(i<mid)
        {
            join[k++]= arr[i++];
        }
        while(j<end)
        {
            join[k++]=arr[j++];
        }

        for(int p=0;p<join.length;p++)
        {
            arr[start++]=join[p];
        }
    }


}
