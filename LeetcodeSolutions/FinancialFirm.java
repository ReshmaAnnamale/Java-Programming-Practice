import java.io.*;
import java.util.*;

public class FinancialFirm {

    public static boolean mono(int arr[],int n)
    {
        int i,d=0;
        for(i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
            {
                if(d==0)
                    d=1;
                else if(d==-1)
                    return false;
            }
            else if(arr[i]<arr[i-1])
            {
                if(d==0)
                    d=-1;
                else if(d==1)
                    return false;
            }
         }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(mono(arr,n));
        }
}