import java.io.*;
import java.util.*;

public class Solution {

    public static int MakeThreeStringsEqual(String s1,String s2,String s3,int sum)
    {

        int l1,l2,l3;
        l1=s1.length();
        l2=s2.length();
        l3=s3.length();
        int min =  Math.min(l1,(Math.min(l2,l3)));
        for(int i=0;i<min;i++)
        {
            if((s1.charAt(i)==s2.charAt(i))&&(s2.charAt(i)==s3.charAt(i)))
            {
                sum=sum-3;
            }
            else if((s1.charAt(0)!=s2.charAt(0))||(s2.charAt(0)!=s3.charAt(0)))
            {
                return -1;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= sc.nextLine();
        String s2= sc.nextLine();
        String s3= sc.nextLine();
        
        int len = s1.length() + s2.length() + s3.length();
        
        int sum=len;
        System.out.println(MakeThreeStringsEqual(s1,s2,s3,sum));
        
        
        
        
    }
}