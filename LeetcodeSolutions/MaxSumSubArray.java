import java.io.*;
import java.util.*;

public class Solution {

    public static int MaxSumSubArray(int arr[],int n)
    {

        int current=arr[0];
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
                current+=arr[i];
            else
                current=arr[i];
            max=Math.max(max,current);
        }
        return max;
        
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(MaxSumSubArray(arr,n));
    }
}